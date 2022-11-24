package com.byonecup.proxy.client;

import com.byonecup.proxy.service.OrderService;
import com.byonecup.proxy.service.OrderServiceImpl;
import com.byonecup.proxy.service.OrderServiceProxy;

/**
 * @Title Spring6_Stu Test
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/23 22:11
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        OrderService orderService = new OrderServiceImpl();
//        orderService.generate();
//        orderService.detail();
//        orderService.modify();

//        OrderService orderService = new OrderServiceImplSub();
//        orderService.generate();
//        orderService.detail();
//        orderService.modify();

        // 创建目标对象
        OrderService target = new OrderServiceImpl();
        // 创建代理对象
        OrderService proxy = new OrderServiceProxy(target);
        // 调用代理对象的代理方法
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
}
