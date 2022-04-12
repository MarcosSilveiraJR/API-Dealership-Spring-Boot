package com.dealership.apispringbootdealership.service.mapper.address;


import com.dealership.apispringbootdealership.entity.AddressEntity;
import com.dealership.apispringbootdealership.service.address.model.response.AddressServiceResponse;

import java.util.Optional;

public class AddressRequestMapper {

    public static AddressEntity toAddress(AddressServiceResponse addressServiceResponse){
        return Optional.ofNullable(addressServiceResponse)
                .map(addressIntegrationResponse1 -> AddressEntity.builder()
                        .cep(addressServiceResponse.getCep())
                        .bairro(addressServiceResponse.getBairro())
                        .complemento(addressServiceResponse.getComplemento())
                        .bairro(addressServiceResponse.getBairro())
                        .localidade(addressServiceResponse.getLocalidade())
                        .uf(addressServiceResponse.getUf())
                        .build())
                .orElse(null);
    }

}
