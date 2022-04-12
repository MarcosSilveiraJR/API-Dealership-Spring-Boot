package com.dealership.apispringbootdealership.service.mapper.response;


import com.dealership.apispringbootdealership.entity.Motorbike;
import com.dealership.apispringbootdealership.service.model.response.MotorbikeServiceResponse;

public class MotorbikeServiceResponseMapper {

    public static MotorbikeServiceResponse toMotorbikeServiceResponse(Motorbike motorbikeServiceRequest) {
        return MotorbikeServiceResponse.builder()
                .id(motorbikeServiceRequest.getId())
                .brand(motorbikeServiceRequest.getBrand())
                .model(motorbikeServiceRequest.getModel())
                .color(motorbikeServiceRequest.getColor())
                .price(motorbikeServiceRequest.getPrice())
                .year(motorbikeServiceRequest.getYear())
                .build();
    }

}
