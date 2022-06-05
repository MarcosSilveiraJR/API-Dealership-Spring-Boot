package com.dealership.apispringbootdealership.service.motorbike.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MotorbikeServiceResponse {
    private String id;
    private String brand;
    private String model;
    private String color;
    private BigDecimal price;
    private Integer year;
}
