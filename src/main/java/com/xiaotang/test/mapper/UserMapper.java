package com.xiaotang.test.mapper;

import com.xiaotang.test.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    /**
     * 获取用户信息
     *
     * @param id
     *
     * @return User
     * */
    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}