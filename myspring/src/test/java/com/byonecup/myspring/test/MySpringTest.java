package com.byonecup.myspring.test;

import com.byonecup.myspring.bean.User;
import com.byonecup.myspring.bean.UserService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu MySpringTest
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/20 02:37
 * @Version 1.0
 */
public class MySpringTest {
    @Test
    public void testMySpring() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
}
