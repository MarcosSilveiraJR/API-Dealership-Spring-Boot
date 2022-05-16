package com.dealership.apispringbootdealership.controller.address;

import com.dealership.apispringbootdealership.integration.model.response.AddressIntegrationResponse;
import com.dealership.apispringbootdealership.service.address.AddressService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@Api(value = "Api Rest Dealership")
@CrossOrigin( origins = "*")
@RequestMapping("/v1/cep")
public class AddressController {
    private AddressService addressService;

    @GetMapping("/{cep}")
    public AddressIntegrationResponse getCep(@PathVariable String cep) {
        return addressService.getCep(cep);
    }

    @GetMapping("/id/{cep}")
    public AddressIntegrationResponse findCep(@PathVariable String cep){
        return addressService.findByCep(cep);
    }

    @GetMapping("/all")
    public List<AddressIntegrationResponse> findAll(){
        return addressService.findAll();
    }

    @GetMapping("/salvar/{cep}")
    public AddressIntegrationResponse salvaCep(@PathVariable String cep){
        return addressService.saveCep(cep);
    }

    @DeleteMapping("/del")
    public void deleteAll(){
        addressService.deleteAll();
    }
}
