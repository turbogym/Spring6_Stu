package com.byonecup.bank.dao;

import com.byonecup.bank.pojo.Account;

/**
 * @Title Spring6_Stu AccountDao
 * @Description 专门负责账户信息的CRUD操作。DAO中只执行SQL语句，没有任何业务逻辑。也就是说DAO不和业务挂钩。
 * @Author Turbo
 * @Date 2022/11/24 23:17
 * @Version 1.0
 */
public interface AccountDao {

    /**
     * 根据账号查询账户信息
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 更新账户信息
     * @param act
     * @return
     */
    int update(Account act);
}
