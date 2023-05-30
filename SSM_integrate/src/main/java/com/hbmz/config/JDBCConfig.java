package com.hbmz.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class JDBCConfig {

    @Value("${mysql.driver}")
    private String driver;

    @Value("${mysql.url}")
    private String url;

    @Value("${mysql.username}")
    private String username;

    @Value("${mysql.password}")
    private String password;

    @Bean
    public DataSource getDataSource() {

        DruidDataSource ds = new DruidDataSource();

        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);

        return ds;

    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {

        DataSourceTransactionManager dstm = new DataSourceTransactionManager();

        dstm.setDataSource(dataSource);

        return dstm;

    }

}
