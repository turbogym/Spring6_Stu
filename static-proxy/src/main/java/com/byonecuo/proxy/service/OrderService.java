package com.byonecuo.proxy.service;

/**
 * @Title Spring6_Stu OrderService
 * @Description 订单业务接口
 * @Author Turbo
 * @Date 2022/11/23 22:06
 * @Version 1.0
 */
public interface OrderService { // 代理对象和目标对象的公共接口

    /**
     * 生成订单
     */
    void generate();

    /**
     * 修改订单信息
     */
    void modify();

    /**
     * 查看订单详情
     */
    void detail();
}
