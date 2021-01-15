package com.djh.test;

import com.djh.aop.MathCalculator;
import com.djh.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author AceDJH
 * @Date 2021/1/14 17:18
 */
public class IOCTest_AOP {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
   /*     不要自己创建对象
        MathCalculator mathCalculator = new MathCalculator();
        mathCalculator.div(1, 1);*/
        MathCalculator bean = applicationContext.getBean(MathCalculator.class);
        bean.div(1, 0);
        applicationContext.close();
    }
}
