package com.dealership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DealershipApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealershipApiApplication.class, args);
    }

}
