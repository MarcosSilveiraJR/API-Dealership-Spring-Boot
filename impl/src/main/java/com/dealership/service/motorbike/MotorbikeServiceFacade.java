package com.dealership.service.motorbike;

import com.dealership.entity.model.motorbike.MotorbikeRequest;
import com.dealership.entity.model.motorbike.MotorbikeResponse;
import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Component
public final class MotorbikeServiceFacade {
    private final MotorbikeService service;

    public MotorbikeResponse save(MotorbikeRequest motorbikeRequest) {
        return service.save(motorbikeRequest);
    }

    public List<MotorbikeResponse> getByBrand(String brand){
        return service.listByBrand(brand);
    }

    public List<MotorbikeResponse> getByModel(String model){
        return service.listByModel(model);
    }

    public List<MotorbikeResponse> getByColor(String color){
        return service.listByColor(color);
    }

    public List<MotorbikeResponse> getByPrice(BigDecimal price1, @Nullable BigDecimal price2){
        return service.listByPrice(price1, price2);
    }

    public List<MotorbikeResponse> getByYear(Integer year){
        return service.listByYear(year);
    }

    public List<MotorbikeResponse> findByParams(@Nullable String brand, @Nullable String color, @Nullable String model,
                                                       @Nullable BigDecimal price, @Nullable Integer year) {
        return service.find(brand, model, color, price, year);
    }

    public List<MotorbikeResponse> findAll() {
        return service.listAll();
    }

    public MotorbikeResponse getById(String id) {
        return service.getById(id);
    }

    public MotorbikeResponse update(MotorbikeRequest motorbikeRequest, String id) {
        MotorbikeResponse byId = service.getById(id);
        return service.update(motorbikeRequest, byId.getId());
    }

    public void delete(String id) {
        service.delete(id);
    }

    public void deleteAll(){
        service.deleteAll();
    }

}
