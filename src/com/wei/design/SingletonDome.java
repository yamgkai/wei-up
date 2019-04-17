package com.wei.design;

/**
 * 单例模式
 */
public class SingletonDome {

    // 1、饿汉式（静态常量）[可用]
    private final static SingletonDome SINGLETON_DOME = new SingletonDome();

    public static SingletonDome getInstance1() {
        return SINGLETON_DOME;
    }

    // 2、饿汉式（静态代码块）[可用]
    private static SingletonDome singletonDome;

    static {
        singletonDome = new SingletonDome();
    }

    public static SingletonDome getInstance2() {
        return singletonDome;
    }


    // 3、懒汉式(线程不安全)[不可用]
    // 多线程情况下：A进入if判断此时singleton为null，因此进入if内。
    // B进入if判断，此时A还没有创建singleton，因此singleton也为null，
    // 因此B也进入if内，此时A，B各自创建了一个实例返回

    public static SingletonDome getInstance3() {
        if (singletonDome == null) {
            singletonDome = new SingletonDome();
        }
        return singletonDome;
    }

    // 4、懒汉式(线程安全，同步方法)[不推荐用]
    // 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。
    public static synchronized SingletonDome getInstance4() {
        if (singletonDome == null) {
            singletonDome = new SingletonDome();
        }
        return singletonDome;
    }

    // 5、懒汉式(线程安全，同步代码块)[不可用]
    // 改为同步产生实例化的的代码块。
    // 但是这种同步并不能起到线程同步的作用。
    // 跟第3种实现方式遇到的情形一致，
    // 假如一个线程进入了if (singleton == null)判断语句块，
    // 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
    public static SingletonDome getInstance5() {
        if (singletonDome == null) {
            synchronized (SingletonDome.class) {
                singletonDome = new SingletonDome();
            }
        }
        return singletonDome;
    }

    // 6、双重检查[推荐用]
    // Double-Check概念对于多线程开发者来说不会陌生，
    // 如代码中所示，我们进行了两次if (singleton == null)检查，
    // 这样就可以保证线程安全了。这样，实例化代码只用执行一次，
    // 后面再次访问时，判断if (singleton == null)，直接return实例化对象。
    public static SingletonDome getInstance6() {
        if (singletonDome == null) {
            synchronized (SingletonDome.class) {
                if (singletonDome == null) {
                    singletonDome = new SingletonDome();
                }
            }
        }
        return singletonDome;
    }

    // 7、静态内部类[推荐用]
    // 这种方式跟饿汉式方式采用的机制类似，但又有不同。
    // 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
    // 不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，
    // 而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，
    // 才会装载SingletonInstance类，从而完成Singleton的实例化。
    // 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
    // 优点：避免了线程不安全，延迟加载，效率高。
    private static class SingletonInstance {
        private static final SingletonDome INSTANCE = new SingletonDome();
    }

    public static SingletonDome getInstance7() {
        return SingletonInstance.INSTANCE;
    }


    // 8、枚举[推荐用]
    // 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，
    // 而且还能防止反序列化重新创建新的对象。可能是因为枚举在JDK1.5中才添加，所以在实际项目开发中，很少见人这么写过。
    // 优点：系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能。
    // 缺点：当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new，可能会给其他开发人员造成困扰，特别是看不到源码的时候。
    // 适用场合：
    // 需要频繁的进行创建和销毁的对象；
    // 创建对象时耗时过多或耗费资源过多，但又经常用到的对象；
    // 工具类对象；
    // 频繁访问数据库或文件的对象。
    public enum Singleton {
        INSTANCE;
        public void test() {

        }
    }


    public static void main(String[] args) {
        Singleton.INSTANCE.test();
    }

}