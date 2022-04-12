package com.dealership.apispringbootdealership.repository;

import com.dealership.apispringbootdealership.entity.Motorbike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorbikeRepository extends MongoRepository<Motorbike, String> {

}
