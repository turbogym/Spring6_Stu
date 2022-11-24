package com.byonecup.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Title Spring6_Stu Spring6Config
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/24 21:35
 * @Version 1.0
 */
@Configuration // 代替spring.xml文件
@ComponentScan({"com.byonecup.spring6.service"}) // 组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true) // 启用aspectj的自动代理机制。
public class Spring6Config {
}
