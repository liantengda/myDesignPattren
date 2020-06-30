package com.lian.myDesign.proxy.dynamicProxy;

import com.lian.myDesign.proxy.Model.Tank;
import com.lian.myDesign.proxy.Model.TimeMethodInterceptor;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 17:03
 */
public class CglibDynamicProxy {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}



