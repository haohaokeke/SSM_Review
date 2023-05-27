package com.hbmz.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sessionFactoryBean(DataSource dataSource) {

        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        ssfb.setTypeAliasesPackage("com.hbmz.pojo");

        ssfb.setDataSource(dataSource);

        return ssfb;

    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {

        MapperScannerConfigurer msc = new MapperScannerConfigurer();

        msc.setBasePackage("com.hbmz.mapper");

        return msc;

    }

}
