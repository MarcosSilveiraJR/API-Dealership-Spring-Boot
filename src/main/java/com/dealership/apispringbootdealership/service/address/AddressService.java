package com.dealership.apispringbootdealership.service.address;

import com.dealership.apispringbootdealership.integration.AddressIntegration;
import com.dealership.apispringbootdealership.integration.model.response.AddressIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddressService {

    private final AddressIntegration addressIntegration;

    public AddressIntegrationResponse getCep(String cep) {
        return addressIntegration.getCep(cep);

    }
}
