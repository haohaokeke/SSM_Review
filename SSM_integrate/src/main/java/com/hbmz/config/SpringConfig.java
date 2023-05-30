package com.hbmz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:db.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
@ComponentScan({"com.hbmz.mapper", "com.hbmz.service"})
@EnableTransactionManagement
public class SpringConfig {

}
