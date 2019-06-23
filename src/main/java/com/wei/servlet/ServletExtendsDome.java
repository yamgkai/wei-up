package com.wei.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Mr.Wei
 * @version 1.0.0
 * @program ServletExtendsDome
 * @description
 * @date 2019/5/18
 */
public class ServletExtendsDome extends HttpServlet {

    private String messge = null;

    @Override
    public void init() throws ServletException {
        System.err.println("init...................");
        messge = "init";
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.err.println("doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.err.println("doPost");
        super.doPost(req, resp);
    }
}
