package com.xiaotang.test.service.impl;

import com.xiaotang.test.entity.User;
import com.xiaotang.test.mapper.UserMapper;
import com.xiaotang.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("us")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
