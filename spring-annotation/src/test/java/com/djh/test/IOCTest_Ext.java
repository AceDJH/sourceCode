package com.djh.test;

import com.djh.aop.MathCalculator;
import com.djh.config.MainConfigOfAOP;
import com.djh.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author AceDJH
 * @Date 2021/1/14 17:18
 */
public class IOCTest_Ext {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        applicationContext.close();
    }
}
