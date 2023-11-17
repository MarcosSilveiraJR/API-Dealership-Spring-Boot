package com.dealership.controller.address.mapper;

import com.dealership.controller.address.model.AddressControllerResponse;
import com.dealership.entity.model.address.AddressResponse;
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
    AddressControllerResponse toAddressControllerResponse(AddressResponse addressResponse);
}
