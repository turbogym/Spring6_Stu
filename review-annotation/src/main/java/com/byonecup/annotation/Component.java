package com.byonecup.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Title Spring6_Stu Component
 * @Description 自定义注解
 * @Author Turbo
 * @Date 2022/11/21 10:19
 * @Version 1.0
 */

// 标注注解的注解，叫做元注解。@Target注解用来修饰@Component可以出现的位置。
// 以下表示@Component注解可以出现在类上、属性上
//@Target(value = {ElementType.TYPE, ElementType.FIELD})
// 使用某个注解的时候，如果注解的属性名是value的话，value可以省略。
//@Target({ElementType.TYPE, ElementType.FIELD})
// 使用某个注解的时候，如果注解的属性值是数组，并且数组中只有一个元素，大括号可以省略。
@Target(ElementType.TYPE)
// @Retention也是一个元注解。用来标注@Component注解最终保留在class文件当中，并且可以被反射机制读取。
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {

    // 定义注解的属性
    // String是属性类型
    // value是属性名
    String value();

    // 其它的属性
    // 属性类型String
    // 属性名name
//    String name();

    // 数组属性
    // 属性类型是：String[]
    // 属性名是：names
//    String[] names();
}
