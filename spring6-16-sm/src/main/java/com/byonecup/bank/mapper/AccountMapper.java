package com.byonecup.bank.mapper;

import com.byonecup.bank.pojo.Account;

import java.util.List;

/**
 * @Title Spring6_Stu AccountMaaper
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/25 02:25
 * @Version 1.0
 */
public interface AccountMapper {
    /**
     * 保存账户
     * @param account
     * @return
     */
    int insert(Account account);

    /**
     * 根据账号删除账户
     * @param actno
     * @return
     */
    int deleteByActno(String actno);

    /**
     * 修改账户
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 根据账号查询账户
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 获取所有账户
     * @return
     */
    List<Account> selectAll();
}
