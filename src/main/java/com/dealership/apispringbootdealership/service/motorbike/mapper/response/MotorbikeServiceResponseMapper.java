package com.dealership.apispringbootdealership.service.motorbike.mapper.response;


import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import com.dealership.apispringbootdealership.service.motorbike.model.response.MotorbikeServiceResponse;

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
