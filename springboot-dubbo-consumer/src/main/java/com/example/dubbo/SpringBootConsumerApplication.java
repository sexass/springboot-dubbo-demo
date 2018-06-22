package com.example.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:郭友文
 * @Data:2018/6/21 18:45
 * @Description:
 */
@SpringBootApplication
@EnableDubboConfiguration
public class SpringBootConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerApplication.class,args);
    }
}
