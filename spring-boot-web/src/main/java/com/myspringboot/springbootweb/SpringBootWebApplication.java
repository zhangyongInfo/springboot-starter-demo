package com.myspringboot.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//如果不想启动加载默认的datasource注入流程, 可使用@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(basePackages = "com")
public class SpringBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

}
