package com.hbmz.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class MybatisConfig {

    @Bean
    //获取SqlSessionFactoryBean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {

        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        /**
            别名: 为自定义类, 取别名, 用于 Mapper中的 resultType
            <typeAliases>
                包扫描 resultType 大小写不敏感
                <package name="com.hbmz.pojo"/>

            </typeAliases>

         */
        ssfb.setTypeAliasesPackage("com.hbmz.pojo");

        ssfb.setDataSource(dataSource);

        return ssfb;


    }


    /**
     *      <mappers>
     *
     *                 加载映射文件
     *         告诉 mybatis 要执行的 sql 语句的位置
     *          <mapper resource="com\hbmz\mapper\StudentMapper.xml"/>
     *
     *               Mapper代理方式
     *
     *      </mappers>
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {

        MapperScannerConfigurer msc = new MapperScannerConfigurer();

        /**
         * <package name="com.hbmz.mapper"/>
         */
        msc.setBasePackage("com.hbmz.mapper");

        return msc;

    }

}
