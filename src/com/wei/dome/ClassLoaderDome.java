package com.wei.dome;

/**
 * 类加载器DOME
 * @author 11613
 */
public class ClassLoaderDome {

    public static void main(String[] args) {
        new ClassLoaderDome().testClassLoader();
    }

    private void testClassLoader() {

        Class<? extends ClassLoaderDome> aClass = this.getClass();

        Class<ClassLoaderDome> classLoaderDomeClass = ClassLoaderDome.class;

        ClassLoader classLoader = aClass.getClassLoader();

        ClassLoader parentClassLoader = classLoader.getParent();

        ClassLoader parent = parentClassLoader.getParent();

        //printing ClassLoader of this class
        System.err.println(classLoader);

        System.err.println(parentClassLoader);

        System.err.println(parent);


        // 使用java提供的显示加载api加载类
        // 可见性机制
        // ClassLoaderDome已经被Application类加载器加载过了
        // 然后如果想要使用Extension类加载器加载这个类
        // 将会抛出java.lang.ClassNotFoundException异常
        try {
            Class.forName("com.wei.dome.ClassLoaderDome", true, ClassLoaderDome.class.getClassLoader().getParent());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}