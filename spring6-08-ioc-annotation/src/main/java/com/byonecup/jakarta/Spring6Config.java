package com.byonecup.jakarta;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Title Spring6_Stu Spring6Config
 * @Description 编写一个类，代替Spring框架的配置文件
 * @Author Turbo
 * @Date 2022/11/22 02:28
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.byonecup.jakarta.dao", "com.byonecup.jakarta.service"})
public class Spring6Config {
}
