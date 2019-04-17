package com.wei;

/**
 * 运算
 */
public class OperatorDome {

    public static void main(String[] args) {
        //0000,1000
        int a = 8;
        //0000,0010
        int b = 2;

        // | 一个为1
        // 二进制：0000,1010
        // 十进制：10
        int c = a | b;
        System.err.println("位或 8 | 2 = " + c);

        // & 都为1
        // 二进制：0000,0000
        // 十进制：0
        int d = a & b;
        System.err.println("位与 8 & 2 = " + d);

        // >> 右移
        // 0000,1000
        // 0000,0010
        // 同时向右移动 正数高位0补 负数高位1补
        // 二进制：0000，0010
        // 十进制：2
        int e = a >> b;
        System.err.println(" 8 >> 2 = " + e);

        // <<左移
        // 正数或者负数左移 低位都是用0补
        // 0000,1000
        // 0000,0010

        //1000,0000
        //0010,0000
        //32
        int f = a << b;
        System.err.println(" 8 << 2 = " + f);

        // >>> 无符号右移
        // 正数负数都用0进行补位
        int g = a >>> b;
        System.err.println(" 8 >>> 2 = " + g);
    }
}