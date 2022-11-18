package com.byonecup.spring6.test;

import com.byonecup.spring6.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu BeanInstatiation
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/19 01:22
 * @Version 1.0
 */
public class BeanInstantiationTest {
    @Test
    public void testInstantiation1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);
    }

    @Test
    public void testInstantiation2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Star star = applicationContext.getBean("starBean", Star.class);
        System.out.println(star);
    }

    @Test
    public void testInstantiation3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = applicationContext.getBean("gun", Gun.class);
        System.out.println(gun);
    }

    @Test
    public void testInstantiation4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void testDate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);

        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
    }
}
