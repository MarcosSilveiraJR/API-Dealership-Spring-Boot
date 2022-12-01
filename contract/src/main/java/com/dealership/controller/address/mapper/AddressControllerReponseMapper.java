package com.dealership.controller.address.mapper;


import com.dealership.controller.address.model.AddressControllerResponse;
import com.dealership.integration.model.AddressIntegrationResponse;

public class AddressControllerReponseMapper {

    public static AddressControllerResponse toResponseController(AddressIntegrationResponse response) {
        return AddressControllerResponse.builder()
                .id(response.getId())
                .cep(response.getCep())
                .bairro(response.getBairro())
                .complemento(response.getComplemento())
                .bairro(response.getBairro())
                .localidade(response.getLocalidade())
                .logradouro(response.getLogradouro())
                .uf(response.getUf())
                .build();
    }
}
