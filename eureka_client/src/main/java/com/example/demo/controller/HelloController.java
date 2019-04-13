package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wyx
 * @Date: 2019-04-13 16:43
 * @Description:
 */
@RestController
public class HelloController {

    //从配置文件中找到名字为 server.port 的值并将其注入 port 中
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/")
    public String hello(){
        return "Hello world";
    }

    /**
     * 测试负载均衡
     */
    @RequestMapping(value = "/hi")
    public String hi(){
        return "my port is " + port;
    }

}
