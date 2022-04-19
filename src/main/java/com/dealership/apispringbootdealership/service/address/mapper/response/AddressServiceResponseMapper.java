package com.dealership.apispringbootdealership.service.address.mapper.response;


import com.dealership.apispringbootdealership.entity.AddressEntity;
import com.dealership.apispringbootdealership.integration.model.response.AddressIntegrationResponse;


public class AddressServiceResponseMapper {

    public static AddressIntegrationResponse toAddressEntity(AddressEntity addressEntity){
        return AddressIntegrationResponse.builder()
                        .cep(addressEntity.getCep())
                        .bairro(addressEntity.getBairro())
                        .complemento(addressEntity.getComplemento())
                        .bairro(addressEntity.getBairro())
                        .localidade(addressEntity.getLocalidade())
                        .uf(addressEntity.getUf())
                        .build();
    }

}
