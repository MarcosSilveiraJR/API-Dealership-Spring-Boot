package com.dealership.service.address;

import com.dealership.entity.AddressEntity;
import com.dealership.integration.AddressIntegration;
import com.dealership.integration.model.AddressIntegrationResponse;
import com.dealership.repository.AddressRepository;
import com.dealership.service.address.mapper.AddressServiceResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.dealership.service.address.mapper.AddressServiceResponseMapper.toAddressResponse;
import static com.dealership.service.address.mapper.AddressServiceResponseMapper.toEntity;


@AllArgsConstructor
@Service
public class AddressService {

    private final AddressIntegration addressIntegration;
    private final AddressRepository repository;

    public AddressIntegrationResponse saveCep(String cep) {
        AddressEntity response = toEntity(getCep(cep));
        repository.save(response);
        return toAddressResponse(response);
    }

    public AddressIntegrationResponse getCep(String cep) {
        return addressIntegration.getCep(cep);

    }

    public AddressIntegrationResponse findByCep(String cep) {
        AddressEntity response = repository.findByCep(cep);
        return toAddressResponse(response);
    }

    public List<AddressIntegrationResponse> findAll() {
        return repository.findAll().stream().map(AddressServiceResponseMapper::toAddressResponse)
                .toList();
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
