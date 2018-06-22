package com.example.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.entity.BookModel;
import com.example.dubbo.service.api.IBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:郭友文
 * @Data:2018/6/22 10:23
 * @Description:
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference(check = false)
    private IBookService bookService;


    @GetMapping(value = "/getOneBook")
    public BookModel getOneBook(){
        BookModel bookModel=bookService.getOneBook();
        return bookModel;
    }
}
