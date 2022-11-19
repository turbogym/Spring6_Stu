package com.byonecup.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Title Spring6_Stu LogBeanPostProcessor
 * @Description 日志Bean后处理器
 * @Author Turbo
 * @Date 2022/11/19 11:31
 * @Version 1.0
 */
public class LogBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行Bean后处理器的Before方法。");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    // 方法有两个参数：
    //  第一个参数：刚创建的Bean对象。
    //  第二个参数：bean的名字。
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行Bean后处理器的After方法。");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
