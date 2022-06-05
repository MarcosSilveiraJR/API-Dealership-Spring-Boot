package com.dealership.apispringbootdealership.controller.address;

import com.dealership.apispringbootdealership.controller.address.model.AddressControllerResponse;
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
    private AddressFacadeController addressFacade;

    @GetMapping("/{cep}")
    public AddressControllerResponse getCep(@PathVariable String cep) {
        return addressFacade.getCep(cep);
    }

    @GetMapping("/id/{cep}")
    public AddressControllerResponse findCep(@PathVariable String cep){
        return addressFacade.findByCep(cep);
    }

    @GetMapping("/all")
    public List<AddressControllerResponse> findAll(){
        return addressFacade.findAll();
    }

    @GetMapping("/salvar/{cep}")
    public AddressControllerResponse salvaCep(@PathVariable String cep){
        return addressFacade.saveCep(cep);
    }

    @DeleteMapping("/del")
    public void deleteAll(){
        addressFacade.deleteAll();
    }
}
