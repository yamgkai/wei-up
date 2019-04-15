package com.wei;


import com.wei.dao.UserDAO;
import com.wei.domain.UserDO;

public class ClassLoaderDome {



    public static void main(String[] args) throws Exception {


        Class<UserDAO> userDAOClass = UserDAO.class;

        BeanFactory<UserDO> beanFactory=new BeanFactory<>();


        UserDO userDO = userDAOClass.newInstance().getUserDO();

        System.err.println(userDO);
    }

    private void testClassLoader() throws Exception {

        Class<? extends ClassLoaderDome> aClass = this.getClass();

        Class<ClassLoaderDome> classLoaderDomeClass = ClassLoaderDome.class;

        ClassLoader classLoader = aClass.getClassLoader();

        ClassLoader parentClassLoader = classLoader.getParent();

        ClassLoader parent = parentClassLoader.getParent();

        System.err.println(classLoader);

        System.err.println(parentClassLoader);

        System.err.println(parent);

    }

}