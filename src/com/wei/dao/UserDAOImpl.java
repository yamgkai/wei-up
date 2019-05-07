package com.wei.dao;

import com.wei.entity.UserDO;

/**
 * @author 11613
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public UserDO getUserDO() {
        Class<UserDO> userDOClass = UserDO.class;
        UserDO userDO = null;
        try {
            userDOClass.getMethod("setName", String.class).invoke(userDOClass.newInstance(), "魏恩召");
            userDO = userDOClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userDO;
    }
}