package com.byonecup.simple.factory;

/**
 * @Title Spring6_Stu WeaponFactory
 * @Description 工厂类角色
 * @Author Turbo
 * @Date 2022/11/19 00:28
 * @Version 1.0
 */
public class WeaponFactory {

    /**
     * 静态方法要获取什么产品？就看传什么参数，传Tank获取坦克，传Dagger获取匕首，传Fighter获取战斗机。
     * 简单工厂模式中有一个静态方法，所以被称为：静态工厂方法模式。
     * @param weaponType
     * @return
     */
    public static Weapon get(String weaponType) {
        if ("Tank".equals(weaponType)) {
            return new Tank();
        } else if ("Dagger".equals(weaponType)) {
            return new Dagger();
        } else if ("Fighter".equals(weaponType)) {
            return new Fighter();
        } else {
            throw new RuntimeException("不支持该武器的生产");
        }
    }

}
