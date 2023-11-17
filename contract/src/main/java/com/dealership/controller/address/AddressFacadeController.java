package com.dealership.controller.address;

import com.dealership.controller.address.mapper.AddressMapper;
import com.dealership.controller.address.model.AddressControllerResponse;
import com.dealership.entity.model.address.AddressResponse;
import com.dealership.service.address.AddressFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@AllArgsConstructor
public class AddressFacadeController {

    private final AddressFacade addressFacade;
    private final AddressMapper addressMapper;

    public AddressControllerResponse saveCep(String cep){
        AddressResponse response = addressFacade.saveCep(cep);
        return addressMapper.toAddressControllerResponse(response);
    }

    public AddressControllerResponse getCep(String cep){
        return addressMapper.toAddressControllerResponse(addressFacade.getCep(cep));
    }

    public AddressControllerResponse findByCep (String cep){
        return addressMapper.toAddressControllerResponse(addressFacade.findByCep(cep));
    }

    public List<AddressControllerResponse> findAll (){
        return addressFacade.findAll().stream().map(addressMapper::toAddressControllerResponse).toList();
    }

    public void deleteAll (){
        addressFacade.deleteAll();
    }
}
