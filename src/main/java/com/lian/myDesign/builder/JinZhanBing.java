package com.lian.myDesign.builder;

import java.math.BigDecimal;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 近战兵
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 9:38
 */
public class JinZhanBing extends AbstractBing {

    /**
     * 近战兵池
     */
    private static final LinkedBlockingDeque<JinZhanBing> jinZhanBingPool= new LinkedBlockingDeque<>();

    static {
        for (int i =1 ;i<=100;i++){
            JinZhanBing jinZhanBing = new JinZhanBing();
            jinZhanBing.id = i;
            jinZhanBing.name = "近战兵";
            jinZhanBing.avatar = "http://luoyefubuki.com";
            jinZhanBing.liveState = 0;
            jinZhanBingPool.push(jinZhanBing);
        }
    }

    private JinZhanBing(){

    }

    public static class JinZhanBingBuilder extends AbstractBingBuilder{
        JinZhanBing jinZhanBing ;


        @Override
        public JinZhanBingBuilder builderInitial() {
            System.out.println("近战兵出击+1");
            jinZhanBing = jinZhanBingPool.poll();
            jinZhanBing.liveState = 1;
            return this;
        }

        @Override
        public JinZhanBingBuilder builderMoveState(MoveState.MoveStateBuilder moveStateBuilder) {
            jinZhanBing.moveState = moveStateBuilder.build();
            return this;
        }

        public JinZhanBing.JinZhanBingBuilder Skin(Skin.SkinBuilder skinBuilder){

            jinZhanBing.skin = skinBuilder.build();
            return this;
        }

        public JinZhanBing build(){
            return jinZhanBing;
        }
    }
}
