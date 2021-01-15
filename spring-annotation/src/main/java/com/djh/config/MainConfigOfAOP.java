package com.djh.config;

import com.djh.aop.LogAspects;
import com.djh.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author AceDJH
 * @Date 2021/1/14 16:38
 */
@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAOP {
    // 业务逻辑类加入容器中
    @Bean
    public MathCalculator calculator(){
        return new MathCalculator();
    }

    // 切面类加入到容器中
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
