package com.byonecup.spring6.test;

import com.byonecup.spring6.bean.*;
import com.byonecup.spring6.dao.UserDao;
import com.byonecup.spring6.dao.VIPDao;
import com.byonecup.spring6.jdbc.MyDataSource;
import com.byonecup.spring6.jdbc.MyDataSource1;
import com.byonecup.spring6.jdbc.MyDataSource2;
import com.byonecup.spring6.service.CustomerService;
import com.byonecup.spring6.service.OrderService;
import com.byonecup.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/15 19:52
 * @Version 1.0
 */
public class SpringDITest {
    public static void main(String[] args) {
        System.out.println(new Date());
    }

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

    @Test
    public void testSetDI2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setDI.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean.generate();

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("setDI.xml");
        OrderService orderServiceBean2 = applicationContext1.getBean("orderServiceBean2", OrderService.class);
        orderServiceBean2.generate();
    }

    @Test
    public void testSimpleTypeSet() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setDI.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }

    @Test
    public void testSimpleTypeSet2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setDI.xml");
        SimpleValueType svtBean = applicationContext.getBean("svtBean", SimpleValueType.class);
        System.out.println(svtBean);
    }

    @Test
    public void testMyDataSource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setDI.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testCascade() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
        Clazz clazzBean = applicationContext.getBean("clazzBean", Clazz.class);
        System.out.println(clazzBean);
    }

    @Test
    public void testArray() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        Turbo turbo = applicationContext.getBean("turbo", Turbo.class);
        System.out.println(turbo);
    }

    @Test
    public void testCollection() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
    }

    @Test
    public void testNull() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setDI.xml");
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean.getName().toUpperCase());
    }

    @Test
    public void testSpecial() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setDI.xml");
        MathBean mathBean = applicationContext.getBean("mathBean", MathBean.class);
        System.out.println(mathBean);
    }

    @Test
    public void testP() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dogBean = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dogBean);
    }

    @Test
    public void testC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        People peopelBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopelBean);
    }

    @Test
    public void testUtil() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource1 ds1 = applicationContext.getBean("ds1", MyDataSource1.class);
        System.out.println(ds1);
        MyDataSource2 ds2 = applicationContext.getBean("ds2", MyDataSource2.class);
        System.out.println(ds2);
    }

    @Test
    public void testAutowire() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
//        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
//        orderServiceBean.generate();

        CustomerService cs = applicationContext.getBean("cs", CustomerService.class);
        cs.save();
    }
}
