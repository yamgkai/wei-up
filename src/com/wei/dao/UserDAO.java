package com.wei.dao;

import com.wei.domain.UserDO;

/**
 * @author 11613
 */
public interface UserDAO {

    /**
     * 获取用户信息
     *
     * @return UserDO
     */
    UserDO getUserDO();
}