package com.dealership.apispringbootdealership.service.mapper.request;

import com.dealership.apispringbootdealership.entity.Motorbike;
import com.dealership.apispringbootdealership.service.model.request.MotorbikeServiceRequest;

public class MotorbikeServiceRequestMapper {

    public static Motorbike toEntityMotorbike(MotorbikeServiceRequest motorbikeServiceRequest) {
        return Motorbike.builder()
                .id(motorbikeServiceRequest.getId())
                .brand(motorbikeServiceRequest.getBrand())
                .model(motorbikeServiceRequest.getModel())
                .color(motorbikeServiceRequest.getColor())
                .price(motorbikeServiceRequest.getPrice())
                .year(motorbikeServiceRequest.getYear())
                .build();
    }

}
