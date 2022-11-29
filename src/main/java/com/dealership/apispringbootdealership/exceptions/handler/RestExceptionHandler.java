package com.dealership.apispringbootdealership.exceptions.handler;

import com.dealership.apispringbootdealership.exceptions.apivalidationerror.ErrorObject;
import com.dealership.apispringbootdealership.exceptions.apivalidationerror.ErrorResponse;
import com.dealership.apispringbootdealership.exceptions.notfound.NotFoundException;
import com.dealership.apispringbootdealership.exceptions.servererror.InternalServerErrorDetails;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Component
@RestControllerAdvice
public class RestExceptionHandler {


    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ErrorResponse handlerNotFoundException(NotFoundException error) {
        return ErrorResponse.builder()
                .timestamp(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS))
                .error(List.of(ErrorObject.builder()
                                .message(NOT_FOUND.name())
                                .field(error.getMessage())
                                .parameter(error.getClass().getTypeName())
                        .build()))
                .build();
    }

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handlerNotFoundException(MethodArgumentNotValidException error) {
        return ErrorResponse.builder()
                .timestamp(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS))
                .error(List.of(ErrorObject.builder()
                        .message(BAD_REQUEST.name())
                        .field(error.getBindingResult().getAllErrors().stream()
                                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                                .collect(Collectors.joining(", ")))
                        .parameter(error.getClass().getTypeName())
                        .build()))
                .build();
    }

    @ResponseStatus(INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public InternalServerErrorDetails handlerInternalServerError(Exception error) {
        return InternalServerErrorDetails.builder()
                .timestamp(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS))
                .status(BAD_REQUEST.value())
                .title("Bad Request")
                .details(error.getMessage())
                .developerMessage(error.getClass().getName())
                .build();
    }
}

