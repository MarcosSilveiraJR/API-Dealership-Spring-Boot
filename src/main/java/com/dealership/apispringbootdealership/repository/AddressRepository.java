package com.dealership.apispringbootdealership.repository;

import com.dealership.apispringbootdealership.entity.AddressEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends MongoRepository<AddressEntity, String> {
    AddressEntity findByCep(String cep);

}
