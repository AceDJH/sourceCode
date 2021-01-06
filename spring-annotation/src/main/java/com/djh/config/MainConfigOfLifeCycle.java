package com.djh.config;

import com.djh.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author AceDJH
 * @Date 2021/1/6 17:20
 */
@ComponentScan("com.djh.bean")
@Configuration
public class MainConfigOfLifeCycle {
    // @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }
}
