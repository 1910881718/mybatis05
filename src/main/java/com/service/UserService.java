package com.service;

import com.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();

    public int deleteUserById(Integer id);

    public int list2(Integer id);

    public int deleIds(Integer[] ids);
}
