package com.lian.myDesign.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 蓝方阵营
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 21:37
 */
public class BlueSide {

    private  final List<Hero> blueHero = new ArrayList<>();
    private final List<AbstractBing> blueBing = new ArrayList<>();

    public  BlueSide addHero(Hero hero){
        this.blueHero.add(hero);
        return this;
    }

    public BlueSide addBing(AbstractBing bing){
        this.blueBing.add(bing);
        return this;
    }

    public List<Hero> getBlueHero(){
        return this.blueHero;
    }

    public List<AbstractBing> getBlueBing(){
        return this.blueBing;
    }
}
