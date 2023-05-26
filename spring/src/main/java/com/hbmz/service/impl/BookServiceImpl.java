package com.hbmz.service.impl;

import com.hbmz.dao.BookDao;
import com.hbmz.dao.impl.BookDaoImpl;
import com.hbmz.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save...");

        bookDao.save();
    }

    //提供获取对象的方法 set
    public void setBookDao(BookDao bookDao) {

        this.bookDao = bookDao;

    }

}
