package com.dealership.service.address;

import com.dealership.entity.model.address.AddressResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class AddressFacade {
    public AddressService addressService;

    public AddressResponse saveCep(String cep){
       return addressService.saveCep(cep);
    }

    public AddressResponse getCep(String cep){
        return addressService.getCep(cep);
    }

    public AddressResponse findByCep(String cep){
        return addressService.findByCep(cep);
    }

    public List<AddressResponse> findAll(){
        return addressService.findAll();
    }

    public void deleteAll(){
        addressService.deleteAll();
    }
}
