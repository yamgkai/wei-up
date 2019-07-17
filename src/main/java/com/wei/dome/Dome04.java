package com.wei.dome;

public interface Dome04 {

    default void test1() {
        System.err.println("default test1");
    }


    static void test2() {
        System.err.println("static test2");
    }

    void test3();





}
