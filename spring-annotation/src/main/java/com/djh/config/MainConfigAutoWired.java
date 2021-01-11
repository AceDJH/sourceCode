package com.djh.config;

import com.djh.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 自动装配：
 *      Spring利用依赖注入（DI）， 完成对IOC容器中各个组件的依赖关系赋值
 * @Author AceDJH
 * @Date 2021/1/11 15:51
 */
@Configuration
@ComponentScan({"com.djh.controller", "com.djh.dao", "com.djh.service"})
public class MainConfigAutoWired {
    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        return new BookDao().setLabel("2");
    }
}
