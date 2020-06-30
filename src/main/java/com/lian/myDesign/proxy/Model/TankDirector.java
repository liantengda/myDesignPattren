package com.lian.myDesign.proxy.Model;

import com.lian.myDesign.proxy.operation.Movable;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 17:48
 */
public class TankDirector implements Movable {
    Movable movable;

    public TankDirector(Movable movable){this.movable = movable;}
    @Override
    public void move() {
        System.out.println("坦克移动命令下达");
        movable.move();
    }
}
