package com.byonecup.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

/**
 * @Title Spring6_Stu OrderService
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 20:57
 * @Version 1.0
 */
@Service("orderService")
public class OrderService { // 目标类

    // 目标方法
    public void generate() {
        System.out.println("生成订单...");
        if (1 == 1) {
            throw new RuntimeException("运行时异常");
        }
    }
}
