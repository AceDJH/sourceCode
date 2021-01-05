package com.djh.test;

import com.djh.bean.Person;
import com.djh.config.MainConfig;
import com.djh.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @Author AceDJH
 * @Date 2021/1/4 18:13
 */
public class IOCTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void testImport(){
        printBeans(applicationContext);
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        Object colorFactoryBean2 = applicationContext.getBean("colorFactoryBean");
        System.out.println("colorFactoryBean的类型: " + colorFactoryBean.getClass());
        System.out.println(colorFactoryBean == colorFactoryBean2);
        Object colorFactoryBean3 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(colorFactoryBean3.getClass());
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        /*String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }*/
        System.out.println("ioc容器创建完成");
        Object person = applicationContext.getBean("person");
        // Object person2 = applicationContext.getBean("person");
        // System.out.println(person == person2);
    }

    @Test
    public void test3(){
        // System.out.println("test3");
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
        for (String name : namesForType) {
            System.out.println(name);
        }

        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }
}
