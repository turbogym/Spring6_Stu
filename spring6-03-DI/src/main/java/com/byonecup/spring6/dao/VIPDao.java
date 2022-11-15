package com.byonecup.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/15 20:14
 * @Version 1.0
 */
public class VIPDao {
    private static final Logger logger = LoggerFactory.getLogger(VIPDao.class);

    public void insert() {
        logger.info("VIP信息正在保存到数据库...");
    }
}
