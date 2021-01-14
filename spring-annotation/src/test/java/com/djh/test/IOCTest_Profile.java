package com.djh.test;

import com.djh.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.Arrays;

/**
 * @Author AceDJH
 * @Date 2021/1/14 16:13
 */
public class IOCTest_Profile {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);
        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String s : namesForType) {
            System.out.println(s);
        }
        applicationContext.close();
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("test", "dev");
        applicationContext.register(MainConfigOfProfile.class);
        applicationContext.refresh();
        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String s : namesForType) {
            System.out.println(s);
        }
        applicationContext.close();
    }
}
