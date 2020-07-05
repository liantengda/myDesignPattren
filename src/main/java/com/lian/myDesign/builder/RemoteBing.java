package com.lian.myDesign.builder;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 远程兵
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 9:38
 */
public class RemoteBing extends AbstractBing{

    /**
     * 远程兵池
     */
    private static final LinkedBlockingDeque<RemoteBing> remoteBingPool= new LinkedBlockingDeque<>();


    static {
        for (int i =0 ;i<100;i++){
            RemoteBing remoteBing = new RemoteBing();
            remoteBing.id = i;
            remoteBing.name = "远程兵";
            remoteBing.avatar = "http://luoyefubuki.com";
            remoteBing.liveState = 0;
            remoteBingPool.push(remoteBing);
        }
    }


    private RemoteBing(){

    }

    public static class RemoteBingBuilder extends AbstractBingBuilder{
        RemoteBing remoteBing;


        @Override
        public RemoteBingBuilder builderInitial() {
             remoteBing = remoteBingPool.poll();
             remoteBing.liveState=1;
            return this;
        }

        @Override
        public RemoteBingBuilder builderMoveState(MoveState.MoveStateBuilder moveStateBuilder) {
            remoteBing.moveState = moveStateBuilder.build();
            return this;
        }

        public RemoteBing.RemoteBingBuilder Skin(Skin.SkinBuilder skinBuilder){
            remoteBing.skin = skinBuilder.build();
            return this;
        }

        public RemoteBing build(){
            return remoteBing;
        }
    }
}
