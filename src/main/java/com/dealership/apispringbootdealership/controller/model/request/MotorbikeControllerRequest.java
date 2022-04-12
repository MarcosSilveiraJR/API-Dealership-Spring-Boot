package com.dealership.apispringbootdealership.controller.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MotorbikeControllerRequest {
    private String id;
    private String brand;
    private String model;
    private String color;
    private BigDecimal price;
    private Integer year;
}
