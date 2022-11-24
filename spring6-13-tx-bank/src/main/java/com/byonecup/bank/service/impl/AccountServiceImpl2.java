package com.byonecup.bank.service.impl;

import com.byonecup.bank.dao.AccountDao;
import com.byonecup.bank.pojo.Account;
import com.byonecup.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title Spring6_Stu AccountServiceImpl2
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/25 00:14
 * @Version 1.0
 */
@Service("accountService2")
public class AccountServiceImpl2 implements AccountService {

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    public void transfer(String fromActno, String toActno, double money) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Account act) {
        accountDao.insert(act);
        // 模拟异常
        String s = null;
        s.toString();

        // 事情没有处理完，这个括号当中的后续也许还有其它的DML语句。
    }
}
