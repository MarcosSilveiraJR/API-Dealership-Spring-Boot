package com.dealership.apispringbootdealership.controller.motorbike.mapper.response;

import com.dealership.apispringbootdealership.controller.motorbike.model.response.MotorbikeControllerResponse;
import com.dealership.apispringbootdealership.service.motorbike.model.response.MotorbikeServiceResponse;

import java.util.List;

public class MotorbikeControllerResponseMapper {

    public static MotorbikeControllerResponse toMotorbikeControllerResponse(MotorbikeServiceResponse motorbikeServiceResponse) {
        return MotorbikeControllerResponse.builder()
                .id(motorbikeServiceResponse.getId())
                .brand(motorbikeServiceResponse.getBrand())
                .model(motorbikeServiceResponse.getModel())
                .color(motorbikeServiceResponse.getColor())
                .year(motorbikeServiceResponse.getYear())
                .price(motorbikeServiceResponse.getPrice())
                .build();
    }

    public static List<MotorbikeControllerResponse> toMotorbikeServiceResponseList(List<MotorbikeServiceResponse> motorbikeServiceResponse) {
        return motorbikeServiceResponse.stream().map(motorbikeServiceResponse1 ->
                MotorbikeControllerResponse.builder()
                        .id(motorbikeServiceResponse1.getId())
                        .brand(motorbikeServiceResponse1.getBrand())
                        .model(motorbikeServiceResponse1.getModel())
                        .color(motorbikeServiceResponse1.getColor())
                        .year(motorbikeServiceResponse1.getYear())
                        .price(motorbikeServiceResponse1.getPrice())
                        .build()).toList();

    }


}
