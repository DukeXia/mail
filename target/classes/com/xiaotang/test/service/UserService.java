package com.xiaotang.test.service;

import com.xiaotang.test.entity.User;

public interface UserService {

    /**
     * 获取用户信息
     *
     * @param id
     *
     * @return <code>user</code>
     * */
    public User getUserById(Integer id);

}
