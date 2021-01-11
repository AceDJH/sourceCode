package com.djh.test;

import com.djh.bean.Boss;
import com.djh.bean.Car;
import com.djh.bean.Color;
import com.djh.bean.Person;
import com.djh.config.MainConfigAutoWired;
import com.djh.config.MainConfigOfPropertyValues;
import com.djh.dao.BookDao;
import com.djh.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author AceDJH
 * @Date 2021/1/6 17:26
 */
public class IOCTest_AutoWired {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigAutoWired.class);
    @Test
    public void test1(){
        // BookService bean = applicationContext.getBean(BookService.class);
        // System.out.println(bean);
        // BookDao bookDao2 = (BookDao) applicationContext.getBean("bookDao2");
        // printBeans(applicationContext);

        // BookDao bookDao = applicationContext.getBean(BookDao.class);
        // System.out.println(bookDao);
        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);
        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
