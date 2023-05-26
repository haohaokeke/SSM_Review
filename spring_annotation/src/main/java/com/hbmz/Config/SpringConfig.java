package com.hbmz.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//标记为配置类
@Configuration

//扫描Bean
@ComponentScan("com.hbmz")

//添加资源文件源
@PropertySource("db.properties")
public class SpringConfig {


}
