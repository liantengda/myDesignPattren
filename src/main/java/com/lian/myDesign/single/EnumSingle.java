package com.lian.myDesign.single;


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

class User{
    private Long id;
    private String name;
    private String password;
    private String phone;

    public void setId(long id) {
        this.id = id;
    }
}