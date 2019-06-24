package com.wei.service;

import com.wei.entity.UserDO;

public interface UserService {
    /**
     * 获取用户信息
     * @return
     */
    UserDO getUserDO(String userId);
}
