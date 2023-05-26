package com.hbmz.service;

import com.hbmz.mapper.AccountsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountsMapper accountsMapper;

    @Override
    public void transfer(String out, String in, Double money) {

        accountsMapper.outMoney(out, money);
        int i = 1 / 0;                          //模拟异常
        accountsMapper.inMoney(in, money);

    }
}
