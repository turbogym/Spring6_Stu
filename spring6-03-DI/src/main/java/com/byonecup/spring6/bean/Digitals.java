package com.byonecup.spring6.bean;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/16 23:21
 * @Version 1.0
 */
public class Digitals {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Digitals{" +
                "name='" + name + '\'' +
                '}';
    }
}
