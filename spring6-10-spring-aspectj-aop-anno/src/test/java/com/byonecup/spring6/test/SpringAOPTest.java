package com.byonecup.spring6.test;

import com.byonecup.spring6.service.OrderService;
import com.byonecup.spring6.service.Spring6Config;
import com.byonecup.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu SpringAOPTest
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 20:53
 * @Version 1.0
 */
public class SpringAOPTest {
    @Test
    public void testBefore() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        UserService userService = applicationContext.getBean("userService", UserService.class);
//        userService.login();
//        userService.logout();

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testNoXML() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}
