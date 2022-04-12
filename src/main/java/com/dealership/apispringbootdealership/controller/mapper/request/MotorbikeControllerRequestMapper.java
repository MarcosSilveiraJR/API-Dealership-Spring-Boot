package com.dealership.apispringbootdealership.controller.mapper.request;

import com.dealership.apispringbootdealership.controller.model.request.MotorbikeControllerRequest;
import com.dealership.apispringbootdealership.service.motorbike.model.request.MotorbikeServiceRequest;

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
