package com.byonecup.spring6.test;

import com.byonecup.spring6.dao.UserDao;
import com.byonecup.spring6.service.CustomerService;
import com.byonecup.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/15 19:52
 * @Version 1.0
 */
public class SpringDITest {
    @Test
    public void testSetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }

    @Test
    public void testConstructDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        customerService.save();

        CustomerService csService = applicationContext.getBean("csService", CustomerService.class);
        csService.save();

        CustomerService csService2 = applicationContext.getBean("csService2", CustomerService.class);
        csService2.save();
    }
}
