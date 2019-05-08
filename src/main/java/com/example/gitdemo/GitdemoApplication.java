package com.example.gitdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.gitdemo"})
@ServletComponentScan
@MapperScan(basePackages  = "com.example.gitdemo.dao.**")
@SpringBootApplication
public class GitdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
	}

}
