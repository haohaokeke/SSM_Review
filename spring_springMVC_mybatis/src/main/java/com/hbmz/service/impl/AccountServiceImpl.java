package com.hbmz.service.impl;

import com.hbmz.mapper.AccountMapper;
import com.hbmz.pojo.Account;
import com.hbmz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public boolean insert(Account account) {

        accountMapper.insert(account);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        accountMapper.delete(id);
        return true;
    }

    @Override
    public boolean update(Account account) {
        accountMapper.update(account);
        return true;
    }

    @Override
    public Account selectById(Integer id) {

        return accountMapper.selectById(id);
    }

    @Override
    public List<Account> selectAll() {

        return accountMapper.selectAll();
    }
}
