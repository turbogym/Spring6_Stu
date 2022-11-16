package com.byonecup.spring6.bean;

/**
 * @Author Turbo
 * @Description 表示学生
 * @Date 2022/11/16 22:56
 * @Version 1.0
 */
public class Student {
    private String name;

    // 学生属于哪个班级
    private Clazz clazz;

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 使用级联属性赋值，这里需要get方法
    public Clazz getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
