package com.dealership.controller.motorbike;

import com.dealership.controller.motorbike.model.MotorbikeControllerRequest;
import com.dealership.controller.motorbike.model.MotorbikeControllerResponse;
import com.dealership.service.motorbike.MotorbikeServiceFacade;
import com.dealership.service.motorbike.model.MotorbikeServiceRequest;
import com.dealership.service.motorbike.model.MotorbikeServiceResponse;
import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

import static com.dealership.controller.motorbike.mapper.MotorbikeControllerMapper.INSTANCE;
import static com.dealership.controller.motorbike.mapper.MotorbikeControllerRequestMapper.toMotorbikeServiceRequest;
import static com.dealership.controller.motorbike.mapper.MotorbikeControllerResponseMapper.toMotorbikeControllerResponse;
import static com.dealership.controller.motorbike.mapper.MotorbikeControllerResponseMapper.toMotorbikeControllerResponseList;

@AllArgsConstructor
@Component
public final class MotorbikeControllerFacade {
    private MotorbikeServiceFacade facade;

    public MotorbikeControllerResponse save(MotorbikeControllerRequest motorbikeControllerRequest) {
        MotorbikeServiceRequest serviceRequest = toMotorbikeServiceRequest(motorbikeControllerRequest);
        MotorbikeServiceResponse save = facade.save(serviceRequest);
        return toMotorbikeControllerResponse(save);
    }

    public List<MotorbikeControllerResponse> getByModel(String model) {
        List<MotorbikeServiceResponse> serviceResponse = facade.getByModel(model);
        return toMotorbikeControllerResponseList(serviceResponse);
    }

    public List<MotorbikeControllerResponse> getByColor(String color) {
        List<MotorbikeServiceResponse> serviceResponse = facade.getByColor(color);
        return toMotorbikeControllerResponseList(serviceResponse);
    }

    public List<MotorbikeControllerResponse> getByPrice(BigDecimal price1, @Nullable BigDecimal price2) {
        List<MotorbikeServiceResponse> serviceResponse = facade.getByPrice(price1, price2);
        return toMotorbikeControllerResponseList(serviceResponse);
    }

    public List<MotorbikeControllerResponse> getByYear(Integer year) {
        List<MotorbikeServiceResponse> serviceResponse = facade.getByYear(year);
        return toMotorbikeControllerResponseList(serviceResponse);
    }

    public MotorbikeControllerResponse getById(String id) {
        MotorbikeServiceResponse getById = facade.getById(id);
        return INSTANCE.toMotorbikeControllerResponse(getById);
    }

    public List<MotorbikeControllerResponse> getByBrand(String brand) {
        List<MotorbikeServiceResponse> getByBrand = facade.getByBrand(brand);
        return INSTANCE.toMotorbikeControllerResponseList(getByBrand);
    }

    public List<MotorbikeControllerResponse> findByParams(@Nullable String brand, @Nullable String color, @Nullable String model,
                                                          @Nullable BigDecimal price, @Nullable Integer year) {
        List<MotorbikeServiceResponse> findByParams = facade.findByParams(brand, color, model, price, year);
        return toMotorbikeControllerResponseList(findByParams);

    }

    public List<MotorbikeControllerResponse> findAll() {
        List<MotorbikeServiceResponse> findAll = facade.findAll();
        return toMotorbikeControllerResponseList(findAll);
    }

    public MotorbikeControllerResponse update(MotorbikeControllerRequest motorbikeControllerRequest, String id) {
        MotorbikeServiceResponse update = facade.update(toMotorbikeServiceRequest(motorbikeControllerRequest), id);
        return toMotorbikeControllerResponse(update);
    }

    public void delete(String id) {
        facade.delete(id);
    }

}

