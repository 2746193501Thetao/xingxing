package com.tao.springboot.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.tao.springboot.entity.User;



import org.springframework.stereotype.Repository;


@Repository
public interface UserDao  extends BaseMapper {

    User UserLogin(User user);
}
