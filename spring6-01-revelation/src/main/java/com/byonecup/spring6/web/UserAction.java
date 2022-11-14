package com.byonecup.spring6.web;

import com.byonecup.spring6.service.UserService;
import com.byonecup.spring6.service.impl.UserServiceImpl;

/**
 * 表示层
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/3 11:05
 * @Version 1.0
 */
public class UserAction {
//    private UserService userService = new UserServiceImpl();

    // 修改为
    private UserService userService;

    /**
     * 删除用户信息的请求
     */
    public void deleteRequest() {
        userService.deleteUser();
    }
}
