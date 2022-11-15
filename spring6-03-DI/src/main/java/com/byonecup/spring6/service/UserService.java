package com.byonecup.spring6.service;

import com.byonecup.spring6.dao.UserDao;
import com.byonecup.spring6.dao.VIPDao;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/15 19:48
 * @Version 1.0
 */
public class UserService {
    private UserDao userDao;

    private VIPDao vipDao;

    // set注入的话，必须提供一个set方法
    // Spring容器会调用这个set方法，来给userDao属性赋值。

    // 自己写一个set方法，不使用IDEA工具生成的，不符合javabean规范。
    // 至少这个方法是以set单词开始的，前三个字母不能随便写，必须是"set"
    public void setMySQLUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VIPDao vipDao) {
        this.vipDao = vipDao;
    }

    //    // 这个set方法时IDEA工具生成的，符合javabean规范。
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void saveUser() {
        userDao.insert();
        vipDao.insert();
    }
}
