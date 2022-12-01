package com.dealership.service.motorbike.mapper;


import com.dealership.entity.MotorbikeEntity;
import com.dealership.service.motorbike.model.MotorbikeServiceResponse;

import java.util.ArrayList;
import java.util.List;

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
