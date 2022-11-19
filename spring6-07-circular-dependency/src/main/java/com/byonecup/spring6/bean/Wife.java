package com.byonecup.spring6.bean;

/**
 * @Title Spring6_Stu Wife
 * @Description 妻子类
 * @Author Turbo
 * @Date 2022/11/19 18:50
 * @Version 1.0
 */
public class Wife {
    private String name;
    private Husband husband;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }
}
