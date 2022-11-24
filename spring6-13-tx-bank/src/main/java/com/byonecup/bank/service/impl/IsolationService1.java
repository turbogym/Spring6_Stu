package com.byonecup.bank.service.impl;

import com.byonecup.bank.dao.AccountDao;
import com.byonecup.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title Spring6_Stu IsolationService1
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/25 00:46
 * @Version 1.0
 */
@Service("i1")
public class IsolationService1 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    // 1号Service
    // 负责查询
    // 当前事务可以读取到别的事务没有提交的数据
//    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    // 对方事务提交后的数据才能读取到。
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void getByActno(String actno) {
        Account account = accountDao.selectByActno(actno);
        System.out.println("查询到的账户信息：" + account);
    }
}
