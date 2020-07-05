package com.lian.myDesign.builder;


import java.util.concurrent.LinkedBlockingDeque;

/**
 * 炮兵
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 9:40
 */
public class PaoBing extends AbstractBing{

    /**
     * 炮兵池，
     */
    private static final LinkedBlockingDeque<PaoBing> paoBingPoll= new LinkedBlockingDeque<>();

    static {
        for (int i =0 ;i<100;i++){
            PaoBing paoBing = new PaoBing();
            paoBing.id = i;
            paoBing.name = "炮兵";
            paoBing.avatar = "http://luoyefubuki.com";
            paoBing.liveState = 0;
            paoBingPoll.push(paoBing);
        }
    }


    private PaoBing(){

    }

    /**
     * 如果炮兵阵亡则回收到炮兵池
     */
    public void dead(){
        this.liveState = 0;
        paoBingPoll.push(this);
    }

    public static class PaoBingBuilder extends AbstractBingBuilder{

        private PaoBing paoBing;

        public PaoBing.PaoBingBuilder builderInitial(){
            paoBing = paoBingPoll.poll();
            paoBing.liveState = 1;
            return this;
        }

        public PaoBing.PaoBingBuilder builderMoveState(MoveState.MoveStateBuilder moveStateBuilder){
            paoBing.moveState = moveStateBuilder.build();
            return this;
        }

        public PaoBing.PaoBingBuilder Skin(Skin.SkinBuilder skinBuilder){
            paoBing.skin = skinBuilder.build();
            return this;
        }

        public PaoBing build(){
            return paoBing;
        }
    }
}
