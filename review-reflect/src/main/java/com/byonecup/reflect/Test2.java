package com.byonecup.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Title Spring6_Stu Test2
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/20 00:52
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        // 使用反射机制怎么调用方法。
        // 获取类
        Class<?> clazz = Class.forName("com.byonecup.reflect.SomeService");

        // 获取方法
        Method doSomeMethod = clazz.getDeclaredMethod("doSome", String.class, int.class);

        // 调用方法
        // 四要素：调用哪个对象、哪个方法、传什么参数、返回什么值。
        Object obj = clazz.newInstance();
//        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
//        Object o = declaredConstructor.newInstance();

        Object retValue = doSomeMethod.invoke(obj, "李四", 250);
        System.out.println(retValue);
    }
}
