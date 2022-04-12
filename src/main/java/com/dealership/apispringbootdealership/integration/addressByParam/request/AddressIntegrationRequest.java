package com.dealership.apispringbootdealership.integration.addressByParam.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressIntegrationRequest {
    private String uf;
    private String cidade;
    private String logradouro;
}
