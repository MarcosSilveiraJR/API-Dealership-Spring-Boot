package com.dealership.apispringbootdealership.configuration.resttemplate;

import lombok.AllArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
@AllArgsConstructor
public class RestTemplateConfiguration {

    @Bean
    @Primary
    public RestTemplate viaCep() {
        return new RestTemplateBuilder()
                .rootUri("https://viacep.com.br/")
                .build();

    }

    @Bean
    public RestTemplate viaCep1() {
        return new RestTemplateBuilder()
                .rootUri("https://viacep.com.br/")
                .build();
    }

}
