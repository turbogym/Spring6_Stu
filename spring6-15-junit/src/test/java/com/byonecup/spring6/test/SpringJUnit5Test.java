package com.byonecup.spring6.test;

import com.byonecup.spring6.bean.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Title Spring6_Stu SpringJUnit5Test
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/25 02:11
 * @Version 1.0
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringJUnit5Test {

    @Autowired
    private User user;

    @Test
    public void testUser() {
        System.out.println(user.getName());
    }
}
