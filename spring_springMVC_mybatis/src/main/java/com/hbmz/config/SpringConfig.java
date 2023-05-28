package com.hbmz.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.hbmz.mapper", "com.hbmz.service"})

//注意要写全, 否则报错
@PropertySource("classpath:db.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
public class SpringConfig {
}
