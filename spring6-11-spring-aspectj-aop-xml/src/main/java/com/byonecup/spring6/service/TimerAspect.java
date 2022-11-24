package com.byonecup.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Title Spring6_Stu TimerAspect
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 21:41
 * @Version 1.0
 */
public class TimerAspect {
    // 通知
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        // 前环绕
        long begin = System.currentTimeMillis();
        // 目标
        joinPoint.proceed();
        // 后环绕
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - begin) + "毫秒");
    }
}
