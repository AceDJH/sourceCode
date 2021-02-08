package com.djh.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author AceDJH
 * @Date 2021/2/8 17:34
 */
@Component
public class DependencyB {
    @Autowired
    private DependencyA a;

    public void setA(DependencyA a) {
        this.a = a;
    }

    public void sayHello(){
        // a.sayHello();
        System.out.println("Hello + B");
    }
}
