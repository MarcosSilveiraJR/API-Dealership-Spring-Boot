package com.dealership.controller.motorbike.mapper;

import com.dealership.controller.motorbike.model.MotorbikeControllerResponse;
import com.dealership.service.motorbike.model.MotorbikeServiceResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MotorbikeControllerMapper {

    MotorbikeControllerMapper INSTANCE = Mappers.getMapper(MotorbikeControllerMapper.class);

    MotorbikeControllerResponse toMotorbikeControllerResponse(MotorbikeServiceResponse motorbikeServiceResponse);
    List<MotorbikeControllerResponse> toMotorbikeControllerResponseList(List<MotorbikeServiceResponse> motorbikeServiceResponse);
}
