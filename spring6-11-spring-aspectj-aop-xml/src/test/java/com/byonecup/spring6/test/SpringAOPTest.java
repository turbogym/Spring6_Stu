package com.byonecup.spring6.test;

import com.byonecup.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu SpringAOPTest
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 21:49
 * @Version 1.0
 */
public class SpringAOPTest {
    @Test
    public void testXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.logout();
    }
}
