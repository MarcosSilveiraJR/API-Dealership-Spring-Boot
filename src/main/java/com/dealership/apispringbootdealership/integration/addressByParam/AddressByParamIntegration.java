package com.dealership.apispringbootdealership.integration.addressByParam;

import com.dealership.apispringbootdealership.entity.AddressEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class AddressByParamIntegration {
    private RestTemplate restTemplate;

    public AddressEntity getCepByParam(String uf, String cidade, String logradouro){
        return restTemplate.getForObject("/ws/" + uf + cidade + logradouro + "/json/", AddressEntity.class);
    }

}