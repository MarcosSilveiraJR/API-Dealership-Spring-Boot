package com.dealership.apispringbootdealership.service.motorbike;

import com.dealership.apispringbootdealership.service.motorbike.model.request.MotorbikeServiceRequest;
import com.dealership.apispringbootdealership.service.motorbike.model.response.MotorbikeServiceResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record MotorbikeFacade(MotorbikeService service) {

    public MotorbikeServiceResponse save(MotorbikeServiceRequest motorbikeServiceRequest) {
        return service.save(motorbikeServiceRequest);
    }

    public MotorbikeServiceResponse update(MotorbikeServiceRequest motorbikeServiceRequest, String id) {
        MotorbikeServiceResponse byId = service.getById(id);
        return service.update(motorbikeServiceRequest, byId.getId());
    }

    public List<MotorbikeServiceResponse> findAll() {
        return service.findAll();
    }

    public MotorbikeServiceResponse getById(String id) {
        return service.getById(id);
    }

    public void delete(String id) {
        service.delete(id);
    }


}
