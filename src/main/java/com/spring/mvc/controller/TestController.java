package com.spring.mvc.controller;

import com.spring.mvc.annotation.MyController;
import com.spring.mvc.annotation.MyRequestMapping;
import com.spring.mvc.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wpq
 * @date 2018/3/9 13:56
 */
@MyController
@MyRequestMapping("/test")
public class TestController {
    @MyRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @MyRequestParam("param") String param) {
        System.out.println(param);
        try {
            response.getWriter().write("doTest method success! param:" + param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @MyRequestMapping("/doTest2")
    public void test2(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().println("doTest2 method success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
