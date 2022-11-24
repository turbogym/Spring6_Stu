package com.byonecup.bank.service.impl;

import com.byonecup.bank.dao.AccountDao;
import com.byonecup.bank.pojo.Account;
import com.byonecup.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title Spring6_Stu AccountServiceImpl
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 23:30
 * @Version 1.0
 */
@Service("accountService")
//@Transactional
public class AccountServiceImpl implements AccountService {

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    // 控制事务，因为在这个方法中要完成所有的转账业务。
    @Override
    @Transactional
    public void transfer(String fromActno, String toActno, double money) {

        // 第一步：开启事务


        // 第二步：执行核心业务逻辑
        // 查询转出账户的余额是否充足
        Account fromAct = accountDao.selectByActno(fromActno);
        if (fromAct.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }
        // 余额充足
        Account toAct = accountDao.selectByActno(toActno);

        // 将内存中两个对象的余额先修改。
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);

        // 数据库更新
        int count = accountDao.update(fromAct);

        // 模拟异常
//        String s = null;
//        s.toString();

        count += accountDao.update(toAct);
        if (count != 2) {
            throw new RuntimeException("转账失败！");
        }

        // 第三步：如果执行业务流程过程中，没有异常。提交事务

        // 第四步：如果执行业务流程过程中，有异常，回滚事务


//        withdraw();
    }


    @Resource(name = "accountService2")
    private AccountService accountService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account act) {
        // 这里调用dao的insert方法。
        accountDao.insert(act);

        // 创建账户对象
        Account act2 = new Account("act-004", 1000.0);

        try {
            accountService.save(act2);
        } catch (Exception e) {

        }

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void withdraw() {}
}
