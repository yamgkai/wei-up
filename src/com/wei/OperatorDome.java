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

        // & 都为1
        // 二进制：0000,0000
        // 十进制：0
        int d = a & b;
        System.err.println(c);
        System.err.println(d);
    }
}