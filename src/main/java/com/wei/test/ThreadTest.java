package com.wei.test;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


public class ThreadTest {

    /**
     * 继承Thread
     */
    @Test
    public void test1() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                System.err.println("thread");
            }
        };
        thread.start();

    }

    /**
     * 实现Runnable
     */
    @Test
    public void test2() {
        Runnable runnable = () -> System.err.println("runnable");
        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * 通过Callable和Future创建线程
     */
    @Test
    public void test3() {
        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {

                return "call";
            }
        };
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.run();
        try {
            Object o = futureTask.get();
            System.err.println(o.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


        Runnable runnable = () -> System.err.println("test");

        runnable.run();


    }

}
