package com.mybatis.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mybatis.generator")
@SpringBootApplication
public class MybatisGenerateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGenerateApplication.class, args);
    }

}
