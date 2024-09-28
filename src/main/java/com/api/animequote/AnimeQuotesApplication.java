package com.api.animequote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class AnimeQuotesApplication {
    public static void main(String[] args) {
        SpringApplication.run(AnimeQuotesApplication.class, args);
    }
}
