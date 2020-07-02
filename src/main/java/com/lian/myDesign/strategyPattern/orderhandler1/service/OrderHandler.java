package com.lian.myDesign.strategyPattern.orderhandler1.service;

import com.lian.myDesign.strategyPattern.orderhandler1.Model.Order;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/1 21:35
 */
public interface OrderHandler {
    void handle(Order order);
}
