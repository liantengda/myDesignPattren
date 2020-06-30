package com.lian.myDesign.proxy.staticProxy;

import com.lian.myDesign.proxy.Model.Tank;
import com.lian.myDesign.proxy.Model.TankDirector;
import com.lian.myDesign.proxy.Model.TankObserver;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 12:46
 */
public class StaticProxy {
    public static void main(String[] args) {
      new TankDirector(new TankObserver(new Tank())).move();
    }
}


