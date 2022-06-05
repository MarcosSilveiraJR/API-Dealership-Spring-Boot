package com.dealership.apispringbootdealership.controller.motorbike;

import com.dealership.apispringbootdealership.controller.motorbike.model.MotorbikeControllerRequest;
import com.dealership.apispringbootdealership.controller.motorbike.model.MotorbikeControllerResponse;
import com.dealership.apispringbootdealership.service.motorbike.MotorbikeServiceFacade;
import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceRequest;
import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.dealership.apispringbootdealership.controller.motorbike.mapper.MotorbikeControllerRequestMapper.toMotorbikeServiceRequest;
import static com.dealership.apispringbootdealership.controller.motorbike.mapper.MotorbikeControllerResponseMapper.toMotorbikeControllerResponse;
import static com.dealership.apispringbootdealership.controller.motorbike.mapper.MotorbikeControllerResponseMapper.toMotorbikeServiceResponseList;

@AllArgsConstructor
@Component
public final class MotorbikeControllerFacade {
    private final MotorbikeServiceFacade facade;


    public MotorbikeControllerResponse save(MotorbikeControllerRequest motorbikeControllerRequest) {
        MotorbikeServiceRequest serviceRequest = toMotorbikeServiceRequest(motorbikeControllerRequest);
        MotorbikeServiceResponse save = facade.save(serviceRequest);
        return toMotorbikeControllerResponse(save);
    }

    public MotorbikeControllerResponse update(MotorbikeControllerRequest motorbikeControllerRequest, String id) {
        MotorbikeServiceResponse update = facade.update(toMotorbikeServiceRequest(motorbikeControllerRequest), id);
        return toMotorbikeControllerResponse(update);
    }

    public List<MotorbikeControllerResponse> findAll() {
        List<MotorbikeServiceResponse> findAll = facade.findAll();
        return toMotorbikeServiceResponseList(findAll);
    }

    public MotorbikeControllerResponse getById(String id) {
        MotorbikeServiceResponse getById = facade.getById(id);
        return toMotorbikeControllerResponse(getById);
    }

    public void delete(String id) {
        facade.delete(id);
    }

}

