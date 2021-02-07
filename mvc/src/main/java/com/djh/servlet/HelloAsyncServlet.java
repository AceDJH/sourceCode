package com.djh.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author AceDJH
 * @Date 2021/2/7 10:58
 */
@WebServlet(value = "/async", asyncSupported = true)
public class HelloAsyncServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("主线程开始..." + Thread.currentThread());
        // 开启异步处理
        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("副线程开始..." + Thread.currentThread());
                    sayHello();
                    // 获取到异步上下文
                    AsyncContext asyncContext1 = req.getAsyncContext();
                    ServletResponse response = asyncContext1.getResponse();
                    response.getWriter().write("hello async");
                    asyncContext.complete();
                    System.out.println("副线程结束..." + Thread.currentThread());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("主线程结束..." + Thread.currentThread());
    }

    public void sayHello() throws InterruptedException {
        System.out.println(Thread.currentThread() + " processing...");
        Thread.sleep(3000);
    }
}
