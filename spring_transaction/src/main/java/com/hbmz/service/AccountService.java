package com.hbmz.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {

    //开启事务
    @Transactional
    public void transfer(String out, String in, Double money);

}
