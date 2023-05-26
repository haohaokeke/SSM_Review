package com.hbmz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.hbmz")
@PropertySource("classpath:db.properties")
@Import({JDBCConfig.class, MybatisConfig.class})

//开启注解式事务
@EnableTransactionManagement
public class SpringConfig {
}
