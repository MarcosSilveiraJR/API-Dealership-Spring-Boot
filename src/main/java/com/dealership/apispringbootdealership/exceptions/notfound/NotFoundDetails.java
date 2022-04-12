package com.dealership.apispringbootdealership.exceptions.notfound;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class NotFoundDetails {
    private String title;
    private Integer status;
    private String details;
    private LocalDateTime timestamp;
    private String developerMessage;
}

