package com.dealership.controller.motorbike.mapper;

import com.dealership.controller.motorbike.model.MotorbikeControllerRequest;
import com.dealership.entity.model.motorbike.MotorbikeRequest;

public class MotorbikeControllerRequestMapper {

    public static MotorbikeRequest toMotorbikeServiceRequest(MotorbikeControllerRequest motorbikeControllerRequest) {
        return MotorbikeRequest.builder()
                .id(motorbikeControllerRequest.getId())
                .brand(motorbikeControllerRequest.getBrand())
                .model(motorbikeControllerRequest.getModel())
                .color(motorbikeControllerRequest.getColor())
                .price(motorbikeControllerRequest.getPrice())
                .year(motorbikeControllerRequest.getYear())
                .build();
    }

}
