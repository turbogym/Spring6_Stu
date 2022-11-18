package com.byonecup.simple.factory;

/**
 * @Title Spring6_Stu Test
 * @Description 这是客户端程序
 * @Author Turbo
 * @Date 2022/11/19 00:39
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 需要坦克
        // 对于客户端来说，坦克的生产细节不需要关心，只需要向工厂索要即可。
        // 简单工厂模式达到了什么？ => 职责分离
        // 客户端只负责消费。工厂类负责生产。一个负责生产，一个负责消费。生产者和消费者分离了。这就是简单工厂模式的作用。
        Weapon tank = WeaponFactory.get("Tank");
        tank.attack();
        // 需要匕首
        Weapon dagger = WeaponFactory.get("Dagger");
        dagger.attack();
        // 需要战斗机
        Weapon fighter = WeaponFactory.get("Fighter");
        fighter.attack();
    }
}
