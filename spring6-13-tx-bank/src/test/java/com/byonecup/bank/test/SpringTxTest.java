package com.byonecup.bank.test;

import com.byonecup.bank.pojo.Account;
import com.byonecup.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu SpringTxTest
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 23:41
 * @Version 1.0
 */
public class SpringTxTest {
    @Test
    public void testSpringTx() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 10000);
            System.out.println("转账成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPropagation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // 获取1号service对象
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        Account act = new Account("act-003", 1000.0);
        accountService.save(act);
    }
}
