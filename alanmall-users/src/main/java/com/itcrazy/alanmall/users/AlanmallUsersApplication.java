package com.itcrazy.alanmall.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itcrazy.alanmall.user","com.itcrazy.alanmall.common"})
public class AlanmallUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlanmallUsersApplication.class, args);
    }

}
