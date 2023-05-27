package com.hbmz.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.hbmz.mapper", "com.hbmz.service"})
@PropertySource("classpath:db.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
public class SpringConfig {
}
