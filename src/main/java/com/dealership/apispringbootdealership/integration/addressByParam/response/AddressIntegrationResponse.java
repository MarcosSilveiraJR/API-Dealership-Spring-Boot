package com.dealership.apispringbootdealership.integration.addressByParam.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AddressIntegrationResponse {
    private String cep;
    private String bairro;
    private String complemento;
    private String distrito;
    private String localidade;
    private String uf;
}
