package com.lian.myDesign.strategyPattern.orderhandler2.controller;


import com.lian.myDesign.strategyPattern.orderhandler2.Model.Order;
import com.lian.myDesign.strategyPattern.orderhandler2.service.OrderService;
import com.lian.myDesign.strategyPattern.orderhandler2.service.OrderServiceImpl;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/1 22:04
 */

public class OrderController {

    private static final OrderController orderController = new OrderController();

    public static OrderController getInstance(){
        return orderController;
    }

    public void orderHandle(Order order){
        OrderService instance = OrderServiceImpl.getInstance();
        instance.orderService(order);
    }

}
