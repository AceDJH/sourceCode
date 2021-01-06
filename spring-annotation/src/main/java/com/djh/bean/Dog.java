package com.djh.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author AceDJH
 * @Date 2021/1/6 17:48
 */
@Component
public class Dog {
    public Dog(){
        System.out.println("dog constructor...");
    }

    // 对象创建并赋值后调用
    @PostConstruct
    public void init(){
        System.out.println("Dog @PostConstruct...");
    }

    // 容器移除对象之前
    @PreDestroy
    public void destroy(){
        System.out.println("Dog @PreDestroy...");
    }
}
