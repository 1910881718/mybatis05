package com.dao;

import com.pojo.Permission;
import com.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findByPage();

    List<User> findByPage2();

    List<User> findByPage3();
    List<User> findByPage4(long userId);
    List<User> findByPage5(long userId);
    List<Permission> selectUerPermission(long userId);
}