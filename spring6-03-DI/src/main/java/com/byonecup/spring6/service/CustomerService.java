package com.byonecup.spring6.service;

import com.byonecup.spring6.dao.UserDao;
import com.byonecup.spring6.dao.VIPDao;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/15 20:18
 * @Version 1.0
 */
public class CustomerService {
    private UserDao userDao;
    private VIPDao vipDao;

    public CustomerService() {
    }

    public CustomerService(UserDao userDao, VIPDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VIPDao vipDao) {
        this.vipDao = vipDao;
    }

    public void save() {
        userDao.insert();
        vipDao.insert();
    }
}
