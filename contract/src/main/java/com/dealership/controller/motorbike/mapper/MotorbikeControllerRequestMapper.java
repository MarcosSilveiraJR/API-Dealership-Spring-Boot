package com.dealership.controller.motorbike.mapper;

import com.dealership.controller.motorbike.model.MotorbikeControllerRequest;
import com.dealership.service.motorbike.model.MotorbikeServiceRequest;

public class MotorbikeControllerRequestMapper {

    public static MotorbikeServiceRequest toMotorbikeServiceRequest(MotorbikeControllerRequest motorbikeControllerRequest) {
        return MotorbikeServiceRequest.builder()
                .id(motorbikeControllerRequest.getId())
                .brand(motorbikeControllerRequest.getBrand())
                .model(motorbikeControllerRequest.getModel())
                .color(motorbikeControllerRequest.getColor())
                .price(motorbikeControllerRequest.getPrice())
                .year(motorbikeControllerRequest.getYear())
                .build();
    }

}
