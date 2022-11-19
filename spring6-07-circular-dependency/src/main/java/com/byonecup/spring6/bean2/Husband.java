package com.byonecup.spring6.bean2;

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

    public Husband(String name, Wife wife) {
        this.name = name;
        this.wife = wife;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
