package com.dealership.apispringbootdealership.service.mapper.motorbike.response;


import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import com.dealership.apispringbootdealership.service.motorbike.model.response.MotorbikeServiceResponse;

public class MotorbikeServiceResponseMapper {

    public static MotorbikeServiceResponse toMotorbikeServiceResponse(MotorbikeEntity motorbikeEntityServiceRequest) {
        return MotorbikeServiceResponse.builder()
                .id(motorbikeEntityServiceRequest.getId())
                .brand(motorbikeEntityServiceRequest.getBrand())
                .model(motorbikeEntityServiceRequest.getModel())
                .color(motorbikeEntityServiceRequest.getColor())
                .price(motorbikeEntityServiceRequest.getPrice())
                .year(motorbikeEntityServiceRequest.getYear())
                .build();
    }

}
