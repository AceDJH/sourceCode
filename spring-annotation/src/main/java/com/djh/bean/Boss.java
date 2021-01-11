package com.djh.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author AceDJH
 * @Date 2021/1/11 21:00
 */

@Component
public class Boss {

    private Car car;

    // @Autowired
    public Boss() {
        System.out.println("Boss...无参构造");
    }

    @Autowired
    public Boss(Car car) {
        this.car = car;
        System.out.println("Boss...有参构造");
    }

    public Car getCar() {
        return car;
    }

    // @Autowired
    public Boss setCar(Car car) {
        this.car = car;
        return this;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
