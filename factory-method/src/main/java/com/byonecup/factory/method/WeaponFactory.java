package com.byonecup.factory.method;

/**
 * @Title Spring6_Stu WeaponFactory
 * @Description 抽象工厂角色
 * @Author Turbo
 * @Date 2022/11/19 01:00
 * @Version 1.0
 */
public abstract class WeaponFactory {
    /**
     * 这个方法不是静态的。是实例方法。
     * @return
     */
    public abstract Weapon get();
}
