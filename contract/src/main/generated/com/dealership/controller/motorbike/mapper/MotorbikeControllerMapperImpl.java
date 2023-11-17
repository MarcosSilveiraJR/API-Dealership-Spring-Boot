package com.dealership.controller.motorbike.mapper;

import com.dealership.controller.motorbike.model.MotorbikeControllerResponse;
import com.dealership.entity.model.motorbike.MotorbikeResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-17T13:39:09-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
public class MotorbikeControllerMapperImpl implements MotorbikeControllerMapper {

    @Override
    public MotorbikeControllerResponse toMotorbikeControllerResponse(MotorbikeResponse motorbikeServiceResponse) {
        if ( motorbikeServiceResponse == null ) {
            return null;
        }

        MotorbikeControllerResponse.MotorbikeControllerResponseBuilder motorbikeControllerResponse = MotorbikeControllerResponse.builder();

        motorbikeControllerResponse.id( motorbikeServiceResponse.getId() );
        motorbikeControllerResponse.brand( motorbikeServiceResponse.getBrand() );
        motorbikeControllerResponse.model( motorbikeServiceResponse.getModel() );
        motorbikeControllerResponse.color( motorbikeServiceResponse.getColor() );
        motorbikeControllerResponse.price( motorbikeServiceResponse.getPrice() );
        motorbikeControllerResponse.year( motorbikeServiceResponse.getYear() );

        return motorbikeControllerResponse.build();
    }

    @Override
    public List<MotorbikeControllerResponse> toMotorbikeControllerResponseList(List<MotorbikeResponse> motorbikeServiceResponse) {
        if ( motorbikeServiceResponse == null ) {
            return null;
        }

        List<MotorbikeControllerResponse> list = new ArrayList<MotorbikeControllerResponse>( motorbikeServiceResponse.size() );
        for ( MotorbikeResponse motorbikeResponse : motorbikeServiceResponse ) {
            list.add( toMotorbikeControllerResponse( motorbikeResponse ) );
        }

        return list;
    }
}
