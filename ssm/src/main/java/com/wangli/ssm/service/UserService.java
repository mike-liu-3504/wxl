package com.wangli.ssm.service;

import com.wangli.ssm.dao.UserDao;
import com.wangli.ssm.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: wl
 * @create: 2022/6/23
 **/
@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public User queryUserById(Integer userId){
        User user = userDao.queryUserById(userId);
        return user;
    }
}
