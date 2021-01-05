package com.djh.config;

import com.djh.bean.Person;
import com.djh.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Author AceDJH
 * @Date 2021/1/4 17:50
 */
@Configuration
@ComponentScan(value = "com.djh", includeFilters = {
        /*@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),*/
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
}, useDefaultFilters = false)
public class MainConfig {
    // 给容器中注册一个Bean,类型为返回值类型，id默认方法名
    @Bean("person")
    public Person person1(){
        return new Person("duanYu", 20);
    }
}
