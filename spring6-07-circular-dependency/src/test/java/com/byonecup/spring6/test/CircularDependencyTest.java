package com.byonecup.spring6.test;

import com.byonecup.spring6.bean.Husband;
import com.byonecup.spring6.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu CircularDependencyTest
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/19 23:06
 * @Version 1.0
 */
public class CircularDependencyTest {

    @Test
    public void testCD() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Husband husbandBean = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(wifeBean);
    }

    @Test
    public void testCD2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        com.byonecup.spring6.bean2.Husband h = applicationContext.getBean("h", com.byonecup.spring6.bean2.Husband.class);
        System.out.println(h);
        com.byonecup.spring6.bean2.Wife w = applicationContext.getBean("w", com.byonecup.spring6.bean2.Wife.class);
        System.out.println(w);
    }
}
