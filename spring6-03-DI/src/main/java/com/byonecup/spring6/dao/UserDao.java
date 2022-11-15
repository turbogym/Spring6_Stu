package com.byonecup.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/15 19:46
 * @Version 1.0
 */
public class UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert() {
        // 使用logger4j2日志框架
        logger.info("数据库正在保存用户信息...");
    }
}
