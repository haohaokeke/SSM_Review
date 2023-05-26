package com.hbmz;

import com.hbmz.Config.SpringConfig;
import com.hbmz.dao.UserDao;
import com.hbmz.service.UserService;
import com.hbmz.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class springApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        //获取bean对象
        UserDao userDao = (UserDao) ctx.getBean("userDaoImpl");

        userDao.save();

        System.out.println("=========================================");

        UserService userService = ctx.getBean(UserService.class);

        userService.save();

    }

}
