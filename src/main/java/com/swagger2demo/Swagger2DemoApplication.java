package com.swagger2demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.swagger2demo.mapper")
public class Swagger2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Swagger2DemoApplication.class, args);
    }

}
