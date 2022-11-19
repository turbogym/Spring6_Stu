package com.byonecup.myspring.bean;

/**
 * @Title Spring6_Stu OrderService
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/20 03:48
 * @Version 1.0
 */
public class OrderService {

    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate() {
        orderDao.insert();
    }
}
