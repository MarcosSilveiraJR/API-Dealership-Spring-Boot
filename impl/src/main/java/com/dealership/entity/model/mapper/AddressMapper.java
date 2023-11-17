package com.dealership.entity.model.mapper;

import com.dealership.entity.AddressEntity;
import com.dealership.entity.model.address.AddressResponse;
import com.dealership.integration.model.AddressIntegrationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface AddressMapper {

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "zipCode", source = "zipCode"),
            @Mapping(target = "publicPlace", source = "publicPlace"),
            @Mapping(target = "complement", source = "complement"),
            @Mapping(target = "neighborhood", source = "neighborhood"),
            @Mapping(target = "locality", source = "locality"),
            @Mapping(target = "uf", source = "uf")
    })
    AddressEntity toAddressEntity(AddressResponse addressResponse);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "zipCode", source = "zipCode"),
            @Mapping(target = "publicPlace", source = "publicPlace"),
            @Mapping(target = "complement", source = "complement"),
            @Mapping(target = "neighborhood", source = "neighborhood"),
            @Mapping(target = "locality", source = "locality"),
            @Mapping(target = "uf", source = "uf")
    })
    AddressResponse toAddressResponse(AddressEntity addressEntity);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "zipCode", source = "cep"),
            @Mapping(target = "publicPlace", source = "logradouro"),
            @Mapping(target = "complement", source = "complemento"),
            @Mapping(target = "neighborhood", source = "bairro"),
            @Mapping(target = "locality", source = "localidade"),
            @Mapping(target = "uf", source = "uf")
    })
    AddressResponse fromAddressIntegrationToAddressResponse(AddressIntegrationResponse addressIntegrationResponse);

}
