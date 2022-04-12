package com.dealership.apispringbootdealership.model.address.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressResponse {
    private String zipCode;
    private String publicPlace;
    private String complement;
    private String district;
    private String locale;
}
