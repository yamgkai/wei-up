package com.wei.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Mr.Wei
 * @version 1.0.0
 * @program ServletExtendsDome
 * @description
 * @date 2019/5/18
 */
public class ServletImplDome implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
