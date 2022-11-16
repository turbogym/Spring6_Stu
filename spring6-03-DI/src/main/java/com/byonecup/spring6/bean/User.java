package com.byonecup.spring6.bean;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/16 20:53
 * @Version 1.0
 */
public class User {
    private String username;
    private String password;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
