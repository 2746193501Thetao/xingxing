package com.tao.springboot.utils;

import com.tao.springboot.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserThreadLocalUtils {
  private static final ThreadLocal<User> tl = new ThreadLocal();


    public static void setUser(User user){
        tl.set(user);
    }
    public static User getUser(){
       return tl.get();
    }

    public static void removeUser(){
        tl.remove();
    }
}
