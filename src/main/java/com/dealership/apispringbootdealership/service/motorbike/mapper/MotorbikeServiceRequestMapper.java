package com.dealership.apispringbootdealership.service.motorbike.mapper;

import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceRequest;

public class MotorbikeServiceRequestMapper {

    public static MotorbikeEntity toEntityMotorbike(MotorbikeServiceRequest motorbikeServiceRequest) {
        return MotorbikeEntity.builder()
                .id(motorbikeServiceRequest.getId())
                .brand(motorbikeServiceRequest.getBrand())
                .model(motorbikeServiceRequest.getModel())
                .color(motorbikeServiceRequest.getColor())
                .price(motorbikeServiceRequest.getPrice())
                .year(motorbikeServiceRequest.getYear())
                .build();
    }

}
