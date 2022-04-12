package com.dealership.apispringbootdealership.controller.motorbike;

import com.dealership.apispringbootdealership.controller.model.request.MotorbikeControllerRequest;
import com.dealership.apispringbootdealership.controller.model.response.MotorbikeControllerResponse;
import com.dealership.apispringbootdealership.service.motorbike.model.request.MotorbikeServiceRequest;
import com.dealership.apispringbootdealership.service.motorbike.model.response.MotorbikeServiceResponse;
import com.dealership.apispringbootdealership.service.motorbike.MotorbikeFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.dealership.apispringbootdealership.controller.mapper.request.MotorbikeControllerRequestMapper.toMotorbikeServiceRequest;
import static com.dealership.apispringbootdealership.controller.mapper.response.MotorbikeControllerResponseMapper.toMotorbikeServiceResponse;
import static com.dealership.apispringbootdealership.controller.mapper.response.MotorbikeControllerResponseMapper.toMotorbikeServiceResponseList;


@AllArgsConstructor
@Component
public class MotorbikeControllerFacade {

    private final MotorbikeFacade facade;

    public MotorbikeControllerResponse save(MotorbikeControllerRequest motorbikeControllerRequest) {
        MotorbikeServiceRequest serviceRequest = toMotorbikeServiceRequest(motorbikeControllerRequest);
        MotorbikeServiceResponse save = facade.save(serviceRequest);
        return toMotorbikeServiceResponse(save);
    }

    public MotorbikeControllerResponse update(MotorbikeControllerRequest motorbikeControllerRequest, String id) {
        MotorbikeServiceResponse update = facade.update(toMotorbikeServiceRequest(motorbikeControllerRequest), id);
        return toMotorbikeServiceResponse(update);
    }

    public List<MotorbikeControllerResponse> findAll() {
        List<MotorbikeServiceResponse> findAll = facade.findAll();
        return toMotorbikeServiceResponseList(findAll);
    }

    public MotorbikeControllerResponse getById(String id) {
        MotorbikeServiceResponse getById = facade.getById(id);
        return toMotorbikeServiceResponse(getById);
    }

    public void delete(String id) {
        facade.delete(id);
    }



}

