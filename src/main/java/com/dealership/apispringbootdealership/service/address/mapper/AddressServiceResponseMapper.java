package com.dealership.apispringbootdealership.service.address.mapper;


import com.dealership.apispringbootdealership.entity.AddressEntity;
import com.dealership.apispringbootdealership.integration.model.AddressIntegrationResponse;


public class AddressServiceResponseMapper {

    public static AddressIntegrationResponse toAddressResponse(AddressEntity addressEntity) {
        return AddressIntegrationResponse.builder()
                .id(addressEntity.getId())
                .cep(addressEntity.getCep())
                .bairro(addressEntity.getBairro())
                .complemento(addressEntity.getComplemento())
                .bairro(addressEntity.getBairro())
                .localidade(addressEntity.getLocalidade())
                .logradouro(addressEntity.getLogradouro())
                .uf(addressEntity.getUf())
                .build();
    }

}
