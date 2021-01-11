package com.djh.config;

import com.djh.bean.Car;
import com.djh.bean.Color;
import com.djh.bean.MyBeanPostProcessor;
import com.djh.dao.BookDao;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
 * 自动装配：
 *      Spring利用依赖注入（DI）， 完成对IOC容器中各个组件的依赖关系赋值
 * @Author AceDJH
 * @Date 2021/1/11 15:51
 */
@Configuration
@ComponentScan(value = {"com.djh.controller", "com.djh.dao", "com.djh.service", "com.djh.bean"},
                excludeFilters = {
                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {MyBeanPostProcessor.class})
                })
public class MainConfigAutoWired {
    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        return new BookDao().setLabel("2");
    }

    /**
     * @Bean 标注的方法创建对象的时候，方法参数的值从容器中获取
     * @param car
     * @return
     */
    @Bean
    public Color color(Car car){
        Color color = new Color();
        color.setCar(car);
        return color;
    }
}
