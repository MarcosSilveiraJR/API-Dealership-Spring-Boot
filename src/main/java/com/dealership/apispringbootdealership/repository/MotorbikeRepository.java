package com.dealership.apispringbootdealership.repository;

import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import com.mongodb.lang.Nullable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface MotorbikeRepository extends MongoRepository<MotorbikeEntity, String> {

    MotorbikeEntity getByBrand(String brand);
    MotorbikeEntity getByYear(Integer brand);
    MotorbikeEntity getByColor(String brand);
    MotorbikeEntity getByModel(String brand);
    MotorbikeEntity getByPriceBetween(BigDecimal value1, @Nullable BigDecimal value2);
}
