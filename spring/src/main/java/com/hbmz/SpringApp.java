package com.hbmz;

import com.hbmz.dao.BookDao;
import com.hbmz.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        //获取容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean对象
        BookDao bookDaoImpl = (BookDao) applicationContext.getBean("BookDaoImpl");

        bookDaoImpl.save();

        System.out.println("=========================================");

        BookService bookServiceImpl = (BookService) applicationContext.getBean("BookServiceImpl");

        bookServiceImpl.save();

    }

}
