package com.byonecup.myspring.bean;

/**
 * @Title Spring6_Stu User
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/20 01:32
 * @Version 1.0
 */
public class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
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
