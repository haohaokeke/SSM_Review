package com.hbmz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.hbmz")
@EnableAspectJAutoProxy
public class SpringConfig {

}
