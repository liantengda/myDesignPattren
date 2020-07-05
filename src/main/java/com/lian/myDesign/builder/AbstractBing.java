package com.lian.myDesign.builder;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 16:26
 */
public abstract class AbstractBing {
    //基本信息
    protected Integer id;
    protected String name;
    protected String avatar;

    //存活状态  0表示不存活，1表示存活
    protected Integer liveState;

    //移动信息
    protected MoveState moveState;

    //皮肤
    protected Skin skin;
    
    public static abstract class AbstractBingBuilder{

        public abstract AbstractBingBuilder builderInitial();

        public abstract AbstractBingBuilder builderMoveState(MoveState.MoveStateBuilder moveStateBuilder);

        public abstract AbstractBingBuilder Skin(Skin.SkinBuilder skinBuilder);

        public abstract AbstractBing build();
    }
}
