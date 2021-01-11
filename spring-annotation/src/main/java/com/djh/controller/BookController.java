package com.djh.controller;

import com.djh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author AceDJH
 * @Date 2021/1/4 18:11
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
}
