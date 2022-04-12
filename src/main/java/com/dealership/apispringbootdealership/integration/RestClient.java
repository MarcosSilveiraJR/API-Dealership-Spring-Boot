package com.dealership.apispringbootdealership.integration;

import com.dealership.apispringbootdealership.entity.Address;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
@AllArgsConstructor
public class RestClient {
    private RestTemplate restTemplate;
    private RestTemplate restTemplate1;

    public Address getJsonCep(String cep) {
        return restTemplate.getForObject("/ws/" + cep + "/json/", Address.class);
    }

    public List<Address> getListaCep(){
        return Arrays.stream(Objects.requireNonNull(restTemplate1.getForObject("/ws/" + "/json/", Address[].class)))
                .toList();
    }

}