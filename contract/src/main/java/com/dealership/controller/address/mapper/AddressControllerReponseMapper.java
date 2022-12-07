package com.dealership.controller.address.mapper;


import com.dealership.controller.address.model.AddressControllerResponse;
import com.dealership.integration.model.AddressIntegrationResponse;
import com.dealership.mapper.ModelMapper;

public class AddressControllerReponseMapper {
    private static ModelMapper<AddressIntegrationResponse> mapper;

    public static AddressControllerResponse toResponseController(AddressIntegrationResponse response) {
        return AddressControllerResponse.builder()
                .id(response.getId())
                .cep(response.getCep())
                .bairro(response.getBairro())
                .complemento(response.getComplemento())
                .bairro(response.getBairro())
                .localidade(response.getLocalidade())
                .logradouro(response.getLogradouro())
                .uf(response.getUf())
                .build();
    }

    public static AddressControllerResponse map(AddressIntegrationResponse response) {
        AddressControllerResponse addressControllerResponse = new AddressControllerResponse();
        mapper.map(addressIntegrationResponse -> {
            addressControllerResponse.setBairro(response.getBairro());
            addressControllerResponse.setBairro(response.getBairro());
            addressControllerResponse.setBairro(response.getBairro());
            return addressControllerResponse;
        });
        return addressControllerResponse;
    }

}
