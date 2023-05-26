package com.hbmz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

//设置为配置类
@Configuration

//扫描Bean
@ComponentScan("com.hbmz")

//获取资源文件
@PropertySource("classpath:db.properties")

//导入第三方配置类
@Import({JDBCConfig.class, MybatisConfig.class})
public class SpringConfig {
}
