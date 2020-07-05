package com.lian.myDesign.builder;

import java.math.BigDecimal;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 9:03
 */
public class Hero {
    //基本信息
    private Integer id;
    private String name;
    private String avatar;

    //移动信息
    private MoveState moveState;

    //皮肤
    private Skin skin;


    private Hero(){

    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", moveState=" + moveState +
                ", skin=" + skin +
                '}';
    }

    public static class HeroBuilder{
        Hero hero = new Hero();

        public HeroBuilder basicInfo(Integer id,String name,String avatar){
            hero.id = id;
            hero.name = name;
            hero.avatar = avatar;
            return this;
        }

        public HeroBuilder moveState(MoveState.MoveStateBuilder moveStateBuilder){
            hero.moveState = moveStateBuilder.build();
            return this;
        }

        public HeroBuilder Skin(Skin.SkinBuilder skinBuilder){
            hero.skin = skinBuilder.build();
            return this;
        }

        public Hero build(){
            return hero;
        }
    }
}
