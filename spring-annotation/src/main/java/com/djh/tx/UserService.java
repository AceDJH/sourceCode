package com.djh.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author AceDJH
 * @Date 2021/1/26 16:17
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void insertUser(){
        userDao.insert();
        System.out.println("插入完成...");
        // int i = 10 / 0;
    }
}
