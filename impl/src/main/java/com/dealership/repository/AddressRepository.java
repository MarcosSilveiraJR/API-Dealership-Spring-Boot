package com.dealership.repository;

import com.dealership.entity.AddressEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<AddressEntity, String> {
    AddressEntity findByCep(String cep);
}
