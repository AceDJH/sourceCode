package com.djh.test;

import com.djh.bean.Person;
import com.djh.config.MainConfigOfLifeCycle;
import com.djh.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author AceDJH
 * @Date 2021/1/6 17:26
 */
public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
    @Test
    public void test1(){
        printBeans(applicationContext);
        System.out.println("===============");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
