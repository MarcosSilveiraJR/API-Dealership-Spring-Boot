package com.dealership.apispringbootdealership.service.motorbike;

import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceRequest;
import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Component
public final class MotorbikeServiceFacade {
    private final MotorbikeService service;

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

    public MotorbikeService service() {
        return service;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (MotorbikeServiceFacade) obj;
        return Objects.equals(this.service, that.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service);
    }

    @Override
    public String toString() {
        return "MotorbikeFacade[" +
                "service=" + service + ']';
    }


}
