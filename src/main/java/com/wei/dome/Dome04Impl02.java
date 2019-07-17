package com.wei.dome;

public class Dome04Impl02 extends Dome04Impl01 implements Dome04 {


    public static void main(String[] args) {
        Dome04Impl01.main(new String[]{"arg1", "arg2", "arg3"});

        Dome04Impl02 instance = Dome04Impl02.getInstance();

        System.err.println(instance);

        Dome04Impl01 instance1 = Dome04Impl02.getInstance1();

        instance1.test3();

        instance1.test1();

    }

    @Override
    public void test3() {
        //super.test3();

        System.err.println("test3---");
    }

    @Override
    public void test1() {
        System.err.println("test1---");
    }


    public static Dome04Impl02 getInstance() {

        try {
            return (Dome04Impl02) Dome04Impl01.class.newInstance();
        } catch (Exception e) {
            //e.printStackTrace();
            return null;
        } finally {
            System.err.println("go");
        }

    }

    public static Dome04Impl01 getInstance1() {
        try {
            return Dome04Impl02.class.newInstance();
        } catch (Exception e) {
           return null;
        }
    }







}
