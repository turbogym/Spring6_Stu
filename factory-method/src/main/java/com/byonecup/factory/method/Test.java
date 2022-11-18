package com.byonecup.factory.method;

/**
 * @Title Spring6_Stu Test
 * @Description 客户端程序
 * @Author Turbo
 * @Date 2022/11/19 01:05
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        WeaponFactory weaponFactory = new DaggerFactory();
        Weapon dagger = weaponFactory.get();
        dagger.attack();

        WeaponFactory weaponFactory1 = new GunFactory();
        Weapon gun = weaponFactory1.get();
        gun.attack();
    }
}
