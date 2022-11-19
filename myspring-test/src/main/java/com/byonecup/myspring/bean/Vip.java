package com.byonecup.myspring.bean;

/**
 * @Title Spring6_Stu Vip
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/20 03:47
 * @Version 1.0
 */
public class Vip {
    private String name;
    private int age;
    private double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
