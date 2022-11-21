package com.byonecup.spring6.test;

import com.byonecup.jakarta.Spring6Config;
import com.byonecup.jakarta.service.StudentService;
import com.byonecup.service.OrderService;
import com.byonecup.spring6.bean.Order;
import com.byonecup.spring6.bean.Student;
import com.byonecup.spring6.bean.User;
import com.byonecup.spring6.bean.Vip;
import com.byonecup.spring6.bean3.MyDataSource;
import com.byonecup.spring6.dao.OrderDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title Spring6_Stu IoCAnnotationTest
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/22 01:08
 * @Version 1.0
 */
public class IoCAnnotationTest {
    @Test
    public void testBeanComponent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
        Vip vipBean = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vipBean);
        Order orderBean = applicationContext.getBean("order", Order.class);
        System.out.println(orderBean);
        Student studentBean = applicationContext.getBean("student", Student.class);
        System.out.println(studentBean);

        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);
    }

    @Test
    public void testChoose() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");
    }

    @Test
    public void testDIByAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);

        com.byonecup.spring6.bean3.User user = applicationContext.getBean("user", com.byonecup.spring6.bean3.User.class);
        System.out.println(user);
    }

    @Test
    public void testAutowired() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testResource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-resource.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }

    @Test
    public void testNoXML() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        StudentService studentService = annotationConfigApplicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }
}
