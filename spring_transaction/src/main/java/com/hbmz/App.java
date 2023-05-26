package com.hbmz;

import com.hbmz.config.JDBCConfig;
import com.hbmz.config.MybatisConfig;
import com.hbmz.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(SpringConfig.class);
        MybatisConfig bean = acac.getBean(MybatisConfig.class);

        System.out.println(bean);

    }

}
