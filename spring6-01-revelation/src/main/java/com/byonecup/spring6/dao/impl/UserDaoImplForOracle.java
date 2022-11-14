package com.byonecup.spring6.dao.impl;

import com.byonecup.spring6.dao.UserDao;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/4 13:48
 * @Version 1.0
 */
public class UserDaoImplForOracle implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("Oracle数据库正在删除用户数据...");
    }
}
