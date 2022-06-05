package com.dealership.apispringbootdealership.controller.motorbike.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MotorbikeControllerResponse {
    private String id;
    private String brand;
    private String model;
    private String color;
    private BigDecimal price;
    private Integer year;
}
