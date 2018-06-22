package com.example.dubbo.entity;


import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @Author:郭友文
 * @Data:2018/6/22 10:22
 * @Description:
 */

public class BookModel implements Serializable {
    private Long id;
    private String name;
    private Float price;

    public BookModel() {
    }

    public BookModel(Long id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
