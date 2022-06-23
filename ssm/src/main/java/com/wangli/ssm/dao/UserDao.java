package com.wangli.ssm.dao;

import com.wangli.ssm.po.User;

/**
 * @description:
 * @author: wl
 * @create: 2022/6/23
 **/
public interface UserDao {
    // 通过用户ID查询用户对象
    public User queryUserById(Integer userId);
}
