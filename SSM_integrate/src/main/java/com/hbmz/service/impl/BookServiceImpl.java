package com.hbmz.service.impl;

import com.hbmz.mapper.BookMapper;
import com.hbmz.pojo.Book;
import com.hbmz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean insert(Book book) {

        bookMapper.insert(book);

        return true;
    }

    @Override
    public boolean deleteById(Integer id) {

        bookMapper.deleteById(id);

        return true;
    }

    @Override
    public boolean update(Book book) {

        bookMapper.update(book);

        return true;
    }

    @Override
    public Book getById(Integer id) {

        Book book = bookMapper.getById(id);

        return book;
    }

    @Override
    public List<Book> getAll() {

        List<Book> books = bookMapper.getAll();

        // int i = 1/0;  --> 模拟异常

        return books;
    }
}
