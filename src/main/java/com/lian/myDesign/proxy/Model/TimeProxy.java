package com.lian.myDesign.proxy.Model;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 17:35
 */
public class TimeProxy {
    public void before(){
        System.out.println("method start.."+System.currentTimeMillis());
    }

    public void after(){
        System.out.println("method stop.."+System.currentTimeMillis());
    }
}
