package com.dealership.apispringbootdealership.service.address;

import com.dealership.apispringbootdealership.integration.addressByCep.AddressByCepIntegration;
import com.dealership.apispringbootdealership.integration.addressByCep.model.response.AddressIntegrationResponse;
import com.dealership.apispringbootdealership.integration.addressByParam.AddressByParamIntegration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddressService {
    private final AddressByCepIntegration addressByCepIntegration;
    private final AddressByParamIntegration addressByParamIntegration;


    public AddressIntegrationResponse getCep(String cep){
        return addressByCepIntegration.getCep(cep);
    }
}
