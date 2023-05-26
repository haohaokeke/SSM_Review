package com.hbmz;

import com.hbmz.config.SpringConfig;
import com.hbmz.method.FirstMethod;
import com.hbmz.method.SecondMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        FirstMethod bean1 = ctx.getBean(FirstMethod.class);

        bean1.method();
        System.out.println("========================");

        SecondMethod bean2 = ctx.getBean(SecondMethod.class);
        bean2.method();

    }


}
