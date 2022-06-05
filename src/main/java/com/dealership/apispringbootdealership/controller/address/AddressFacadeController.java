package com.dealership.apispringbootdealership.controller.address;

import com.dealership.apispringbootdealership.controller.address.mapper.AddressControllerReponseMapper;
import com.dealership.apispringbootdealership.controller.address.model.AddressControllerResponse;
import com.dealership.apispringbootdealership.integration.model.AddressIntegrationResponse;
import com.dealership.apispringbootdealership.service.address.AddressFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.dealership.apispringbootdealership.controller.address.mapper.AddressControllerReponseMapper.toResponseController;

@AllArgsConstructor
@Component
public class AddressFacadeController {

    private AddressFacade facade;

    public AddressControllerResponse saveCep(String cep){
        AddressIntegrationResponse response = facade.saveCep(cep);
        return toResponseController(response);
    }

    public AddressControllerResponse getCep(String cep){
        return toResponseController(facade.getCep(cep));
    }

    public AddressControllerResponse findByCep (String cep){
        return toResponseController(facade.findByCep(cep));
    }

    public List<AddressControllerResponse> findAll (){
        return facade.findAll().stream().map(AddressControllerReponseMapper::toResponseController).toList();
    }

    public void deleteAll (){
        facade.deleteAll();
    }
}
