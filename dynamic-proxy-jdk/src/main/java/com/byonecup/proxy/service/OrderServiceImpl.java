package com.byonecup.proxy.service;

/**
 * @Title Spring6_Stu OrderServiceImpl
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/23 22:07
 * @Version 1.0
 */
public class OrderServiceImpl implements OrderService { // 目标对象

    @Override
    public String getName() {
        System.out.println("getName()...");
        return "turbo!";
    }

    @Override
    public void generate() {
        // 模拟生成订单的耗时
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已生成...");
    }

    @Override
    public void modify() {
        // 模拟修改订单的耗时
        try {
            Thread.sleep(456);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已修改...");
    }

    @Override
    public void detail() {
        // 模拟查看订单详情的耗时
        try {
            Thread.sleep(111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单详情...");
    }
}
