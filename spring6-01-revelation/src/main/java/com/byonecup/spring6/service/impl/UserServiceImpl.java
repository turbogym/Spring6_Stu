package com.byonecup.spring6.service.impl;

import com.byonecup.spring6.dao.UserDao;
import com.byonecup.spring6.dao.impl.UserDaoImplForMySQL;
import com.byonecup.spring6.dao.impl.UserDaoImplForOracle;
import com.byonecup.spring6.service.UserService;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/3 13:39
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
//    private UserDao userDao = new UserDaoImplForMySQL();
//    private UserDao userDao = new UserDaoImplForOracle();

    private UserDao userDao;
    @Override
    public void deleteUser() {
        // 删除用户信息的业务逻辑
        userDao.deleteById();
    }
}
