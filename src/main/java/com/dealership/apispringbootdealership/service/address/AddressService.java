package com.dealership.apispringbootdealership.service.address;

import com.dealership.apispringbootdealership.entity.AddressEntity;
import com.dealership.apispringbootdealership.integration.AddressIntegration;
import com.dealership.apispringbootdealership.integration.model.response.AddressIntegrationResponse;
import com.dealership.apispringbootdealership.service.address.model.response.AddressServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.dealership.apispringbootdealership.service.address.mapper.response.AddressServiceResponseMapper.toAddressEntity;

@AllArgsConstructor
@Service
public class AddressService {

    private final AddressIntegration addressIntegration;

    public AddressIntegrationResponse getCep(String cep) {
        return addressIntegration.getCep(cep);

    }
}
