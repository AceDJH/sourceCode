package com.djh.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author AceDJH
 * @Date 2021/1/27 21:02
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到事件: " + event);
    }
}
