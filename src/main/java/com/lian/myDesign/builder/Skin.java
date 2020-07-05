package com.lian.myDesign.builder;

import java.math.BigDecimal;

/**
 * 皮肤
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 9:04
 */
public class Skin {

    private static final String PHYSICAL_ATTACK = "物理攻击力+10";
    private static final String MAGIC_ATTACK = "魔法攻击力+10";

    private String name;
    private String skinFunction;
    private BigDecimal price;
    private String imagePath;


    private Skin(){}

    @Override
    public String toString() {
        return "Skin{" +
                "name='" + name + '\'' +
                ", skinFunction='" + skinFunction + '\'' +
                ", price=" + price +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }

    public static class SkinBuilder{
        Skin skin = new Skin();

        public SkinBuilder builderLibaiTiShanBaiHu(){
            skin.name = "天山雪狐";
            skin.price = new BigDecimal("100000000.00");
            skin.skinFunction = PHYSICAL_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderMiyamotoMusashi(){
            skin.name = "末日机甲";
            skin.price = new BigDecimal("100000000.00");
            skin.skinFunction = PHYSICAL_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderLuBanGreen(){
            skin.name = "小绿人";
            skin.price = new BigDecimal("100000000.00");
            skin.skinFunction = PHYSICAL_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderChenyaojinLeiguzhanjinshan(){
            skin.name = "擂鼓战金山";
            skin.price = new BigDecimal("100000000.00");
            skin.skinFunction = PHYSICAL_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderBuzhihuowuXioxuesheng(){
            skin.name = "小学生";
            skin.price = new BigDecimal(100000000.00);
            skin.skinFunction = MAGIC_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderLiubeiCaomin(){
            skin.name = "草民";
            skin.price = new BigDecimal(100000000.00);
            skin.skinFunction = PHYSICAL_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderShangGuanTianyamoke(){
            skin.name = "天涯墨客";
            skin.price = new BigDecimal("100000000.00");
            skin.skinFunction = MAGIC_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderBailishouyueMeiyingwuxing(){
            skin.name = "百里守约";
            skin.price = new BigDecimal("100000000.00");
            skin.skinFunction = PHYSICAL_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderLiubangGoldenArm(){
            skin.name = "黄金战甲";
            skin.price = new BigDecimal("100000000.00");
            skin.skinFunction = PHYSICAL_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderDaqiaoTiannvsanhua(){
            skin.name = "天女散花";
            skin.price = new BigDecimal("100000000.00");
            skin.skinFunction = MAGIC_ATTACK;
            skin.imagePath = "http://luoyefubuki.com";
            return this;
        }

        public SkinBuilder builderJinzhanbingChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/bing/1";
            return this;
        }

        public SkinBuilder builderRemoteBingChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/bing/=2";
            return this;
        }

        public SkinBuilder builderPaoBingChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/bing/3";
            return this;
        }

        public SkinBuilder builderSuperBingChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/bing/4";
            return this;
        }

        public SkinBuilder builderBlueBuffChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/buff/blue";
            return this;
        }

        public SkinBuilder builderRedBuffChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/buff/red";
            return this;
        }

        public SkinBuilder builderMagicPigChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/magicPig";
            return this;
        }

        public SkinBuilder builderStormDragonChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/stormDragon";
            return this;
        }

        public SkinBuilder builderTyrantChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/tyrant";
            return this;
        }

        public SkinBuilder builderXiyiChristmas(){
            skin.name = "圣诞快乐";
            skin.price = new BigDecimal("0.00");
            skin.skinFunction = "好看";
            skin.imagePath = "http://louyefubuki.com/xiyi";
            return this;
        }



        public Skin build(){
            return skin;
        }
    }
}
