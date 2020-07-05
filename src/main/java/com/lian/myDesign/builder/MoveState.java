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


    public float getFromPosX() {
        return fromPosX;
    }

    public void setFromPosX(float fromPosX) {
        this.fromPosX = fromPosX;
    }

    public float getFormPosY() {
        return formPosY;
    }

    public void setFormPosY(float formPosY) {
        this.formPosY = formPosY;
    }

    public float getToPosX() {
        return toPosX;
    }

    public void setToPosX(float toPosX) {
        this.toPosX = toPosX;
    }

    public float getToPosY() {
        return toPosY;
    }

    public void setToPosY(float toPosY) {
        this.toPosY = toPosY;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
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
        public MoveStateBuilder buildDragonMoveState(){
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
        public MoveStateBuilder buildTyrant(){
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
        public MoveStateBuilder buildBlueBuff(){
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
        public MoveStateBuilder buildRedBuff(){
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
        public MoveStateBuilder buildPig(){
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
        public MoveStateBuilder buildWolf(){
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
        public MoveStateBuilder buildEagle(){
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
        public MoveStateBuilder buildSnake(){
            moveState.fromPosX  = 1500;
            moveState.formPosY  = 3100;
            moveState.toPosX = 1500;
            moveState.toPosY = 3100;
            moveState.startTime = System.currentTimeMillis();
            return this;
        }


        /**
         * 构建小兵起始位移状态
         * @return
         */
        public MoveStateBuilder buildBing(){
            moveState.fromPosX  = 1600;
            moveState.formPosY  = 1000;
            moveState.toPosX = 3500;
            moveState.toPosY = 3500;
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
