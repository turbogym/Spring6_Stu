package com.byonecup.spring6.dao.impl;

import com.byonecup.spring6.dao.UserDao;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/3 13:37
 * @Version 1.0
 */
public class UserDaoImplForMySQL implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("MySQL数据库正在删除用户信息...");
    }
}
