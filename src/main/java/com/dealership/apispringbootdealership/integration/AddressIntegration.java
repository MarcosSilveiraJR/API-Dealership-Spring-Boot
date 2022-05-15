package com.dealership.apispringbootdealership.integration;

import com.dealership.apispringbootdealership.entity.model.address.request.AddressRequest;
import com.dealership.apispringbootdealership.integration.model.response.AddressIntegrationResponse;
import com.dealership.apispringbootdealership.service.address.mapper.response.AddresServiceRequestMapper;
import com.dealership.apispringbootdealership.service.address.model.request.AddressServiceRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpClient;

@Component
@AllArgsConstructor
public class AddressIntegration {
    private RestTemplate restTemplate;
    public AddressIntegrationResponse getCep(String cep) {
        return restTemplate.getForObject("/ws/" + cep + "/json/", AddressIntegrationResponse.class);
    }

}