package com.dealership.service.address;

import com.dealership.integration.model.AddressIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
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
