package com.lian.myDesign.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 红方阵营
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 21:38
 */
public class RedSide {

    private  final List<Hero> redHero = new ArrayList<>();
    private final List<AbstractBing> redBing = new ArrayList<>();

    public  RedSide addHero(Hero hero){
        this.redHero.add(hero);
        return this;
    }

    public RedSide addBing(AbstractBing bing){
        this.redBing.add(bing);
        return this;
    }

    public List<Hero> getRedHero(){
        return this.redHero;
    }

    public List<AbstractBing> getRedBing(){
        return this.redBing;
    }
}
