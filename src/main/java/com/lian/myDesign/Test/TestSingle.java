package com.lian.myDesign.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 饿汉式单例模式的解决办法
 * @author Ted
 * @version 1.0
 * @date 2020/6/28 21:03
 */
public class TestSingle {

    private static volatile TestSingle INSTANCE ;//防止指令重排
    private static AtomicInteger COUNT = new AtomicInteger(0);
    private static Integer num = 1;
    private TestSingle(){

    }

    public static TestSingle getInstance(){
        if(INSTANCE == null){
            System.out.println("第"+COUNT.addAndGet(1)+"个线程来竞争锁");
            synchronized (COUNT){
                if(INSTANCE == null){
                    INSTANCE = new TestSingle();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                TestSingle instance = getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }

        for (int i=0;i<100;i++){
            new Thread(()->{
                num++;
            }).start();
        }
        System.out.println(num);
    }
}
