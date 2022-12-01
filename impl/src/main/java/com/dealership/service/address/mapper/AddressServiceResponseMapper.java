package com.dealership.service.address.mapper;


import com.dealership.entity.AddressEntity;
import com.dealership.integration.model.AddressIntegrationResponse;

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