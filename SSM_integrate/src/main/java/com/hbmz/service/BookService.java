package com.hbmz.service;

import com.hbmz.pojo.Book;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional
public interface BookService {

    /**
     * 增
     */
    public boolean insert(Book book);


    /**
     * 删
     */
    public boolean deleteById(Integer id);


    /**
     * 改
     */
    public boolean update(Book book);


    /**
     * 查
     */
    public Book getById(Integer id);

    /**
     * 查
     */
    public List<Book> getAll();


}
