package com.dealership.controller.address;

import com.dealership.controller.address.mapper.AddressControllerReponseMapper;
import com.dealership.controller.address.model.AddressControllerResponse;
import com.dealership.integration.model.AddressIntegrationResponse;
import com.dealership.service.address.AddressFacade;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.dealership.controller.address.mapper.AddressControllerReponseMapper.toResponseController;

@Component
public class AddressFacadeController {

    private final AddressFacade facade;

    public AddressFacadeController(AddressFacade facade) {
        this.facade = facade;
    }

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
