package com.byonecup.spring6.bean2;

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

    public Wife(String name, Husband husband) {
        this.name = name;
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }
}
