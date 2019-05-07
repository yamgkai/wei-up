package com.wei;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Mr.Wei
 * @version 1.0.0
 * @program AopDome
 * @description
 * @date 2019/5/7
 */
public class AopDome {

    @Test
    private void test1(){

    }
    InvocationHandler invocationHandler =new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        }
    }


}
