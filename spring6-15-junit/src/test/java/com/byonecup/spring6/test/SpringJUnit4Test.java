package com.byonecup.spring6.test;

import com.byonecup.spring6.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title Spring6_Stu SpringJUnit4Test
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/25 02:06
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringJUnit4Test {

    @Autowired
    private User user;

    @Test
    public void testUser() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.getName());
    }

    @Test
    public void testUser2() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.getName());
    }

    @Test
    public void testUser3() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
