package com.service.impl;

import com.dao.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//所有bean的注册都可用@Component注册
//web层用@Controller注解
//业务逻辑层一般@Service注册成为spring容器的bean
@Service("userService")
public class UserServiceImpl implements UserService {
    //@Autowired:默认根据类型注入spring容器中bean,此注解可在属性或set方法之前
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public int deleteUserById(Integer id) {
        return 0;
    }

    @Override
    public int list2(Integer id) {
        return 0;
    }

    //一个业务业务方法，调用其它业务方法
    @Override
    public int deleIds(Integer[] ids) {
        int count=0;
        return count;
    }


}
