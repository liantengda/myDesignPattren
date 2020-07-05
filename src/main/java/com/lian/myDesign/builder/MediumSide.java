package com.lian.myDesign.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 中立生物
 * @author Ted
 * @version 1.0
 * @date 2020/7/5 21:38
 */
public class MediumSide {

    private  final List<Monster> monster = new ArrayList<>();


    public MediumSide addMonster(Monster monster){
        this.monster.add(monster);
        return this;
    }


    public List<Monster> getMonster(){
        return this.monster;
    }


}
