package com.dealership.apispringbootdealership.service.motorbike.mapper;


import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceResponse;

public class MotorbikeServiceResponseMapper {

    public static MotorbikeServiceResponse toMotorbikeServiceResponse(MotorbikeEntity motorbikeEntity) {
        return MotorbikeServiceResponse.builder()
                .id(motorbikeEntity.getId())
                .brand(motorbikeEntity.getBrand())
                .model(motorbikeEntity.getModel())
                .color(motorbikeEntity.getColor())
                .price(motorbikeEntity.getPrice())
                .year(motorbikeEntity.getYear())
                .build();
    }

}
