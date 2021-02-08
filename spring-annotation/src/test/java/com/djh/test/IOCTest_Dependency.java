package com.djh.test;

import com.djh.aop.MathCalculator;
import com.djh.config.DependencyConfig;
import com.djh.config.MainConfigOfAOP;
import com.djh.dependency.DependencyA;
import com.djh.dependency.DependencyB;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author AceDJH
 * @Date 2021/1/14 17:18
 */
public class IOCTest_Dependency {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyConfig.class);
        DependencyA dependencyA = applicationContext.getBean(DependencyA.class);
        // DependencyB dependencyB = applicationContext.getBean(DependencyB.class);
        // dependencyA.setB(dependencyB);
        dependencyA.sayHello();
        applicationContext.close();
    }
}
