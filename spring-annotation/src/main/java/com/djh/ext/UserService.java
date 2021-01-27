package com.djh.ext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @Author AceDJH
 * @Date 2021/1/27 23:09
 */
@Service
public class UserService {
    @EventListener(classes = {ApplicationEvent.class})
    public void listen(ApplicationEvent event){
        System.out.println("UserService...监听到的事件: " + event);
    }
}
