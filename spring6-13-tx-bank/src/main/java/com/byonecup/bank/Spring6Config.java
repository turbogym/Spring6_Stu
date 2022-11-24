package com.byonecup.bank;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Title Spring6_Stu Spring6Config
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/25 01:11
 * @Version 1.0
 */
@Configuration // 代替spring.xmlp配置文件，在这个类当中完成配置。
@ComponentScan("com.byonecup.bank") // 组件扫描
@EnableTransactionManagement // 开启事务注解
public class Spring6Config {

    // Spring框架，看到这个@Bean注解后，会调用这个被标注的方法，这个方法的返回值是一个java对象，这个java对象会自动纳入IoC容器管理。
    // 返回的对象就是Spring容器当中的一个Bean了。
    // 并且这个Bean的名字是：dataSource
    @Bean(name = "dataSource")
    public DruidDataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring6_stu");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) { // Spring在调用这个方法的时候会自动给我们传递过来一个dataSource对象。
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean(name = "txManager")
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(dataSource);
        return txManager;
    }
}
