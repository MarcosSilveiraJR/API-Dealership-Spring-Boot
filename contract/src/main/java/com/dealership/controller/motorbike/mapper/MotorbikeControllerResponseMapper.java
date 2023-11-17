package com.dealership.controller.motorbike.mapper;

import com.dealership.controller.motorbike.model.MotorbikeControllerResponse;
import com.dealership.entity.model.motorbike.MotorbikeResponse;

import java.util.List;

public class MotorbikeControllerResponseMapper {

    public static MotorbikeControllerResponse toMotorbikeControllerResponse(MotorbikeResponse motorbikeServiceResponse) {
        return MotorbikeControllerResponse.builder()
                .id(motorbikeServiceResponse.getId())
                .brand(motorbikeServiceResponse.getBrand())
                .model(motorbikeServiceResponse.getModel())
                .color(motorbikeServiceResponse.getColor())
                .year(motorbikeServiceResponse.getYear())
                .price(motorbikeServiceResponse.getPrice())
                .build();
    }

    public static List<MotorbikeControllerResponse> toMotorbikeControllerResponseList(List<MotorbikeResponse> motorbikeServiceResponse) {
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
