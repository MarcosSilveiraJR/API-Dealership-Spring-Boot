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

    private final AddressFacade addressFacade;

    public AddressFacadeController(AddressFacade addressFacade) {
        this.addressFacade = addressFacade;
    }

    public AddressControllerResponse saveCep(String cep){
        AddressIntegrationResponse response = addressFacade.saveCep(cep);
        return toResponseController(response);
    }

    public AddressControllerResponse getCep(String cep){
        return toResponseController(addressFacade.getCep(cep));
    }

    public AddressControllerResponse findByCep (String cep){
        return toResponseController(addressFacade.findByCep(cep));
    }

    public List<AddressControllerResponse> findAll (){
        return addressFacade.findAll().stream().map(AddressControllerReponseMapper::toResponseController).toList();
    }

    public void deleteAll (){
        addressFacade.deleteAll();
    }
}
