package com.wei.test;

import org.junit.Test;

/**
 * 运算
 *
 * @author 11613
 */
public class OperatorTest {

    @org.junit.Test
    public void test1() {
        // | 一个为1 时得1
        // 二进制：0000,1010
        // 十进制：10
        int i = 8 | 2;
        System.err.println("位或 8 | 2 = " + i);
    }

    @Test
    public void test2() {
        // & 都为1 时得1
        // 二进制：0000,0000
        // 十进制：0
        int i = 8 & 2;
        System.err.println("位与 8 & 2 = " + i);
    }

    @Test
    public void test3() {
        // >> 右移
        // 0000,1000
        // 0000,0010
        // 同时向右移动 正数高位0补 负数高位1补
        // 二进制：0000，0010
        // 十进制：2
        int i = 8 >> 2;
        System.err.println(" 8 >> 2 = " + i);
    }

    @Test
    public void test4() {
        // <<左移
        // 正数或者负数左移 低位都是用0补
        // 0000,1000
        // 0000,0010

        //1000,0000
        //0010,0000
        //32
        int i = 8 << 2;
        System.err.println(" 8 << 2 = " + i);
    }

    @Test
    public void test5() {
        // >>> 无符号右移
        // 正数负数都用0进行补位
        int i = 8 >>> 2;
        System.err.println(" 8 >>> 2 = " + i);
    }


}