package com.dealership.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document("address")
public class AddressEntity {
    @Id
    private String id;
    @NotBlank
    private String zipCode;
    @NotBlank
    private String publicPlace;
    private String complement;
    @NotBlank
    private String neighborhood;
    @NotBlank
    private String locality;
    @NotBlank
    private String uf;

}
