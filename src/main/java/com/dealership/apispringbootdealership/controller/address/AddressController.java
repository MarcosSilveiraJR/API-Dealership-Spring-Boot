package com.dealership.apispringbootdealership.controller.address;

import com.dealership.apispringbootdealership.controller.address.model.AddressControllerResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation("Busca um cep no site ViaCep")
    @GetMapping("/{cep}")
    public AddressControllerResponse getCep(@PathVariable String cep) {
        return addressFacade.getCep(cep);
    }

    @ApiOperation("Busca um cep salvo no banco de dados")
    @GetMapping("/id/{cep}")
    public AddressControllerResponse findCep(@PathVariable String cep){
        return addressFacade.findByCep(cep);
    }

    @ApiOperation("Busca todos os cep salvos no banco de dados")
    @GetMapping("/all")
    public List<AddressControllerResponse> findAll(){
        return addressFacade.findAll();
    }

    @ApiOperation("Busca um cep no ViaCep e salva no banco de dados")
    @GetMapping("/save/{cep}")
    public AddressControllerResponse salvaCep(@PathVariable String cep){
        return addressFacade.saveCep(cep);
    }

    @ApiOperation("Deleta todos os ceps salvos no banco de dados")
    @DeleteMapping("/del")
    public void deleteAll(){
        addressFacade.deleteAll();
    }
}
