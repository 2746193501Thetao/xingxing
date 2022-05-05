package com.tao.springboot.service.Impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tao.springboot.dao.UserDao;
import com.tao.springboot.entity.User;
import com.tao.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    UserDao userDao;
    @Autowired
    StringRedisTemplate template;
    public User UserLogin(User user)   {

       User user_ = userDao.UserLogin(user);

        System.out.println(user_);
        if (user_!=null){
            System.out.println("查询成功");
            return user_;
        }
        return null;
    }
}
