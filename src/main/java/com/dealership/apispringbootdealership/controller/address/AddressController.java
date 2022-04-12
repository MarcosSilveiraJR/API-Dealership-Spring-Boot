package com.dealership.apispringbootdealership.controller.address;

import com.dealership.apispringbootdealership.integration.addressByCep.model.response.AddressIntegrationResponse;
import com.dealership.apispringbootdealership.service.address.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/cep")
public class AddressController {
    private AddressService addressService;

    @GetMapping("/cep")
    public AddressIntegrationResponse getCep(String cep){
        return addressService.getCep(cep);
    }
}
