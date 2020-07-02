package com.lian.myDesign.strategyPattern.orderhandler1.service;

import com.lian.myDesign.strategyPattern.orderhandler1.Model.Order;
import com.lian.myDesign.strategyPattern.orderhandler1.innocation.OrderHandlerType;
import com.lian.myDesign.strategyPattern.orderhandler1.util.ReflectUtil;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.util.*;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/1 21:33
 */
@Service
public class OrderServiceImpl implements OrderService {

    private final static OrderServiceImpl ORDER_SERVICE_IMPL = new OrderServiceImpl();

    private static final Map<String,OrderHandler> orderHandlerMap = new HashMap<>();

    public static OrderService getInstance(){
        return ORDER_SERVICE_IMPL;
    }

    public static void init(){
        List<Class> orderHandlers = ReflectUtil.getAllClassByInterface(OrderHandler.class);
        for (Class orderHandler:orderHandlers){
            Annotation[] annotations = orderHandler.getAnnotations();
            for (Annotation annotation:annotations){
                if(annotation instanceof OrderHandlerType){
                    try {
                        orderHandlerMap.put(((OrderHandlerType) annotation).source(),(OrderHandler) orderHandler.newInstance());
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }



    public void orderService(Order order){
        OrderHandler orderHandler = orderHandlerMap.get(order.getSource());
        orderHandler.handle(order);
    }



}
