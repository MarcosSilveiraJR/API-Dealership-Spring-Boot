package com.dealership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ApiSpringBootDealershipApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiSpringBootDealershipApplication.class, args);
    }

}
