package com.hbmz.service;

import com.hbmz.pojo.Account;

import java.util.List;

public interface AccountService {
    /**
     * @添加
     * @param account
     * @return
     */
    public boolean insert(Account account);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 修改
     * @param account
     * @return
     */
    public boolean update(Account account);

    /**
     * 查询ById
     * @param id
     * @return
     */
    public Account selectById(Integer id);

    /**
     * 查询All
     * @return
     */
    public List<Account> selectAll();

}
