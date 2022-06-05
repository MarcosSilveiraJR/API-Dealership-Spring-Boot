package com.dealership.apispringbootdealership.service.address;

import com.dealership.apispringbootdealership.entity.AddressEntity;
import com.dealership.apispringbootdealership.integration.AddressIntegration;
import com.dealership.apispringbootdealership.integration.model.AddressIntegrationResponse;
import com.dealership.apispringbootdealership.repository.AddressRepository;
import com.dealership.apispringbootdealership.service.address.mapper.AddressServiceResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.dealership.apispringbootdealership.service.address.mapper.AddresServiceRequestMapper.toEntity;
import static com.dealership.apispringbootdealership.service.address.mapper.AddressServiceResponseMapper.toAddressResponse;

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
        return  toAddressResponse(response);
    }

    public List<AddressIntegrationResponse> findAll() {
        return repository.findAll().stream().map(AddressServiceResponseMapper::toAddressResponse)
                .toList();
    }

    public void deleteAll(){
            repository.deleteAll();
    }
}
