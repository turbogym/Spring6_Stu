package com.byonecup.bank.service;

import com.byonecup.bank.pojo.Account;

/**
 * @Title Spring6_Stu AccountService
 * @Description 业务接口，事务就是在这个接口下控制的。
 * @Author Turbo
 * @Date 2022/11/24 23:28
 * @Version 1.0
 */
public interface AccountService {

    /**
     * 转账业务方法
     * @param fromActno 从这个账户转出
     * @param toActno 转入这个账户
     * @param money 转账金额
     */
    void transfer(String fromActno, String toActno, double money);
}
