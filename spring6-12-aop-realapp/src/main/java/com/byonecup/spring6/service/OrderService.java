package com.byonecup.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @Title Spring6_Stu OrderService
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 22:01
 * @Version 1.0
 */
@Service
public class OrderService { // 目标对象
    // 目标方法
    // 生成订单的业务方法
    public void generate() {
        System.out.println("正在生成订单...");
    }

    // 目标方法
    // 取消订单的业务方法
    public void cancel() {
        System.out.println("订单已取消...");
        String s = null;
        s.toString();
    }
}
