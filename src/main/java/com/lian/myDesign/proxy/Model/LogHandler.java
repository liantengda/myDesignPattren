package com.lian.myDesign.proxy.Model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 17:46
 */
public class LogHandler implements InvocationHandler {

    Tank tank;

    public LogHandler(Tank tank){
        this.tank = tank;
    }

    public void  before(){
        System.out.println("method"  + "start...");
    }

    public void after(){
        System.out.println("method"  + "end...");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(tank, args);
        System.out.println("调用tank方法的返回结果是"+invoke);
        after();
        return invoke;
    }
}
