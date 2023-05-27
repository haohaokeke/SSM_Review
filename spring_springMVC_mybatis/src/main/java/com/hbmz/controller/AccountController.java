package com.hbmz.controller;

import com.hbmz.pojo.Account;
import com.hbmz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     // ==> 代替: @Controller @ResponseBody
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //增
    @PostMapping
    public boolean save(@RequestBody Account account) {

        return accountService.insert(account);

    }

    //删 --> id
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {

        return accountService.delete(id);

    }

    //改
    @PutMapping
    public boolean update(@RequestBody Account account) {

        return accountService.update(account);

    }


    //查 --> id
    @GetMapping("/{id}")
    public Account selectById(@PathVariable Integer id) {

        return accountService.selectById(id);

    }

    //查
    @GetMapping
    public List<Account> selectAll() {

        System.out.println("123456");

        return accountService.selectAll();

    }


}
