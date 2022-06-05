package com.dealership.apispringbootdealership.service.address.mapper;

import com.dealership.apispringbootdealership.entity.AddressEntity;
import com.dealership.apispringbootdealership.integration.model.AddressIntegrationResponse;

public class AddresServiceRequestMapper {

    public static AddressEntity toEntity(AddressIntegrationResponse response) {
        return AddressEntity.builder()
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
