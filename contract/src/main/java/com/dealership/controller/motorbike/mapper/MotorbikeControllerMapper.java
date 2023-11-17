package com.dealership.controller.motorbike.mapper;

import com.dealership.controller.motorbike.model.MotorbikeControllerResponse;
import com.dealership.entity.model.motorbike.MotorbikeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MotorbikeControllerMapper {

    MotorbikeControllerMapper INSTANCE = Mappers.getMapper(MotorbikeControllerMapper.class);

    MotorbikeControllerResponse toMotorbikeControllerResponse(MotorbikeResponse motorbikeServiceResponse);
    List<MotorbikeControllerResponse> toMotorbikeControllerResponseList(List<MotorbikeResponse> motorbikeServiceResponse);
}
