package com.wei;

import com.wei.dao.UserDAO;
import com.wei.dao.UserDAOImpl;
import com.wei.entity.UserDO;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Mr.Wei
 * @version 1.0.0
 * @program AopTest
 * @description
 * @date 2019/5/7
 */
public class AopTest {

    /**
     * 每一个动态代理类的调用处理程序都必须实现InvocationHandler接口，
     * 并且每个代理类的实例都关联到了实现该接口的动态代理类调用处理程序中，
     * 当我们通过动态代理对象调用一个方法时候，
     * 这个方法的调用就会被转发到实现InvocationHandler接口类的invoke方法来调用
     */
    @Test
    public void test1() {
        InvocationHandler invocationHandler = (proxy, method, args) -> {
            System.err.println("before()...");
            Object invoke = method.invoke(UserDAOImpl.class.newInstance(), args);
            UserDO userDO = (UserDO) invoke;
            System.err.println(userDO.getName());
            System.err.println("after()...");
            return invoke;
        };
        UserDAO userDAO = (UserDAO) Proxy.newProxyInstance(UserDAOImpl.class.getClassLoader(), UserDAOImpl.class.getInterfaces(), invocationHandler);
        System.err.println(userDAO.getUserDO(1L).getName());
    }
}