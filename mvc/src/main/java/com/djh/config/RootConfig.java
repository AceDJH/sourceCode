package com.djh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Author AceDJH
 * @Date 2021/2/5 21:10
 */
// Spring的容器不扫描controller， 父容器
@ComponentScan(value = "com.djh", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
})
public class RootConfig {
}
