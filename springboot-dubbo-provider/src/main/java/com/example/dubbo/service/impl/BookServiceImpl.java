package com.example.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.entity.BookModel;
import com.example.dubbo.service.api.IBookService;

/**
 * @Author:郭友文
 * @Data:2018/6/22 10:35
 * @Description:
 */
@Service
@org.springframework.stereotype.Service
public class BookServiceImpl implements IBookService {
    @Override
    public BookModel getOneBook() {
        return new BookModel(1L,"白夜行",32.0f);
    }
}
