package com.dealership.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document("motorbikes")
public class MotorbikeEntity {
    @Id
    private String id;
    @NotBlank(message = "brand not must be null!")
    private String brand;
    @NotBlank(message = "model not must be null!")
    private String model;
    @NotBlank(message = "color not must be null!")
    private String color;
    @NotNull(message = "price not must be null!")
    private BigDecimal price;
    @NotNull(message = "year not must be null!")
    private Integer year;
}
