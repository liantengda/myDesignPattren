package com.lian.myDesign.strategyPattern.orderhandler2.service;


import com.lian.myDesign.strategyPattern.orderhandler2.Model.Order;
import com.lian.myDesign.strategyPattern.orderhandler2.innocation.OrderHandlerType;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/2 22:37
 */
@OrderHandlerType(source = "mobile",payMethod = "ali")
public class MobileAliHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("移动端阿里支付");
    }
}
