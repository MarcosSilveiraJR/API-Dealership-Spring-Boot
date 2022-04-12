package com.dealership.apispringbootdealership.integration.addressByCep.model.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressIntegrationRequest {
    private String cep;
}
