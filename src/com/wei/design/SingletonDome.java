package com.wei.design;

/**
 * 单例模式
 */
public class SingletonDome {

    private SingletonDome() {

    }

    private static SingletonDome singleton;


    // 懒加载模式
    // 多线程情况下：A进入if判断此时singleton为null，因此进入if内。
    // B进入if判断，此时A还没有创建singleton，因此singleton也为null，
    // 因此B也进入if内，此时A，B各自创建了一个实例返回
    public static SingletonDome getInstance() {
        if (singleton == null) {
            singleton = new SingletonDome();
        }
        return singleton;
    }

    //使用synchronized只能有一个线程可以调用这个方法
    public synchronized static SingletonDome instance() {
        if (singleton == null) {
            singleton = new SingletonDome();
        }
        return singleton;
    }




}