package com.lian.myDesign.strategyPattern.orderhandler1;


import com.lian.myDesign.strategyPattern.orderhandler1.Model.Order;
import com.lian.myDesign.strategyPattern.orderhandler1.controller.OrderController;
import com.lian.myDesign.strategyPattern.orderhandler1.service.OrderServiceImpl;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/2 22:33
 */
public class Client1 {
    public static void main(String[] args) {
        OrderServiceImpl.init();
        OrderController orderController = OrderController.getInstance();
        Order pcOrder = new Order();
        pcOrder.setSource("pc");
        orderController.orderHandle(pcOrder);

        Order mobileOrder = new Order();
        mobileOrder.setSource("mobile");
        orderController.orderHandle(mobileOrder);

        Order mobileAliOrder = new Order();
        mobileAliOrder.setSource("mobileAli");
        orderController.orderHandle(mobileAliOrder);
    }
}
