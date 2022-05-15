package com.dealership.apispringbootdealership.service.address.mapper.response;

import com.dealership.apispringbootdealership.entity.AddressEntity;
import com.dealership.apispringbootdealership.entity.model.address.request.AddressRequest;
import com.dealership.apispringbootdealership.service.address.model.request.AddressServiceRequest;

public class AddresServiceRequestMapper {

    public static AddressEntity toEntity(AddressRequest request){
        return AddressEntity.builder()
                .cep(request.getCep())
                .bairro(request.getBairro())
                .complemento(request.getComplemento())
                .localidade(request.getLocalidade())
                .logradouro(request.getLogradouro())
                .uf(request.getUf())
                .build();
    }
}
