package com.byonecup.simple.factory;

/**
 * @Title Spring6_Stu Fighter
 * @Description 具体产品角色
 * @Author Turbo
 * @Date 2022/11/19 00:26
 * @Version 1.0
 */
public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("战斗机抛下小男孩！");
    }
}
