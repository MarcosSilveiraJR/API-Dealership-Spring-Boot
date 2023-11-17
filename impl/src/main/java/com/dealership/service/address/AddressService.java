package com.dealership.service.address;

import com.dealership.entity.AddressEntity;
import com.dealership.entity.model.address.AddressResponse;
import com.dealership.entity.model.mapper.AddressMapper;
import com.dealership.integration.AddressIntegration;
import com.dealership.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class AddressService {

    private final AddressIntegration addressIntegration;
    private final AddressRepository repository;
    private final AddressMapper addressMapper;

    public AddressResponse saveCep(String cep) {
        AddressResponse response = getCep(cep);
        repository.save(addressMapper.toAddressEntity(response));
        return response;
    }

    public AddressResponse getCep(String cep) {
        return addressMapper.fromAddressIntegrationToAddressResponse(addressIntegration.getCep(cep));

    }

    public AddressResponse findByCep(String cep) {
        AddressEntity response = repository.findByCep(cep);
        return addressMapper.toAddressResponse(response);
    }

    public List<AddressResponse> findAll() {
        return repository.findAll().stream().map(addressMapper::toAddressResponse)
                .toList();
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
