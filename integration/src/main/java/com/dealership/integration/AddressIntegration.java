package com.dealership.integration;

import com.dealership.integration.model.AddressIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class AddressIntegration {
    private RestTemplate restTemplate;

    public AddressIntegrationResponse getCep(String cep) {
        return restTemplate.getForObject("/ws/".concat(cep).concat("/json/"), AddressIntegrationResponse.class);
    }
}