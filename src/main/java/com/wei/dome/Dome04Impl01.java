package com.wei.dome;

import java.util.Arrays;

import static com.wei.dome.Dome04.test2;

public class Dome04Impl01 implements Dome04 {


    @Override
    public void test3() {
        System.err.println("test3");
    }

    public static void main(String[] args) {
        Dome04 dome04 = () -> {

            Arrays.stream(args).forEach(System.err::println);

            System.err.println("void test3");
        };

        Dome04 dome041 = new Dome04Impl01();


        test2();


        System.err.println(dome04.equals(dome041));

        dome041.test3();

        dome04.test1();

        dome04.test3();


    }
}
