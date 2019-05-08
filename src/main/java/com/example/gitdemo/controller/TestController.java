package com.example.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试
 * @Author lss0555
 * @Date 2019/5/8/008 16:08
 **/
@RestController
public class TestController {

    /**
     * @Description  测试
     **/
    @GetMapping("/test")
    public String hello(){
        return "hello world";
    }
}
