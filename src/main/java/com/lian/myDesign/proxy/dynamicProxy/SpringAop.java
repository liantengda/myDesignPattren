package com.lian.myDesign.proxy.dynamicProxy;

import com.lian.myDesign.proxy.operation.Movable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 17:28
 */

public class SpringAop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Movable tank = (Movable) context.getBean("tank");
        tank.move();
//        Tank tank = (Tank)context.getBean("tank");
//        tank.move();
    }
}
