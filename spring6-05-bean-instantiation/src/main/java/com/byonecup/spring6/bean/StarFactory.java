package com.byonecup.spring6.bean;

/**
 * @Title Spring6_Stu StarFactory
 * @Description 简单工厂模式中的工厂类角色
 * @Author Turbo
 * @Date 2022/11/19 01:27
 * @Version 1.0
 */
public class StarFactory {
    // 工厂类中有一个静态方法。
    // 简单工厂模式又叫做：静态工厂方法模式。
    public static Star get() {
        // 这个Star对象最终实际上创建的时候还是我们负责new的对象。
        return new Star();
    }
}
