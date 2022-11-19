package org.myspringframework.core;

/**
 * @Title Spring6_Stu ApplicationContext
 * @Description MySpring框架应用上下文接口
 * @Author Turbo
 * @Date 2022/11/20 02:20
 * @Version 1.0
 */
public interface ApplicationContext {

    /**
     * 根据Bean的名称获取Bean对象
     * @param beanName myspring配置文件中bean标签的id
     * @return 对应的单例Bean对象
     */
    Object getBean(String beanName);
}
