package com.wei.dao;

import com.wei.entity.UserDO;

/**
 * @author 11613
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public UserDO getUserDO(Long id) {
        System.err.println("between()...");
        Class<UserDO> userDOClass = UserDO.class;
        UserDO userDO = null;
        try {
            userDO = userDOClass.newInstance();
            userDOClass.getMethod("setName", String.class).invoke(userDO, "魏恩召");
            userDOClass.getMethod("setId", Long.class).invoke(userDO, id);
            System.err.println("id..." + userDOClass.getMethod("getId").invoke(userDO));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userDO;
    }
}