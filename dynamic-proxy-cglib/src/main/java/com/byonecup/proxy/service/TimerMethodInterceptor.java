package com.byonecup.proxy.service;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Title Spring6_Stu TimerMethodInterceptor
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 19:37
 * @Version 1.0
 */
public class TimerMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 前面增强
        long begin = System.currentTimeMillis();
        // 怎么调用目标对象的目标方法呢？
        Object retValue = methodProxy.invokeSuper(target, objects);
        // 后面增强
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - begin) + "毫秒");
        return retValue;
    }
}
