package com.dealership.entity.model.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressResponse {
    private String id;
    private String zipCode;
    private String publicPlace;
    private String complement;
    private String neighborhood;
    private String locality;
    private String uf;
}
