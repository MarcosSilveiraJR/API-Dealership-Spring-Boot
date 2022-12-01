package com.dealership.repository;

import com.dealership.entity.MotorbikeEntity;
import com.mongodb.lang.Nullable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface MotorbikeRepository extends MongoRepository<MotorbikeEntity, String> {

    List<MotorbikeEntity> getByBrandIgnoreCase(String brand);

    List<MotorbikeEntity> getByModelIgnoreCase(String brand);

    List<MotorbikeEntity> getByColorIgnoreCase(String brand);

    List<MotorbikeEntity> getByYear(Integer brand);

    List<MotorbikeEntity> getMotorbikeEntityByPriceBetweenOrderByPrice(BigDecimal price1, @Nullable BigDecimal price2);

    List<MotorbikeEntity> findByBrandIgnoreCaseAndColorIgnoreCaseAndModelIgnoreCaseAndPriceAndYear(@Nullable String brand,
                                                                                                   @Nullable String color,
                                                                                                   @Nullable String model,
                                                                                                   @Nullable BigDecimal price,
                                                                                                   @Nullable Integer year);
}
