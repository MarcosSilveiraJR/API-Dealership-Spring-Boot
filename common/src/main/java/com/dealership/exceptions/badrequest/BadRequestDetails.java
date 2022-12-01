package com.dealership.exceptions.badrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BadRequestDetails{
    private String title;
    private Integer status;
    private String details;
    private LocalDateTime timestamp;
    private String developerMessage;
}
