package com.lian.myDesign.strategyPattern.orderhandler1.service;

import com.lian.myDesign.strategyPattern.orderhandler1.Model.Order;
import com.lian.myDesign.strategyPattern.orderhandler1.innocation.OrderHandlerType;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/2 22:38
 */
@OrderHandlerType(source = "PCAli")
public class PCAliHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("pc端阿里支付");
    }
}
