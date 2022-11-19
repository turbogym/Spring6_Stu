package com.byonecup.reflect;

import java.lang.reflect.Method;

/**
 * @Title Spring6_Stu Test3
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/20 01:09
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.byonecup.reflect.SomeService");
        Method doSome = clazz.getDeclaredMethod("doSome");
        Object o = clazz.newInstance();
        doSome.invoke(o);
    }
}
