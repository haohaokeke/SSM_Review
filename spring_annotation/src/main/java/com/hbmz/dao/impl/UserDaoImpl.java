package com.hbmz.dao.impl;

import com.hbmz.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {

    //添加简单类型
    @Value("${mysql.driver}")
    private String driver;

    public void save() {
        System.out.println("user dao save ..." + driver);
    }
}
