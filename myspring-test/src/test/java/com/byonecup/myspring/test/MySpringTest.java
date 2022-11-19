package com.byonecup.myspring.test;

import com.byonecup.myspring.bean.OrderService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu MySpringTest
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/20 03:53
 * @Version 1.0
 */
public class MySpringTest {
    @Test
    public void testMySpring() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        Object vip = applicationContext.getBean("vip");
        System.out.println(vip);

        OrderService orderService = (OrderService) applicationContext.getBean("orderServiceBean");
        orderService.generate();
    }
}
