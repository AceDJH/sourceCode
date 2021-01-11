package com.djh.bean;

import org.springframework.stereotype.Component;

/**
 * @Author AceDJH
 * @Date 2021/1/6 17:23
 */
@Component
public class Car {
    public Car() {
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car init...");
    }

    public void destroy(){
        System.out.println("car destroy...");
    }

}
