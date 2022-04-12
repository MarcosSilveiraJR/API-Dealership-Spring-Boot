package com.dealership.apispringbootdealership.service.mapper;


import com.dealership.apispringbootdealership.entity.Address;
import com.dealership.apispringbootdealership.integration.model.AddressIntegration;

import java.util.Optional;

public class AddressMapper {

    public static Address toAddress(AddressIntegration addressIntegration){
        return Optional.ofNullable(addressIntegration)
                .map(addressIntegration1 -> Address.builder()
                        .cep(addressIntegration.getZipCode())
                        .logradouro(addressIntegration.getPublicPlace())
                        .complemento(addressIntegration.getComplement())
                        .bairro(addressIntegration.getDistrict())
                        .localidade(addressIntegration.getLocality())
                        .uf(addressIntegration.getUf())
                        .build())
                .orElse(null);
    }

}
