package com.hbmz;

import com.hbmz.config.JDBCConfig;
import com.hbmz.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppT {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(SpringConfig.class);

        JDBCConfig bean = a.getBean(JDBCConfig.class);

        System.out.println(bean);

    }

}
