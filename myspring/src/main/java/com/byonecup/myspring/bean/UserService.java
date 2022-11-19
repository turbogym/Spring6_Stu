package com.byonecup.myspring.bean;

/**
 * @Title Spring6_Stu UserService
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/20 01:34
 * @Version 1.0
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.insert();
    }
}
