package com.hbmz;

import com.hbmz.config.JDBCConfig;
import com.hbmz.config.MybatisConfig;
import com.hbmz.config.SpringConfig;
import com.hbmz.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ConfigTest {

    @Autowired
    private AccountService accountService;

    @Autowired
    private JDBCConfig jdbcConfig;

    @Autowired
    private MybatisConfig mybatisConfig;

    @Test
    public void testJdbc() {

        DataSource ds = jdbcConfig.dataSource();

        System.out.println(ds);

    }

    @Test
    public void testMybatis() {

        MapperScannerConfigurer msc = mybatisConfig.mapperScannerConfigurer();

        System.out.println(msc);

    }

    @Test
    public void testMapper() {

        System.out.println(accountService.selectById(2));

        System.out.println("=====================================");

        System.out.println(accountService.selectAll());

    }



}
