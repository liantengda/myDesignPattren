package com.lian.myDesign.proxy.Model;

import com.lian.myDesign.proxy.operation.Movable;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 17:44
 */
public class Tank implements Movable {

    public Tank(){

    }

    @Override
    public void move() {
        System.out.println("坦克移动");
    }
}
