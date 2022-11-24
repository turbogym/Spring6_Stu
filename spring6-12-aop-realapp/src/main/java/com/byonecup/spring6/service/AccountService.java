package com.byonecup.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @Title Spring6_Stu AccountService
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 22:01
 * @Version 1.0
 */
@Service
public class AccountService { // 目标对象

    // 目标方法
    // 转账的业务方法
    public void transfer() {
        System.out.println("银行账户正在完成转账操作...");
    }

    // 目标方法
    // 取款的业务方法
    public void withdraw() {
        System.out.println("正在取款，请稍后...");
    }
}
