package com.dealership.apispringbootdealership.repository;

import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorbikeRepository extends MongoRepository<MotorbikeEntity, String> {

}
