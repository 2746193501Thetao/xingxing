package com.tao.springboot.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tao.springboot.entity.User;
import org.springframework.stereotype.Service;


public interface IUserService {

    User UserLogin(User user) throws JsonProcessingException;
}
