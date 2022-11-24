package com.byonecup.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Title Spring6_Stu TransactionAspect
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 22:05
 * @Version 1.0
 */
@Component
@Aspect
public class TransactionAspect {

    // 编程式事务解决方案。
    @Around("execution(* com.byonecup.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        try {
            // 前环绕
            System.out.println("开启事务");
            // 执行目标
            joinPoint.proceed();
            // 后环绕
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");
        }
    }
}
