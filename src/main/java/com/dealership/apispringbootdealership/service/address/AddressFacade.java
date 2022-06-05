package com.dealership.apispringbootdealership.service.address;

import com.dealership.apispringbootdealership.integration.model.AddressIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class AddressFacade {
    public AddressService addressService;

    public AddressIntegrationResponse saveCep(String cep){
       return addressService.saveCep(cep);
    }

    public AddressIntegrationResponse getCep(String cep){
        return addressService.getCep(cep);
    }

    public AddressIntegrationResponse findByCep(String cep){
        return addressService.findByCep(cep);
    }

    public List<AddressIntegrationResponse> findAll(){
        return addressService.findAll();
    }

    public void deleteAll(){
        addressService.deleteAll();
    }
}
