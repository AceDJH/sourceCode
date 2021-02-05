package com.djh.service;

import org.springframework.stereotype.Service;

/**
 * @Author AceDJH
 * @Date 2021/2/5 21:17
 */
@Service
public class HelloService {
    public String sayHello(String name){
        return "Hello " + name;
    }
}
