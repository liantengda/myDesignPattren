package com.lian.myDesign.strategyPattern.orderhandler1.service;

import com.lian.myDesign.strategyPattern.orderhandler1.Model.Order;
import com.lian.myDesign.strategyPattern.orderhandler1.innocation.OrderHandlerType;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/1 21:36
 */
@OrderHandlerType(source = "mobile")
public class MobileOrderHandler implements OrderHandler {

    @Override
    public void handle(Order order) {
        System.out.println("移动端订单处理逻辑");
    }
}
