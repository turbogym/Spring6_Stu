package com.byonecup.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Title Spring6_Stu SecurityLogAspect
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 22:18
 * @Version 1.0
 */
@Component
@Aspect
public class SecurityLogAspect {

    @Pointcut("execution(* com.byonecup.spring6.biz..save*(..))")
    public void savePointCut() {}

    @Pointcut("execution(* com.byonecup.spring6.biz..delete*(..))")
    public void deletePointCut() {}

    @Pointcut("execution(* com.byonecup.spring6.biz..modify*(..))")
    public void modifyPointCut() {}

    @Pointcut("execution(* com.byonecup.spring6.biz..get*(..))")
    public void getPointCut() {}

    @Before("savePointCut() || deletePointCut() || modifyPointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        // 系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTime = sdf.format(new Date());
        // 输出日志信息
        System.out.println(nowTime + "turbo : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
    }
}
