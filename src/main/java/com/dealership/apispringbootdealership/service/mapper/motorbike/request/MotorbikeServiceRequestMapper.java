package com.dealership.apispringbootdealership.service.mapper.motorbike.request;

import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import com.dealership.apispringbootdealership.service.motorbike.model.request.MotorbikeServiceRequest;

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
