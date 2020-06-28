package com.lian.myDesign.Test;

import com.lian.myDesign.model.User;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/28 21:22
 */
public enum  EnumSingle {
    INSTANCE;

    public User getUserById(Long userId){
        User user = new User();
        user.setId(1L);
        user.setName("哈哈");
        user.setPassword("222222");
        user.setPhone("18434365574");
        return user;
    }

    public static void main(String[] args) {
        for (int i = 0;i<100;i++){
            new Thread(()->{
                System.out.println(INSTANCE.hashCode());
                User userById = EnumSingle.INSTANCE.getUserById(1L);
                System.out.println(userById);
            }).start();
        }

    }
}
