package com.byonecup.spring6.service;

import com.byonecup.spring6.dao.OrderDao;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/15 22:02
 * @Version 1.0
 */
public class OrderService {
    private OrderDao orderDao;

    // 通过set方法给属性赋值
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    /**
     * 生成订单的业务方法...
     */
    public void generate() {
        orderDao.insert();
    }
}
