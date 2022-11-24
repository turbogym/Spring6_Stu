package com.byonecup.proxy.util;

import com.byonecup.proxy.service.OrderService;
import com.byonecup.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @Title Spring6_Stu ProxyUtil
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 19:20
 * @Version 1.0
 */
public class ProxyUtil {
    /**
     * 封装一个工具方法，可以通过这个方法获取代理对象。
     * @param target
     * @return
     */
    public static Object newProxyInstance(Object target) {
        // 底层是调用的还是JDK的动态代理。
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TimerInvocationHandler(target));
    }
}
