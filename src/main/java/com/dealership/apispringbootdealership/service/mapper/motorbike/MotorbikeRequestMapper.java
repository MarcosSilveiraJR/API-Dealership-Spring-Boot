package com.dealership.apispringbootdealership.service.mapper.motorbike;

import com.dealership.apispringbootdealership.entity.Motorbike;
import com.dealership.apispringbootdealership.model.motorbike.MotorbikeRequest;

public class MotorbikeRequestMapper {

    public static Motorbike toMotorbikeEntity(MotorbikeRequest motorbikeRequest) {
        return Motorbike.builder()
                .id(motorbikeRequest.getId())
                .brand(motorbikeRequest.getBrand())
                .model(motorbikeRequest.getModel())
                .color(motorbikeRequest.getColor())
                .price(motorbikeRequest.getPrice())
                .year(motorbikeRequest.getYear())
                .build();
    }

}
