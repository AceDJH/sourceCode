package com.djh.controller;

import com.djh.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author AceDJH
 * @Date 2021/2/5 21:16
 */
@Controller
public class HelloController {
    @Autowired
    HelloService helloService;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        String haha = helloService.sayHello("haha");
        return haha;
    }
}
