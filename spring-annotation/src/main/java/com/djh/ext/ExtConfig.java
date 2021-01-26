package com.djh.ext;

import com.djh.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author AceDJH
 * @Date 2021/1/26 18:30
 */
@ComponentScan("com.djh.ext")
@Configuration
public class ExtConfig {
    @Bean
    public Blue blue(){
        return new Blue();
    }

}
