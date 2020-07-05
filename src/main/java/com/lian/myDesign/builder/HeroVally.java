package com.lian.myDesign.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

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

        //蓝方阵营
        BlueSide blueSide = new BlueSide();
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
        blueSide.addHero(heroLiBai).addHero(heroMiyamotoMusashi).addHero(heroBuzhihuowu).addHero(heroChengyaojin).addHero(heroLuban);
        System.out.println("蓝方阵营");
        for (int i=0;i<blueSide.getBlueHero().size();i++){
            System.out.println(blueSide.getBlueHero().get(i));
        }
        //红方阵营
        RedSide redSide = new RedSide();
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
        redSide.addHero(heroLiubei).addHero(heroLiubang).addHero(heroBailishouyue).addHero(heroShangguanwaner).addHero(heroDaqiao);
        System.out.println("红方阵营");
        for (int i=0;i<redSide.getRedHero().size();i++){
            System.out.println(redSide.getRedHero().get(i));
        }
        System.out.println("全军出击");
        for (int i =0;i<3;i++){
            JinZhanBing mediumJinZhanBing = new JinZhanBing.JinZhanBingBuilder().builderInitial().
                    builderMoveState(new MoveState.MoveStateBuilder().buildMediumBingInitial()).
                    Skin(new Skin.SkinBuilder().builderJinzhanbingChristmas()).build();
            redSide.addBing(mediumJinZhanBing);
        }

        for (int i =0;i<1;i++){
            RemoteBing mediumRemoteBing = new RemoteBing.RemoteBingBuilder().builderInitial().
                    builderMoveState(new MoveState.MoveStateBuilder().buildMediumBingInitial()).
                    Skin(new Skin.SkinBuilder().builderJinzhanbingChristmas()).build();
            redSide.addBing(mediumRemoteBing);
        }

        for (int i =0;i<3;i++){
            JinZhanBing upJinZhanBing = new JinZhanBing.JinZhanBingBuilder().builderInitial().
                    builderMoveState(new MoveState.MoveStateBuilder().buildUpBingInitial()).
                    Skin(new Skin.SkinBuilder().builderJinzhanbingChristmas()).build();
            redSide.addBing(upJinZhanBing);
        }

        for (int i =0;i<1;i++){
            RemoteBing upRemoteBing = new RemoteBing.RemoteBingBuilder().builderInitial().
                    builderMoveState(new MoveState.MoveStateBuilder().buildUpBingInitial()).
                    Skin(new Skin.SkinBuilder().builderJinzhanbingChristmas()).build();
            redSide.addBing(upRemoteBing);
        }

        for (int i =0;i<3;i++){
            JinZhanBing downJinZhanBing = new JinZhanBing.JinZhanBingBuilder().builderInitial().
                    builderMoveState(new MoveState.MoveStateBuilder().buildDownBingInitial()).
                    Skin(new Skin.SkinBuilder().builderJinzhanbingChristmas()).build();
            redSide.addBing(downJinZhanBing);
        }

        for (int i =0;i<1;i++){
            RemoteBing downRemoteBing = new RemoteBing.RemoteBingBuilder().builderInitial().
                    builderMoveState(new MoveState.MoveStateBuilder().buildDownBingInitial()).
                    Skin(new Skin.SkinBuilder().builderJinzhanbingChristmas()).build();
            redSide.addBing(downRemoteBing);
        }

        System.out.println("红方小兵");
        for (int i=0;i<redSide.getRedBing().size();i++){
            System.out.println(redSide.getRedBing().get(i));
        }

        System.out.println("野怪出现");
        //中立阵营
        MediumSide mediumSide = new MediumSide();
        Monster magicPig = new Monster.MonsterBuilder().builderMagicPigBasicInfo().
                moveState(new MoveState.MoveStateBuilder().buildPigInitial()).
                Skin(new Skin.SkinBuilder().builderMagicPigChristmas()).build();

        Monster riverXiyi = new Monster.MonsterBuilder().builderRiverXiyiBasicInfo().
                moveState(new MoveState.MoveStateBuilder().buildTyrantInitial()).
               Skin(new Skin.SkinBuilder().builderXiyiChristmas()).build();

        Monster blueBuff = new Monster.MonsterBuilder().builderBlueBuff().
                moveState(new MoveState.MoveStateBuilder().buildBlueBuffInitial()).
                Skin(new Skin.SkinBuilder().builderBlueBuffChristmas()).build();
        Monster redBuff = new Monster.MonsterBuilder().builderRedBuff().
                moveState(new MoveState.MoveStateBuilder().buildRedBuffInitial()).
                Skin(new Skin.SkinBuilder().builderRedBuffChristmas()).build();
        System.out.println("中立生物");
        for (int i=0;i<mediumSide.getMonster().size();i++){
            System.out.println(mediumSide.getMonster().get(i));
        }
        System.out.println("黑暗暴君降临");
        Monster tyrant = new Monster.MonsterBuilder().builderTyrantBasicInfo().
                moveState(new MoveState.MoveStateBuilder().buildTyrantInitial()).
                Skin(new Skin.SkinBuilder().builderTyrantChristmas()).build();
        mediumSide.addMonster(magicPig).addMonster(riverXiyi).addMonster(blueBuff).addMonster(redBuff).addMonster(tyrant);

        System.out.println("中立生物");
        for (int i=0;i<mediumSide.getMonster().size();i++){
            System.out.println(mediumSide.getMonster().get(i));
        }
        System.out.println("炮车出击");

        PaoBing upPaoBing = new PaoBing.PaoBingBuilder().builderInitial().
                builderMoveState(new MoveState.MoveStateBuilder().buildUpBingInitial()).
                Skin(new Skin.SkinBuilder().builderPaoBingChristmas()).build();
        PaoBing mediumPaoBing = new PaoBing.PaoBingBuilder().builderInitial().
                builderMoveState(new MoveState.MoveStateBuilder().buildMediumBingInitial()).
                Skin(new Skin.SkinBuilder().builderPaoBingChristmas()).build();
        PaoBing downPaoBing = new PaoBing.PaoBingBuilder().builderInitial().
                builderMoveState(new MoveState.MoveStateBuilder().buildDownBingInitial()).
                Skin(new Skin.SkinBuilder().builderPaoBingChristmas()).build();
        redSide.addBing(upPaoBing).addBing(mediumPaoBing).addBing(downPaoBing);

        System.out.println("红方小兵");
        for (int i=0;i<redSide.getRedBing().size();i++){
            System.out.println(redSide.getRedBing().get(i));
        }

        System.out.println("风暴龙王降临，决战开始");
        Monster stormDragon = new Monster.MonsterBuilder().builderStormDragonBasicInfo().
                moveState(new MoveState.MoveStateBuilder().buildDragonMoveStateInitial()).
                Skin(new Skin.SkinBuilder().builderStormDragonChristmas()).build();
        mediumSide.addMonster(stormDragon);

        System.out.println("中立生物");
        for (int i=0;i<mediumSide.getMonster().size();i++){
            System.out.println(mediumSide.getMonster().get(i));
        }

        System.out.println("我方出动超级士兵");

        SuperBing upSuperBing = new SuperBing.SuperBingBuilder().builderInitial().
                builderMoveState(new MoveState.MoveStateBuilder().buildUpBingInitial()).
                Skin(new Skin.SkinBuilder().builderSuperBingChristmas()).build();

        SuperBing mediumSuperBing = new SuperBing.SuperBingBuilder().builderInitial().
                builderMoveState(new MoveState.MoveStateBuilder().buildMediumBingInitial()).
                Skin(new Skin.SkinBuilder().builderSuperBingChristmas()).build();

        SuperBing downSuperBing = new SuperBing.SuperBingBuilder().builderInitial().
                builderMoveState(new MoveState.MoveStateBuilder().buildDownBingInitial()).
                Skin(new Skin.SkinBuilder().builderSuperBingChristmas()).build();
        redSide.addBing(upSuperBing).addBing(mediumSuperBing).addBing(downSuperBing);
        System.out.println("红方小兵");
        for (int i=0;i<redSide.getRedBing().size();i++){
            System.out.println(redSide.getRedBing().get(i));
        }
    }

}
