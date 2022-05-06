package com.tao.springboot.controller;


import com.tao.springboot.entity.ProcessResult;
import com.tao.springboot.entity.User;
import com.tao.springboot.exceptionHandler.exception.UniteException;
import com.tao.springboot.service.IUserService;
import com.tao.springboot.utils.UserThreadLocalUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService iUserService;

    /**
     * 保存用户
     * @param userlogin
     * @return
     */
    @PostMapping ("/login")
    public ProcessResult UserLogin(@RequestBody User userlogin){
        System.out.println(userlogin);
        try{
            User user = iUserService.UserLogin(userlogin);
            if (user!=null){
                return new ProcessResult(200,"登录成功",user);
            }
        }catch (Exception e){
           e.printStackTrace();
        }
        try{

        }catch (Exception e){
            throw new UniteException(500,"算数异常");
        }

        return new ProcessResult(500,"登录失败",null);
    }

    @GetMapping("/aa")
    public User aa(){
        User user = UserThreadLocalUtils.getUser();
        System.out.println(user);
        return user;
    }

    @GetMapping("/bb")
    public void bb(){
      User user =new User();
      user.setId(6l);
      user.setUsername("aaab");
      user.setPassword("asdasd");
      UserThreadLocalUtils.setUser(user);

    }

}
