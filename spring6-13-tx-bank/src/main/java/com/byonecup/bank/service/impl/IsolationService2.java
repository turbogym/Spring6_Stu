package com.byonecup.bank.service.impl;

import com.byonecup.bank.dao.AccountDao;
import com.byonecup.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @Title Spring6_Stu IsolationService2
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/25 00:47
 * @Version 1.0
 */
@Service("i2")
public class IsolationService2 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    // 2号Service
    // 负责insert
//    @Transactional(readOnly = true, timeout = 10) // 设置事务超时时间为10秒
//    @Transactional(rollbackFor = RuntimeException.class) // 只要发生RuntimeException或者这个异常的子类异常都回滚
    @Transactional(noRollbackFor = NullPointerException.class) // 当异常是空指针异常的时候不回滚
    public void save(Account act) throws IOException {
//        try {
//            Thread.sleep(1000 * 20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        accountDao.insert(act);
        // 模拟异常
        if (1 == 1) {
//            throw new IOException();
            throw new RuntimeException();
//            throw new NullPointerException();
        }

//        try {
//            Thread.sleep(1000 * 20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // 可以在这里写一个无关紧要的DML语句
    }
}
