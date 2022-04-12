package com.dealership.apispringbootdealership.exceptions.apivalidationerror;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ErrorResponse {
    private LocalDateTime timestamp;
    private List<ErrorObject> error;
}
