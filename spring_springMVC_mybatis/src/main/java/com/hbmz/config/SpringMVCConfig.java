package com.hbmz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.hbmz.controller")
@EnableWebMvc
public class SpringMVCConfig {

}
