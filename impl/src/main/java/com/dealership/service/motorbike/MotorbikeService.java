package com.dealership.service.motorbike;

import com.dealership.entity.MotorbikeEntity;
import com.dealership.repository.MotorbikeRepository;
import com.dealership.service.motorbike.mapper.MotorbikeServiceResponseMapper;
import com.dealership.service.motorbike.model.MotorbikeServiceRequest;
import com.dealership.service.motorbike.model.MotorbikeServiceResponse;
import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.dealership.service.motorbike.mapper.MotorbikeServiceRequestMapper.toEntityMotorbike;
import static com.dealership.service.motorbike.mapper.MotorbikeServiceResponseMapper.toMotorbikeServiceResponse;


@AllArgsConstructor
@Service
public class MotorbikeService  {

    public final MotorbikeRepository repository;

    public MotorbikeServiceResponse save(MotorbikeServiceRequest motorbikeServiceRequest) {
        return toMotorbikeServiceResponse(repository.save(toEntityMotorbike(motorbikeServiceRequest)));
    }

    public MotorbikeServiceResponse getById(String id) {
        MotorbikeEntity motorbikeEntity = repository.findById(id)
                .orElseThrow(() -> null);
        return toMotorbikeServiceResponse(motorbikeEntity);
    }

    public List<MotorbikeServiceResponse> getByBrand(String brand){
        List<MotorbikeServiceResponse> list = new ArrayList<>();
        List<MotorbikeEntity> byBrand = repository.getByBrandIgnoreCase(brand);
        for(MotorbikeEntity entity : byBrand){
            MotorbikeEntity motorbikeEntity = new MotorbikeEntity();
            motorbikeEntity.setBrand(entity.getBrand());
            motorbikeEntity.setModel(entity.getModel());
            motorbikeEntity.setColor(entity.getColor());
            motorbikeEntity.setPrice(entity.getPrice());
            motorbikeEntity.setYear(entity.getYear());
            list.add(toMotorbikeServiceResponse(motorbikeEntity));
        }
        return list;
    }

    public List<MotorbikeServiceResponse> getByModel(String model){
        List<MotorbikeServiceResponse> list = new ArrayList<>();
        List<MotorbikeEntity> byModel = repository.getByModelIgnoreCase(model);
        for(MotorbikeEntity entity : byModel){
            MotorbikeEntity motorbikeEntity = new MotorbikeEntity();
            motorbikeEntity.setBrand(entity.getBrand());
            motorbikeEntity.setModel(entity.getModel());
            motorbikeEntity.setColor(entity.getColor());
            motorbikeEntity.setPrice(entity.getPrice());
            motorbikeEntity.setYear(entity.getYear());
            list.add(toMotorbikeServiceResponse(motorbikeEntity));
        }
        return list;
    }

    public List<MotorbikeServiceResponse> getByColor(String color){
        List<MotorbikeServiceResponse> list = new ArrayList<>();
        List<MotorbikeEntity> byColor = repository.getByColorIgnoreCase(color);
        for(MotorbikeEntity entity : byColor){
            MotorbikeEntity motorbikeEntity = new MotorbikeEntity();
            motorbikeEntity.setBrand(entity.getBrand());
            motorbikeEntity.setModel(entity.getModel());
            motorbikeEntity.setColor(entity.getColor());
            motorbikeEntity.setPrice(entity.getPrice());
            motorbikeEntity.setYear(entity.getYear());
            list.add(toMotorbikeServiceResponse(motorbikeEntity));
        }
        return list;
    }

    public List<MotorbikeServiceResponse> getByPrice(BigDecimal price1, @Nullable BigDecimal price2){
        List<MotorbikeServiceResponse> list = new ArrayList<>();
        List<MotorbikeEntity> byPrice = repository.getMotorbikeEntityByPriceBetweenOrderByPrice(price1, price2);
        for(MotorbikeEntity entity : byPrice){
            MotorbikeEntity motorbikeEntity = new MotorbikeEntity();
            motorbikeEntity.setBrand(entity.getBrand());
            motorbikeEntity.setModel(entity.getModel());
            motorbikeEntity.setColor(entity.getColor());
            motorbikeEntity.setPrice(entity.getPrice());
            motorbikeEntity.setYear(entity.getYear());
            list.add(toMotorbikeServiceResponse(motorbikeEntity));
        }
        return list;
    }

    public List<MotorbikeServiceResponse> getByYear(Integer year){
        List<MotorbikeServiceResponse> list = new ArrayList<>();
        List<MotorbikeEntity> byYear = repository.getByYear(year);
        for(MotorbikeEntity entity : byYear){
            MotorbikeEntity motorbikeEntity = new MotorbikeEntity();
            motorbikeEntity.setBrand(entity.getBrand());
            motorbikeEntity.setModel(entity.getModel());
            motorbikeEntity.setColor(entity.getColor());
            motorbikeEntity.setPrice(entity.getPrice());
            motorbikeEntity.setYear(entity.getYear());
            list.add(toMotorbikeServiceResponse(motorbikeEntity));
        }
        return list;
    }

    public List<MotorbikeServiceResponse> findByParams(@Nullable String brand, @Nullable String color, @Nullable String model,
                                                      @Nullable BigDecimal price, @Nullable Integer year){
        List<MotorbikeServiceResponse> list = new ArrayList<>();
        List<MotorbikeEntity> byParams = repository.findAllByBrandIsLikeOrModelIsLikeOrColorIsLikeOrPriceIsLikeOrYearIsLike(brand,
                color, model, price, year);
        for(MotorbikeEntity entity : byParams){
            MotorbikeEntity motorbikeEntity = new MotorbikeEntity();
            motorbikeEntity.setBrand(entity.getBrand());
            motorbikeEntity.setModel(entity.getModel());
            motorbikeEntity.setColor(entity.getColor());
            motorbikeEntity.setPrice(entity.getPrice());
            motorbikeEntity.setYear(entity.getYear());
            list.add(toMotorbikeServiceResponse(motorbikeEntity));
        }
        return list;
    }

    public List<MotorbikeServiceResponse> findAll() {
        return repository.findAll().stream()
                .map(MotorbikeServiceResponseMapper::toMotorbikeServiceResponse)
                .toList();
    }

    public MotorbikeServiceResponse update(MotorbikeServiceRequest motorbikeServiceRequest, String id) {
        MotorbikeEntity motorbikeEntitySave = repository.findById(id)
                .orElseThrow(() -> null);
        MotorbikeEntity motorbikeEntity = toEntityMotorbike(motorbikeServiceRequest);
        motorbikeServiceRequest.setId(motorbikeEntitySave.getId());
        MotorbikeEntity save = repository.save(motorbikeEntity);
        return toMotorbikeServiceResponse(save);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public void deleteAll(){
        repository.deleteAll();
    }
}