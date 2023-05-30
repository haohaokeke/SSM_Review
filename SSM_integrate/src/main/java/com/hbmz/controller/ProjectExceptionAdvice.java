package com.hbmz.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(Exception.class)  // --> 拦截到的异常种类
    public Result doException() {

        return new Result(444, null, "有异常!!");

    }

}
