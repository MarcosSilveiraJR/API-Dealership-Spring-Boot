package com.dealership.apispringbootdealership.entity;

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
    @NotBlank(message = "Insira uma marca!")
    private String brand;
    @NotBlank(message = "Insira um modelo!")
    private String model;
    @NotBlank(message = "Insira uma cor!")
    private String color;
    @NotNull(message = "Insira um valor!")
    private BigDecimal price;
    @NotNull(message = "Insira um ano!")
    private Integer year;
}
