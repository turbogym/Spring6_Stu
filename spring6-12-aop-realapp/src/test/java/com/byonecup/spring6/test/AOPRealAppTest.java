package com.byonecup.spring6.test;

import com.byonecup.spring6.biz.UserService;
import com.byonecup.spring6.biz.VipService;
import com.byonecup.spring6.service.AccountService;
import com.byonecup.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu AOPRealAppTest
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 22:11
 * @Version 1.0
 */
public class AOPRealAppTest {
    @Test
    public void testTransaction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer();
        accountService.withdraw();

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
        orderService.cancel();
    }

    @Test
    public void testSecurityLog() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser();
        userService.modifyUser();
        userService.deleteUser();
        userService.getUser();

        VipService vipService = applicationContext.getBean("vipService", VipService.class);
        vipService.saveVip();
        vipService.deleteVip();
        vipService.modifyVip();
        vipService.getVip();
    }
}
