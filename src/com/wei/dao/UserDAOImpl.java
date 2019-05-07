package com.wei.dao;

import com.wei.entity.UserDO;

public class UserDAOImpl implements UserDAO {

    @Override
    public UserDO getUserDO() throws Exception {
        Class<UserDO> userDOClass = UserDO.class;

        userDOClass.getMethod("setName", String.class).invoke(userDOClass.newInstance(), "魏恩召");

        return userDOClass.newInstance();
    }
}