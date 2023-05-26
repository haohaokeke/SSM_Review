package com.hbmz;

import com.hbmz.config.SpringConfig;
import com.hbmz.mapper.UserMapper;
import com.hbmz.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppSDM {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        //获取Bean
        UserMapper userMapper = ctx.getBean(UserMapper.class);

//        List<User> user = userMapper.selectAll();
//
//        System.out.println(user);

        User user = userMapper.selectByUsername("root");

        System.out.println(user);

        List<User> userList = userMapper.selectByUserNamePassword("zhangsan", "123456");

        System.out.println("==================================");

        for (User user1 : userList) {
            System.out.println(user1);
        }

        System.out.println(user);


    }

}
