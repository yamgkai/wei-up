package com.wei.dome;

/**
 * @author wei
 */
public class Dome01 {

    /**
     * 全局变量
     */
    public int a;

    /**
     * 全局静态变量
     */
    public static int b;

    /**
     * 全局常量
     */
    public final int c = 1;

    /**
     * 全局静态常量
     */
    public static final int d = 1;

    /**
     * final 修饰的引用类型，引用地址不能改变，所指向的内容可变
     */
    public final String e;

    Dome01(String e) {
        this.e = e;
    }


}
