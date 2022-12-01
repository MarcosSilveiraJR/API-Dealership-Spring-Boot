package com.dealership.exceptions.apivalidationerror;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ErrorObject {
    private String message;
    private String field;
    private String parameter;
}
