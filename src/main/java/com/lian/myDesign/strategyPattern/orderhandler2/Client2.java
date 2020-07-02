package com.lian.myDesign.strategyPattern.orderhandler2;


import com.lian.myDesign.strategyPattern.orderhandler2.Model.Order;
import com.lian.myDesign.strategyPattern.orderhandler2.controller.OrderController;
import com.lian.myDesign.strategyPattern.orderhandler2.service.OrderServiceImpl;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/2 22:33
 */
public class Client2 {
    public static void main(String[] args) {
        OrderServiceImpl.init();
        OrderController orderController = OrderController.getInstance();
        Order pcOrder = new Order();
        pcOrder.setSource("PC");
        pcOrder.setPayMethod("ali");
        orderController.orderHandle(pcOrder);

        Order mobileOrder = new Order();
        mobileOrder.setSource("mobile");
        mobileOrder.setPayMethod("ali");
        orderController.orderHandle(mobileOrder);
    }
}
