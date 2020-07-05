package com.lian.myDesign.builder;

/**
 * 用户的移动状态，某一时刻，从哪里准备走到哪里
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 8:39
 */
public class MoveState {
    private float fromPosX;
    private float formPosY;
    private float toPosX;
    private float toPosY;
    private long startTime;

    private MoveState(){

    }

    @Override
    public String toString() {
        return "MoveState{" +
                "fromPosX=" + fromPosX +
                ", formPosY=" + formPosY +
                ", toPosX=" + toPosX +
                ", toPosY=" + toPosY +
                ", startTime=" + startTime +
                '}';
    }

    public static class MoveStateBuilder{
        MoveState moveState = new MoveState();

        /**
         * 实时构建地点
         * @param fromPosX
         * @param formPosY
         * @param toPosX
         * @param toPosY
         * @param startTime
         * @return
         */
        public MoveStateBuilder buildRealTimeMoveState( float fromPosX,
                float formPosY,
                float toPosX,
                float toPosY,
               long startTime){
            moveState.fromPosX = fromPosX;
            moveState.formPosY = formPosY;
            moveState.toPosX = toPosX;
            moveState.toPosY = toPosY;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 构建我方英雄起始地点
         * @return
         */
        public MoveStateBuilder buildOurHeroOriginMoveState(){
            moveState.fromPosX  = 0;
            moveState.formPosY  = 0;
            moveState.toPosX = 0;
            moveState.toPosY = 0;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 构建敌方英雄起始地点
         * @return
         */
        public MoveStateBuilder buildEnemyHeroOriginMoveState(){
            moveState.fromPosX  = 7000;
            moveState.formPosY  = 7000;
            moveState.toPosX = 7000;
            moveState.toPosY = 7000;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 大龙地点
         * @return
         */
        public MoveStateBuilder buildDragonMoveStateInitial(){
            moveState.fromPosX  = 3000;
            moveState.formPosY  = 4000;
            moveState.toPosX = 3000;
            moveState.toPosY = 4000;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 暴君地点
         * @return
         */
        public MoveStateBuilder buildTyrantInitial(){
            moveState.fromPosX  = 4000;
            moveState.formPosY  = 1000;
            moveState.toPosX = 4000;
            moveState.toPosY = 1000;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 蓝buff地点
         * @return
         */
        public MoveStateBuilder buildBlueBuffInitial(){
            moveState.fromPosX  = 2000;
            moveState.formPosY  = 3000;
            moveState.toPosX = 2000;
            moveState.toPosY = 3000;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 红buff地点
         * @return
         */
        public MoveStateBuilder buildRedBuffInitial(){
            moveState.fromPosX  = 3000;
            moveState.formPosY  = 1500;
            moveState.toPosX = 3000;
            moveState.toPosY = 1500;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 野猪地点
         * @return
         */
        public MoveStateBuilder buildPigInitial(){
            moveState.fromPosX  = 2800;
            moveState.formPosY  = 2000;
            moveState.toPosX = 2800;
            moveState.toPosY = 2000;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 三狼地点
         * @return
         */
        public MoveStateBuilder buildWolfInitial(){
            moveState.fromPosX  = 1800;
            moveState.formPosY  = 2500;
            moveState.toPosX = 1800;
            moveState.toPosY = 2500;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 构建鹰地点
         * @return
         */
        public MoveStateBuilder buildEagleInitial(){
            moveState.fromPosX  = 4800;
            moveState.formPosY  = 1000;
            moveState.toPosX = 4800;
            moveState.toPosY = 1000;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 构建蜥蜴地点
         * @return
         */
        public MoveStateBuilder buildSnakeInitial(){
            moveState.fromPosX  = 1500;
            moveState.formPosY  = 3100;
            moveState.toPosX = 1500;
            moveState.toPosY = 3100;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }


        /**
         * 构建中路小兵起始位移状态
         * @return
         */
        public MoveStateBuilder buildMediumBingInitial(){
            moveState.fromPosX  = 1600;
            moveState.formPosY  = 1000;
            moveState.toPosX = 3500;
            moveState.toPosY = 3500;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 构建上路小兵起始位移状态
         * @return
         */
        public MoveStateBuilder buildUpBingInitial(){
            moveState.fromPosX  = 200;
            moveState.formPosY  = 1800;
            moveState.toPosX = 300;
            moveState.toPosY = 7000;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 构建下路小兵起始位移状态
         * @return
         */
        public MoveStateBuilder buildDownBingInitial(){
            moveState.fromPosX  = 1800;
            moveState.formPosY  = 200;
            moveState.toPosX = 7000;
            moveState.toPosY = 300;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }

        /**
         * 创建地点
         * @return
         */
        public MoveState build(){
            return moveState;
        }
    }
}
