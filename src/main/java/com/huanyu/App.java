package com.huanyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class App 
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
