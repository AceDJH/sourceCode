package com.djh.service;

import com.djh.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author AceDJH
 * @Date 2021/1/4 18:12
 */
@Service
public class BookService {
    // @Qualifier("bookDao2")
    @Autowired(required = false)
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
