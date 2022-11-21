package com.byonecup.dao.impl;

import com.byonecup.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * @Title Spring6_Stu OrderDaoImplForOracle
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/22 02:03
 * @Version 1.0
 */
@Repository
public class OrderDaoImplForOracle implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Oracle数据库正在生成订单信息...");
    }
}
