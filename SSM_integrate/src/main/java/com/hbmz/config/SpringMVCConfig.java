package com.hbmz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.hbmz.controller", "com.hbmz.service", "com.hbmz.config"})
@EnableWebMvc
public class SpringMVCConfig {
}
