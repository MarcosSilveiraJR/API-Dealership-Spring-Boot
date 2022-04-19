package com.dealership.apispringbootdealership.service.address;

import com.dealership.apispringbootdealership.integration.model.response.AddressIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AddressFacade {
    public AddressService addressService;

    public AddressIntegrationResponse getCep(String cep){
        return addressService.getCep(cep);
    }
}
