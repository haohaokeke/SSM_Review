package com.hbmz;

import com.hbmz.service.BookService;
import com.hbmz.service.impl.BookServiceImpl;

public class App {

    public static void main(String[] args) {

//        BookServiceImpl bookService = new BookServiceImpl();
        BookService bookService = new BookServiceImpl();

        bookService.save();

    }
}
