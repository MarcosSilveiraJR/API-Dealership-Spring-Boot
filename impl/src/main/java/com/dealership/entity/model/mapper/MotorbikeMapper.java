package com.dealership.entity.model.mapper;

import com.dealership.entity.MotorbikeEntity;
import com.dealership.entity.model.motorbike.MotorbikeRequest;
import com.dealership.entity.model.motorbike.MotorbikeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface MotorbikeMapper {

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "brand", source = "brand"),
            @Mapping(target = "model", source = "model"),
            @Mapping(target = "color", source = "color"),
            @Mapping(target = "price", source = "price"),
            @Mapping(target = "year", source = "year"),
    })
    MotorbikeEntity toMotorbikeEntity(MotorbikeRequest motorbikeRequest);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "brand", source = "brand"),
            @Mapping(target = "model", source = "model"),
            @Mapping(target = "color", source = "color"),
            @Mapping(target = "price", source = "price"),
            @Mapping(target = "year", source = "year"),
    })
    MotorbikeResponse toMotorbikeResponse(MotorbikeEntity motorbikeEntity);
}
