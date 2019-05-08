package com.example.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 用户模块
 * @Author lss0555
 * @Date 2019/5/8/008 16:30
 **/
@RestController
public class UserController {

    @GetMapping("/login")
    public String login(){
        return "登录成功";
    }

    @GetMapping("/loginOut")
    public String loginOut(){
        return "退出登录";
    }
}
