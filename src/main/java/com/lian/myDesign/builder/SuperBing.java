package com.lian.myDesign.builder;

import java.math.BigDecimal;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 超级兵
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 9:40
 */
public class SuperBing extends AbstractBing {

    /**
     * 超级士兵池
     */
    private static final LinkedBlockingDeque<SuperBing> superBingPool= new LinkedBlockingDeque<>();


    static {
        for (int i=0;i<100;i++){
            SuperBing superBing = new SuperBing();
            superBing.id = i;
            superBing.avatar = "http://luoyefubuki.com/super.jpg";
            superBing.name="超级士兵";
            superBing.liveState = 0;
            superBingPool.push(superBing);
        }
    }

    private SuperBing(){

    }

    public static class SuperBingBuilder extends AbstractBingBuilder{

        private SuperBing superBing;


        @Override
        public SuperBingBuilder builderInitial() {
            superBing = superBingPool.poll();
            superBing.liveState = 1;
            return this;
        }

        @Override
        public SuperBingBuilder builderMoveState(MoveState.MoveStateBuilder moveStateBuilder) {
            superBing.moveState = moveStateBuilder.build();
            return this;
        }

        public SuperBingBuilder Skin(Skin.SkinBuilder skinBuilder){
            superBing.skin = skinBuilder.build();
            return this;
        }

        public SuperBing build(){
            return superBing;
        }
    }
}
