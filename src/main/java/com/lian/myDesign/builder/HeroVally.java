package com.lian.myDesign.builder;

import java.math.BigDecimal;

/**
 * 欢迎来到英雄峡谷
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 9:20
 */
public class HeroVally {

    public static void main(String[] args) {

        System.out.println("欢迎来到英雄峡谷");
        //我方英雄起始位移状态
        MoveState.MoveStateBuilder ourHeroOriginMoveStateBuilder = new MoveState.MoveStateBuilder().buildOurHeroOriginMoveState();
        //敌方英雄起始位移状态
        MoveState.MoveStateBuilder enemyHeroOriginMoveStateBuilder = new MoveState.MoveStateBuilder().buildEnemyHeroOriginMoveState();
        //小兵起始位移状态
        MoveState.MoveStateBuilder xiaobingOriginMoveStateBuilder = new MoveState.MoveStateBuilder().buildBing();

        //我方阵营
        Hero heroLiBai = new Hero.HeroBuilder().basicInfo(1,"李白","李白.jpg").
                moveState(ourHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderLibaiTiShanBaiHu()).build();

        Hero heroMiyamotoMusashi = new Hero.HeroBuilder().basicInfo(2,"宮本武蔵","宮本武蔵.jpg").
                moveState(ourHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderMiyamotoMusashi()).build();

        Hero heroLuban = new Hero.HeroBuilder().basicInfo(2,"鲁班大师","鲁班大师.jpg").
                moveState(ourHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderLuBanGreen()).build();
        Hero heroBuzhihuowu = new Hero.HeroBuilder().basicInfo(2,"不知火舞","不知火舞.jpg").
                moveState(ourHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderBuzhihuowuXioxuesheng()).build();
        Hero heroChengyaojin = new Hero.HeroBuilder().basicInfo(2,"程咬金","程咬金.jpg").
                moveState(ourHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderChenyaojinLeiguzhanjinshan()).build();
        //敌方阵营
        Hero heroLiubei = new Hero.HeroBuilder().basicInfo(2,"刘备","刘备.jpg").
                moveState(enemyHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderLiubeiCaomin()).build();
        Hero heroLiubang = new Hero.HeroBuilder().basicInfo(2,"刘邦","刘邦.jpg").
                moveState(enemyHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderLiubangGoldenArm()).build();
        Hero heroBailishouyue = new Hero.HeroBuilder().basicInfo(2,"百里守约","百里守约.jpg").
                moveState(enemyHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderBailishouyueMeiyingwuxing()).build();
        Hero heroShangguanwaner = new Hero.HeroBuilder().basicInfo(2,"上官婉儿","上官婉儿.jpg").
                moveState(enemyHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderShangGuanTianyamoke()).build();
        Hero heroDaqiao = new Hero.HeroBuilder().basicInfo(2,"大乔","大乔.jpg").
                moveState(enemyHeroOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderDaqiaoTiannvsanhua()).build();

        System.out.println("全军出击");

        JinZhanBing jinZhanBing = new JinZhanBing.JinZhanBingBuilder().builderInitial().
                builderMoveState(xiaobingOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderJinzhanbingChristmas()).build();

        RemoteBing remoteBing = new RemoteBing.RemoteBingBuilder().builderInitial().
                builderMoveState(xiaobingOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderRemoteBingChristmas()).build();

        System.out.println("野怪出现");

        Monster magicPig = new Monster.MonsterBuilder().basicInfo(101, "魔种野猪", "魔种野猪.jpg").
                moveState(new MoveState.MoveStateBuilder().buildPig()).
                Skin("圣诞快乐", new BigDecimal("0.00")).build();

        Monster riverXiyi = new Monster.MonsterBuilder().basicInfo(102, "河道蜥蜴", "河道蜥蜴.jpg").
                moveState(new MoveState.MoveStateBuilder().buildTyrant()).
               Skin("圣诞快乐", new BigDecimal("0.00")).build();

        System.out.println("炮车出击");

        PaoBing paoBing = new PaoBing.PaoBingBuilder().builderInitial().
                builderMoveState(xiaobingOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderPaoBingChristmas()).build();

        System.out.println("风暴龙王降临，决战开始");
        Monster StormDragon = new Monster.MonsterBuilder().basicInfo(100,"风暴龙王","暴风龙王.jpg").
                moveState(new MoveState.MoveStateBuilder().buildDragonMoveState()).
                Skin("末日审判",new BigDecimal("0.00")).build();

        System.out.println("我方出动超级士兵");

        AbstractBing superBing = new SuperBing.SuperBingBuilder().builderInitial().
                builderMoveState(xiaobingOriginMoveStateBuilder).
                Skin(new Skin.SkinBuilder().builderSuperBingChristmas()).build();

    }

}
