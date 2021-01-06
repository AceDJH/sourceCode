package com.djh.test;

import com.djh.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author AceDJH
 * @Date 2021/1/6 17:26
 */
public class IOCTest_LifeCycle {
    @Test
    public void test1(){
        // 创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");
        // applicationContext.getBean("car");
        applicationContext.close();
    }
}
