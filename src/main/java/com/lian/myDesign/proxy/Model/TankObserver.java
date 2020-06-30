package com.lian.myDesign.proxy.Model;

import com.lian.myDesign.proxy.operation.Movable;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 17:48
 */
public class TankObserver implements Movable {
    Movable movable;
    public TankObserver(Movable movable){
        this.movable = movable;
    }
    @Override
    public void move(){
        movable.move();
        System.out.println("坦克移动观察");
    }
}
