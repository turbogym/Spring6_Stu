package com.byonecup.factory.method;

/**
 * @Title Spring6_Stu GunFactory
 * @Description 具体工厂角色
 * @Author Turbo
 * @Date 2022/11/19 01:01
 * @Version 1.0
 */
public class GunFactory extends WeaponFactory {
    @Override
    public Weapon get() {
        return new Gun();
    }
}
