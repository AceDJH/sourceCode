package com.djh.config;

import com.djh.controller.MyFirstInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @Author AceDJH
 * @Date 2021/2/5 21:11
 */
// SpringMVC只扫描Controller， 子容器
//     禁用默认过滤规则
@ComponentScan(value = "com.djh", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
}, useDefaultFilters = false)
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {
    // 视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp();
    }

    // 拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyFirstInterceptor()).addPathPatterns("/**");
    }
}
