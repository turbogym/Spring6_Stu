package com.byonecup.spring6.bean;

/**
 * @Title Spring6_Stu Husband
 * @Description 丈夫类
 * @Author Turbo
 * @Date 2022/11/19 18:49
 * @Version 1.0
 */
public class Husband {
    private String name;
    private Wife wife;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
