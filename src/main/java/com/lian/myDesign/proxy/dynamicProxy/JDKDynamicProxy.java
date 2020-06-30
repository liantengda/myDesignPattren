package com.lian.myDesign.proxy.dynamicProxy;


import com.lian.myDesign.proxy.Model.LogHandler;
import com.lian.myDesign.proxy.Model.Tank;
import com.lian.myDesign.proxy.operation.Movable;

import java.lang.reflect.Proxy;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 15:26
 */
public class JDKDynamicProxy {

    static {

    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Movable proxy = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class},
                 new LogHandler(tank));
        proxy.move();


        Movable proxyInstance = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, (proxy1, method1, args1) -> {
            Long startTime = System.currentTimeMillis();
            Object invoke = method1.invoke(tank, args1);
            Long endTime = System.currentTimeMillis();
            System.out.println("tank move时间" + (endTime - startTime));
            return invoke;
        });
        proxyInstance.move();
    }
}





