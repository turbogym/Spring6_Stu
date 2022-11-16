package com.byonecup.spring6.bean;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/16 23:42
 * @Version 1.0
 */
public class Cat {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
