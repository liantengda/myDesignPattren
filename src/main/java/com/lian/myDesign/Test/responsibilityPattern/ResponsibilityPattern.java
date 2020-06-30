package com.lian.myDesign.Test.responsibilityPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 根据标签筛选课程，好像可以使用责任链设计模式。
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 8:23
 */
public class ResponsibilityPattern {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.msg = "大家好，我们的国家真伟大，欢迎访问我爱我的家.com，大家都是996,真是日了狗了";

        FilterChain filterChain1 = new FilterChain();
        Filter nineFilter = new NineFilter();
        Filter riDogFilter = new RiDogFilter();
        filterChain1.add(nineFilter);
        filterChain1.add(new CountryFilter());


        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(riDogFilter);

        filterChain1.add(filterChain2);

        filterChain1.doFilter(msg);

        System.out.println(msg.msg);
    }



}

class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<Filter>();

    public void add(Filter f) {
        filters.add(f);
    }

    public boolean doFilter(Msg msg){
        for (Filter filter:filters){
            if(!filter.doFilter(msg)) return false;
        }
        return true;
    }
}

interface Filter{
    boolean doFilter(Msg msg);
}

class NineFilter implements Filter{

    @Override
    public boolean doFilter(Msg msg) {
        msg.msg = msg.msg.replace("996","***");
        return true;
    }
}

class RiDogFilter implements Filter{

    @Override
    public boolean doFilter(Msg msg) {
        msg.msg = msg.msg.replace("日了狗了","*了狗了");
        return true;
    }
}

class CountryFilter implements Filter{

    @Override
    public boolean doFilter(Msg msg) {
        msg.msg = msg.msg.replace("国家","**");
        return false;
    }
}

class Msg{
    public String msg;
}

