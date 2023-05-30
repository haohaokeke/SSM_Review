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
    //配置mapper
    public MapperScannerConfigurer mapperScannerConfigurer() {

        MapperScannerConfigurer mscf = new MapperScannerConfigurer();

        mscf.setBasePackage("com.hbmz.mapper");

        return mscf;

    }

}
