package com.dealership.apispringbootdealership.integration.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AddressIntegration {
    @JsonProperty("cep")
    private String zipCode;
    @JsonProperty("logradouro")
    private String publicPlace;
    @JsonProperty("complemento")
    private String complement;
    @JsonProperty("bairro")
    private String district;
    @JsonProperty("localidade")
    private String locality;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
}
