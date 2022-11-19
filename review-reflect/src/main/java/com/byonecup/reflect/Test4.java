package com.byonecup.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Title Spring6_Stu Test4
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/20 01:13
 * @Version 1.0
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        /**
         * 需求：
         *      假设现在已知以下信息：
         *          1. 有这样一个类，类名叫做：com.byonecup.reflect.User
         *          2. 这个类符合javabean规范。属性私有化，对外提供公开的setter和getter方法。
         *          3. 还知道这个类当中有一个属性，属性的名字叫做age
         *          4. 并且还知道age属性的类型是int类型
         *      请使用反射机制调用set方法，给User对象的age属性赋值。
         */
        String className = "com.byonecup.reflect.User";
        String propertyName = "age";

        // 通过反射机制调用setAge(int)方法
        // 获取类
        Class<?> clazz = Class.forName(className);

        // 获取方法名
        String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);

        // 根据属性名获取属性类型
        Field field = clazz.getDeclaredField(propertyName);

        // 获取方法
        Method setMethod = clazz.getDeclaredMethod(setMethodName, field.getType());

        // 准备对象
        Object o = clazz.newInstance();

        // 调用方法
        setMethod.invoke(o, 18);

        System.out.println(o);
    }
}
