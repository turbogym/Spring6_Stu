package com.byonecup.bank.test;

import com.byonecup.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu BankTxTest
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/25 01:51
 * @Version 1.0
 */
public class BankTxTest {
    @Test
    public void testNoAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 10000.0);
            System.out.println("转账成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
