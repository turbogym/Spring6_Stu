package com.byonecup.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @Title Spring6_Stu UserService
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 20:36
 * @Version 1.0
 */
@Service("userService")
public class UserService { // 目标类
    public void login() { // 目标方法
        System.out.println("系统正在进行身份认证...");
    }

    public void logout() {
        System.out.println("退出系统...");
    }
}
