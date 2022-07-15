package com.dealership.apispringbootdealership.entity.model.motorbike;

import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MotorbikeRequest {
    private String id;
    private String brand;
    private String model;
    private String color;
    private BigDecimal price;
    private Integer year;
}
