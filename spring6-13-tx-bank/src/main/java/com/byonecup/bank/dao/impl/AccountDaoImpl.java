package com.byonecup.bank.dao.impl;

import com.byonecup.bank.dao.AccountDao;
import com.byonecup.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Title Spring6_Stu AccountDaoImpl
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 23:22
 * @Version 1.0
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectByActno(String actno) {
        String sql = "select actno, balance from t_act where actno = ?";
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), actno);
        return account;
    }

    @Override
    public int update(Account act) {
        String sql = "update t_act set balance = ? where actno = ?";
        int count = jdbcTemplate.update(sql, act.getBalance(), act.getActno());
        return count;
    }

    @Override
    public int insert(Account act) {
        String sql = "insert into t_act values(?, ?)";
        return jdbcTemplate.update(sql, act.getActno(), act.getBalance());
    }
}
