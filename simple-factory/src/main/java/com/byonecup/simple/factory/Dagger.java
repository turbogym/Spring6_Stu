package com.byonecup.simple.factory;

/**
 * @Title Spring6_Stu Dagger
 * @Description 具体产品角色
 * @Author Turbo
 * @Date 2022/11/19 00:27
 * @Version 1.0
 */
public class Dagger extends Weapon{
    @Override
    public void attack() {
        System.out.println("砍丫的！！！");
    }
}
