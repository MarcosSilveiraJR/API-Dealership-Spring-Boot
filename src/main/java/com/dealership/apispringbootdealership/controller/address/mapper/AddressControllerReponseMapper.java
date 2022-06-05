package com.dealership.apispringbootdealership.controller.address.mapper;

import com.dealership.apispringbootdealership.controller.address.model.AddressControllerResponse;
import com.dealership.apispringbootdealership.integration.model.AddressIntegrationResponse;

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
