package com.byonecup.spring6.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Title Spring6_Stu User
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/22 01:44
 * @Version 1.0
 */
@Component
public class User {
//    @Value("隔壁老王")
//    private String name;
//
//    @Value("30")
//    private int age;

    private String name;
    private int age;

    // @Value注解也可以用在方法上。
//    @Value("隔壁老王")
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Value("30")
//    public void setAge(int age) {
//        this.age = age;
//    }


    public User(@Value("隔壁老王") String name, @Value("33") int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
