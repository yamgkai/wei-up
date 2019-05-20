package com.wei.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
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

        File file = new File("D:/WeiEnzhao/Pictures/1E1E1E.png");
        FileInputStream fileInputStream = new FileInputStream(file);
        ServletOutputStream outputStream = resp.getOutputStream();
        resp.setContentType("application/octet-stream");
        byte[] bytes = new byte[10240];
        int len = 0;
        while (fileInputStream.read(bytes) != -1) {
            outputStream.write(bytes, 0, len);
            outputStream.flush();
        }
        outputStream.close();
        fileInputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.err.println("doPost");
        super.doPost(req, resp);
    }
}
