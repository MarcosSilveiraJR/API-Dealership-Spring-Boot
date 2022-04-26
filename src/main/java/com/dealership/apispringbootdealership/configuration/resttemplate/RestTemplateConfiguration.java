package com.dealership.apispringbootdealership.configuration.resttemplate;

import com.dealership.apispringbootdealership.exceptions.restexception.RestTemplateException;
import lombok.AllArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@AllArgsConstructor
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate viaCep() {
        return new RestTemplateBuilder()
                .rootUri("https://viacep.com.br/")
                .errorHandler(new RestTemplateException())
                .build();

    }

}
