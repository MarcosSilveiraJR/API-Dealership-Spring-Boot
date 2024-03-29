package com.dealership.controller.address;

import com.dealership.controller.address.model.AddressControllerResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "Api Rest Dealership")
@CrossOrigin(origins = "*")
@RequestMapping("/address")
public class AddressController {
    private final AddressFacadeController addressFacade;

    public AddressController(AddressFacadeController addressFacade) {
        this.addressFacade = addressFacade;
    }

    @ApiOperation("Busca um cep no site ViaCep")
    @GetMapping("/{cep}")
    public AddressControllerResponse getCep(@PathVariable String cep) {
        return addressFacade.getCep(cep);
    }

    @ApiOperation("Busca um cep salvo no banco de dados")
    @GetMapping("/find/{cep}")
    public AddressControllerResponse findCep(@PathVariable String cep){
        return addressFacade.findByCep(cep);
    }

    @ApiOperation("Busca todos os cep salvos no banco de dados")
    @GetMapping()
    public List<AddressControllerResponse> findAll(){
        return addressFacade.findAll();
    }

    @ApiOperation("Busca um cep no ViaCep e salva no banco de dados")
    @GetMapping("/save/{cep}")
    public AddressControllerResponse salvaCep(@PathVariable String cep){
        return addressFacade.saveCep(cep);
    }

    @ApiOperation("Deleta todos os ceps salvos no banco de dados")
    @DeleteMapping()
    public void deleteAll(){
        addressFacade.deleteAll();
    }
}
