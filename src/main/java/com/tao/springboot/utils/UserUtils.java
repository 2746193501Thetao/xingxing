package com.tao.springboot.utils;

import com.tao.springboot.entity.User;

public class UserUtils {
    private static final ThreadLocal<User> tl = new ThreadLocal<User>();

    public static void saveUser(User user){
        tl.set(user);
        System.out.println(user);
    }


    public static User getUser(){
        return tl.get();
    }

    public static void removeUser(){
        tl.remove();
    }
}
