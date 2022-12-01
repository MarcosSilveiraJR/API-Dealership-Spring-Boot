package com.dealership.service.motorbike;

import com.dealership.service.motorbike.model.MotorbikeServiceRequest;
import com.dealership.service.motorbike.model.MotorbikeServiceResponse;
import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Component
public final class MotorbikeServiceFacade {
    private final MotorbikeService service;

    public MotorbikeServiceResponse save(MotorbikeServiceRequest motorbikeServiceRequest) {
        return service.save(motorbikeServiceRequest);
    }

    public List<MotorbikeServiceResponse> getByBrand(String brand){
        return service.getByBrand(brand);
    }

    public List<MotorbikeServiceResponse> getByModel(String model){
        return service.getByModel(model);
    }

    public List<MotorbikeServiceResponse> getByColor(String color){
        return service.getByColor(color);
    }

    public List<MotorbikeServiceResponse> getByPrice(BigDecimal price1, @Nullable BigDecimal price2){
        return service.getByPrice(price1, price2);
    }

    public List<MotorbikeServiceResponse> getByYear(Integer year){
        return service.getByYear(year);
    }

    public List<MotorbikeServiceResponse> findByParams(@Nullable String brand, @Nullable String color, @Nullable String model,
                                                       @Nullable BigDecimal price, @Nullable Integer year) {
        return service.findByParams(brand, model, color, price, year);
    }

    public List<MotorbikeServiceResponse> findAll() {
        return service.findAll();
    }

    public MotorbikeServiceResponse getById(String id) {
        return service.getById(id);
    }

    public MotorbikeServiceResponse update(MotorbikeServiceRequest motorbikeServiceRequest, String id) {
        MotorbikeServiceResponse byId = service.getById(id);
        return service.update(motorbikeServiceRequest, byId.getId());
    }

    public void delete(String id) {
        service.delete(id);
    }

    public void deleteAll(){
        service.deleteAll();
    }

}
