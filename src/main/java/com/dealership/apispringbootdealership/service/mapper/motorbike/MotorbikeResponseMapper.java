package com.dealership.apispringbootdealership.service.mapper.motorbike;

import com.dealership.apispringbootdealership.entity.Motorbike;
import com.dealership.apispringbootdealership.model.motorbike.MotorbikeResponse;

public class MotorbikeResponseMapper {

    public static MotorbikeResponse toMotorbikeResponse(Motorbike motorbike) {
        return MotorbikeResponse.builder()
                .id(motorbike.getId())
                .brand(motorbike.getBrand())
                .model(motorbike.getModel())
                .color(motorbike.getColor())
                .price(motorbike.getPrice())
                .year(motorbike.getYear())
                .build();
    }

}
