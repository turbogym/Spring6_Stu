package com.byonecup.spring6.bean;

/**
 * @Author Turbo
 * @Description 表示班级
 * @Date 2022/11/16 22:56
 * @Version 1.0
 */
public class Clazz {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}
