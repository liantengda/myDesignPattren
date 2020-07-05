package com.lian.myDesign.builder;

import java.math.BigDecimal;

/**
 * 构建者设计模式，主要目的就是构建复杂对象的，所以我们需要提前搞一个复杂对象出来
 *
 * 这种模式
 *  一方面可以建造一个对象某些可复用的部分
 *  一方面可以规范对象的构建过程，将复杂对象分为几个部分，每个部分必须传递的参数有哪些，可以避免粗心大意导致对象部件缺失
 * @author Ted
 * @version 1.0
 * @date 2020/7/4 22:03
 */
public class Monster {
    //基本信息
    private Integer id;
    private String name;
    private String avatar;

    //移动信息
    private MoveState moveState;

    //皮肤
    private Skin skin;

    private Monster(){

    }

    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", moveState=" + moveState +
                ", skin=" + skin +
                '}';
    }

    public static class MonsterBuilder{
        Monster monster = new Monster();

        public MonsterBuilder basicInfo(Integer id, String name, String avatar){
            monster.id = id;
            monster.name = name;
            monster.avatar = avatar;
            return this;
        }


        public MonsterBuilder builderStormDragonBasicInfo(){
            monster.id = 100;
            monster.name = "风暴龙王";
            monster.avatar = "http://luoyefubuki.com/stromDragon";
            return this;
        }

        public MonsterBuilder builderMagicPigBasicInfo(){
            monster.id = 101;
            monster.name = "魔种野猪";
            monster.avatar = "http://luoyefubuki.com/magicPig";
            return this;
        }

        public MonsterBuilder builderRiverXiyiBasicInfo(){
            monster.id = 102;
            monster.name = "河道蜥蜴";
            monster.avatar = "http://luoyefubuki.com/riverXiyi";
            return this;
        }

        public MonsterBuilder builderTyrantBasicInfo(){
            monster.id = 103;
            monster.name = "黑暗暴君";
            monster.avatar = "http://luoyefubuki.com/tyrant";
            return this;
        }

        public MonsterBuilder builderBlueBuff(){
            monster.id = 104;
            monster.name = "蓝buff";
            monster.avatar = "http://luoyefubuki.com/blueBuff";
            return this;
        }

        public MonsterBuilder builderRedBuff(){
            monster.id = 105;
            monster.name = "红buff";
            monster.avatar = "http://luoyefubuki.com/redBuff";
            return this;
        }


        public MonsterBuilder moveState(MoveState.MoveStateBuilder moveStateBuilder){
            monster.moveState = moveStateBuilder.build();
            return this;
        }


        public MonsterBuilder Skin(Skin.SkinBuilder skinBuilder){
            monster.skin = skinBuilder.build();
            return this;
        }

        public Monster build(){
            return monster;
        }
    }
}
