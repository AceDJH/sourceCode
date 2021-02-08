package com.djh.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author AceDJH
 * @Date 2021/2/8 17:34
 */
@Component
public class DependencyA {
    @Autowired
    private DependencyB b;

    public void setB(DependencyB b){
        this.b = b;
    }

    public void sayHello(){
        b.sayHello();
        System.out.println("Hello + A");
    }
}
