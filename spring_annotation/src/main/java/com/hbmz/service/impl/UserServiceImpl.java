package com.hbmz.service.impl;

import com.hbmz.dao.UserDao;
import com.hbmz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("user service save...");

        userDao.save();
    }

    //提供获取对象的方法 set
    public void setBookDao(UserDao userDao) {

        this.userDao = userDao;

    }

}
