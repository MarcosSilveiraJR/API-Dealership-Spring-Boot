package com.dealership.apispringbootdealership.entity.model.motorbike;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MotorbikeResponse {
    private String id;
    private String brand;
    private String model;
    private String color;
    private BigDecimal price;
    private Integer year;
}
