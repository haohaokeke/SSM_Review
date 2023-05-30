package com.hbmz.controller;


import com.hbmz.pojo.Book;
import com.hbmz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private BookService bookService;

    @PostMapping
    public Result insert(@RequestBody Book book) {

        boolean flag = bookService.insert(book);

        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);

    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {

        boolean flag = bookService.deleteById(id);

        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);

    }

    @PutMapping
    public Result update(@RequestBody Book book) {

        boolean flag = bookService.update(book);

        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);

    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {

        Book book = bookService.getById(id);

        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;

        String msg = book != null ? "" : "数据查询失败!";

        return new Result(code, book, msg);

    }

    @GetMapping
    public Result getAll() {

        List<Book> books = bookService.getAll();

        Integer code = books != null ? Code.GET_OK : Code.GET_ERR;

        String msg = books != null ? "" : "数据查询失败!";

        return new Result(code, books, msg);

    }

}
