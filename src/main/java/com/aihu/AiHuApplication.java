package com.aihu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.aihu.dao")
@SpringBootApplication
public class AiHuApplication {
    public static void main(String[] args){
        SpringApplication.run(AiHuApplication.class, args);
    }
}