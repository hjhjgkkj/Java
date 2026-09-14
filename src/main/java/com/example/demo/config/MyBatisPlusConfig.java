package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan("com.example.demo.mapper")
public class MyBatisPlusConfig {

}
