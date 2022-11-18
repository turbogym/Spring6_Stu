package com.byonecup.factory.method;

/**
 * @Title Spring6_Stu Gun
 * @Description 具体产品角色
 * @Author Turbo
 * @Date 2022/11/19 00:59
 * @Version 1.0
 */
public class Gun extends Weapon {
    @Override
    public void attack() {
        System.out.println("开枪射击！");
    }
}
