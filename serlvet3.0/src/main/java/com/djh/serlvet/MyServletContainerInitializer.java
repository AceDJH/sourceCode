package com.djh.serlvet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @Author AceDJH
 * @Date 2021/2/5 11:17
 */
// 容器启动时，会将@HandlesTypes指定的这个类型的子类（实现类，子接口等）传递过来
@HandlesTypes(value = {HelloService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    {
        System.out.println("MyServletContainerInitializer" + "静态模块");
    }
    /**
     *
     * @param set 感兴趣的所有子类型
     * @param servletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("感兴趣的类型： ");
        for (Class<?> aClass : set) {
            System.out.println(aClass);
        }

        // servletContext.addServlet()
        // servletContext.addFilter()
        // servletContext.addListener();
    }
}
