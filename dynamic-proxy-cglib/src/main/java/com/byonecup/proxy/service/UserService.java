package com.byonecup.proxy.service;

/**
 * @Title Spring6_Stu UserService
 * @Description 目标类
 * @Author Turbo
 * @Date 2022/11/24 19:29
 * @Version 1.0
 */
public class UserService {
    // 目标方法
    public boolean login(String username, String password) {
        System.out.println("系统正在验证身份...");
        if ("admin".equals(username) && "123".equals(password)) {
            return true;
        }
        return false;
    }

    // 目标方法
    public void logout() {
        System.out.println("系统正在退出...");
    }
}
