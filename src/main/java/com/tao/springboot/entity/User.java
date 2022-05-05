package com.tao.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {

    Long id;  //用户id
    String username; //用户名
    String password; //密码
    String phone;
}