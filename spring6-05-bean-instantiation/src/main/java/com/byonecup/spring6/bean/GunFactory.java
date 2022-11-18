package com.byonecup.spring6.bean;

/**
 * @Title Spring6_Stu GunFactory
 * @Description 工厂方法模式当中的：具体工厂角色
 * @Author Turbo
 * @Date 2022/11/19 01:41
 * @Version 1.0
 */
public class GunFactory {
    // 工厂方法模式中的具体工厂角色中的方法是：实例方法。
    public Gun get() {
        return new Gun();
    }
}
