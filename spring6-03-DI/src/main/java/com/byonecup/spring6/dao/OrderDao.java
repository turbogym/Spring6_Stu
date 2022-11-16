package com.byonecup.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/15 22:00
 * @Version 1.0
 */
public class OrderDao {
    private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);

    public void insert() {
        logger.info("订单正在生成...");
    }
}
