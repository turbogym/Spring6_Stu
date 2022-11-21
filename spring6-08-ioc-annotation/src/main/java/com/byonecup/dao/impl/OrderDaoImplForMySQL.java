package com.byonecup.dao.impl;

import com.byonecup.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * @Title Spring6_Stu OrderDaoImpl
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/22 01:55
 * @Version 1.0
 */

//@Repository
public class OrderDaoImplForMySQL implements OrderDao {
    @Override
    public void insert() {
        System.out.println("MySQL数据库正在保存订单信息...");
    }
}
