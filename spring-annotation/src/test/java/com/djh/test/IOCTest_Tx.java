package com.djh.test;

import com.djh.aop.MathCalculator;
import com.djh.config.MainConfigOfAOP;
import com.djh.tx.TxConfig;
import com.djh.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author AceDJH
 * @Date 2021/1/14 17:18
 */
@ComponentScan
public class IOCTest_Tx {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
        applicationContext.close();
    }
}
