package com.dealership.service.motorbike;

import com.dealership.entity.MotorbikeEntity;
import com.dealership.entity.model.mapper.MotorbikeMapper;
import com.dealership.entity.model.motorbike.MotorbikeRequest;
import com.dealership.entity.model.motorbike.MotorbikeResponse;
import com.dealership.repository.MotorbikeRepository;
import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;



@AllArgsConstructor
@Service
public class MotorbikeService  {

    private final MotorbikeRepository repository;
    private final MotorbikeMapper motorbikeMapper;

    public MotorbikeResponse save(MotorbikeRequest motorbikeRequest) {
        return motorbikeMapper.toMotorbikeResponse(repository.save(motorbikeMapper.toMotorbikeEntity(motorbikeRequest)));
    }

    public MotorbikeResponse getById(String id) {
        MotorbikeEntity motorbikeEntity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("ID %s não encontrado", id)));
        return motorbikeMapper.toMotorbikeResponse((motorbikeEntity));
    }

    public List<MotorbikeResponse> listByBrand(String brand){
        List<MotorbikeEntity> motorbikeEntityList = repository.getByBrandIgnoreCase(brand);
        return motorbikeEntityList.stream().map(motorbikeEntity -> {
            MotorbikeEntity entity = new MotorbikeEntity();
            entity.setBrand(motorbikeEntity.getBrand());
            entity.setModel(motorbikeEntity.getModel());
            entity.setColor(motorbikeEntity.getColor());
            entity.setPrice(motorbikeEntity.getPrice());
            entity.setYear(motorbikeEntity.getYear());
            return motorbikeMapper.toMotorbikeResponse((entity));
        }).collect(Collectors.toList());
    }

    public List<MotorbikeResponse> listByModel(String model){
        List<MotorbikeEntity> motorbikeEntities = repository.getByModelIgnoreCase(model);
        return motorbikeEntities.stream().map(motorbikeEntity -> {
            MotorbikeEntity motorbike = new MotorbikeEntity();
            motorbike.setBrand(motorbikeEntity.getBrand());
            motorbike.setModel(motorbikeEntity.getModel());
            motorbike.setColor(motorbikeEntity.getColor());
            motorbike.setPrice(motorbikeEntity.getPrice());
            motorbike.setYear(motorbikeEntity.getYear());
            return motorbikeMapper.toMotorbikeResponse((motorbikeEntity));
        }).collect(Collectors.toList());
    }

    public List<MotorbikeResponse> listByColor(String color) {
        List<MotorbikeEntity> motorbikeEntityList = repository.getByColorIgnoreCase(color);
        return motorbikeEntityList.stream().map(motorbikeEntity -> {
            MotorbikeEntity motorbike = new MotorbikeEntity();
            motorbike.setBrand(motorbikeEntity.getBrand());
            motorbike.setModel(motorbikeEntity.getModel());
            motorbike.setColor(motorbikeEntity.getColor());
            motorbike.setPrice(motorbikeEntity.getPrice());
            motorbike.setYear(motorbikeEntity.getYear());
            return motorbikeMapper.toMotorbikeResponse((motorbikeEntity));
        }).collect(Collectors.toList());
    }

    public List<MotorbikeResponse> listByPrice(BigDecimal price1, @Nullable BigDecimal price2){
        List<MotorbikeEntity> motorbikeEntityList = repository.getMotorbikeEntityByPriceBetweenOrderByPrice(price1, price2);
        return motorbikeEntityList.stream().map(motorbikeEntity -> {
            MotorbikeEntity motorbike = new MotorbikeEntity();
            motorbike.setBrand(motorbikeEntity.getBrand());
            motorbike.setModel(motorbikeEntity.getModel());
            motorbike.setColor(motorbikeEntity.getColor());
            motorbike.setPrice(motorbikeEntity.getPrice());
            motorbike.setYear(motorbikeEntity.getYear());
            return motorbikeMapper.toMotorbikeResponse((motorbikeEntity));
        }).collect(Collectors.toList());
    }

    public List<MotorbikeResponse> listByYear(Integer year){
        List<MotorbikeEntity> motorbikeEntityList = repository.getByYear(year);
        return motorbikeEntityList.stream().map(motorbikeEntity -> {
            MotorbikeEntity motorbike = new MotorbikeEntity();
            motorbike.setBrand(motorbikeEntity.getBrand());
            motorbike.setModel(motorbikeEntity.getModel());
            motorbike.setColor(motorbikeEntity.getColor());
            motorbike.setPrice(motorbikeEntity.getPrice());
            motorbike.setYear(motorbikeEntity.getYear());
            return motorbikeMapper.toMotorbikeResponse((motorbikeEntity));
        }).collect(Collectors.toList());
    }

    public List<MotorbikeResponse> find(@Nullable String brand, @Nullable String color, @Nullable String model,
                                        @Nullable BigDecimal price, @Nullable Integer year){
        List<MotorbikeEntity> motorbikeEntityList = repository.findAllByBrandIsLikeOrModelIsLikeOrColorIsLikeOrPriceIsLikeOrYearIsLike(brand,
                color, model, price, year);
        return motorbikeEntityList.stream().map(motorbikeEntity -> {
            MotorbikeEntity motorbike = new MotorbikeEntity();
            motorbike.setBrand(motorbikeEntity.getBrand());
            motorbike.setModel(motorbikeEntity.getModel());
            motorbike.setColor(motorbikeEntity.getColor());
            motorbike.setPrice(motorbikeEntity.getPrice());
            motorbike.setYear(motorbikeEntity.getYear());
            return motorbikeMapper.toMotorbikeResponse((motorbikeEntity));
        }).collect(Collectors.toList());
    }

    public List<MotorbikeResponse> listAll() {
        return repository.findAll().stream()
                .map(motorbikeMapper::toMotorbikeResponse)
                .toList();
    }

    public MotorbikeResponse update(MotorbikeRequest motorbikeRequest, String id) {
        MotorbikeEntity motorbikeEntitySave = repository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("ID %s não encontrado", id)));
        MotorbikeEntity motorbikeEntity = motorbikeMapper.toMotorbikeEntity(motorbikeRequest);
        motorbikeRequest.setId(motorbikeEntitySave.getId());
        MotorbikeEntity save = repository.save(motorbikeEntity);
        return motorbikeMapper.toMotorbikeResponse((save));
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public void deleteAll(){
        repository.deleteAll();
    }
}