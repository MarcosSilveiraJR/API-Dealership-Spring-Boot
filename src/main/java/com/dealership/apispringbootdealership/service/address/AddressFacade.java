package com.dealership.apispringbootdealership.service.address;

import com.dealership.apispringbootdealership.entity.model.address.request.AddressRequest;
import com.dealership.apispringbootdealership.integration.model.response.AddressIntegrationResponse;
import com.dealership.apispringbootdealership.service.address.model.request.AddressServiceRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddressFacade {
    public AddressService addressService;

//    public AddressIntegrationResponse getCep(AddressRequest cep){
//        return addressService.getCep(cep);
//    }
}
