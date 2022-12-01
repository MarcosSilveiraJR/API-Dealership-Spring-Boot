package com.dealership.service.motorbike.mapper;


import com.dealership.entity.MotorbikeEntity;
import com.dealership.service.motorbike.model.MotorbikeServiceRequest;

import java.util.ArrayList;
import java.util.List;

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
