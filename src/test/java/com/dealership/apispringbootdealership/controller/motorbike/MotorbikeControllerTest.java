package com.dealership.apispringbootdealership.controller.motorbike;

import com.dealership.apispringbootdealership.controller.motorbike.model.request.MotorbikeControllerRequest;
import com.dealership.apispringbootdealership.controller.motorbike.model.response.MotorbikeControllerResponse;
import com.dealership.apispringbootdealership.service.motorbike.MotorbikeFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MotorbikeControllerTest {

    @InjectMocks
    MotorbikeController controller;

    @Mock
    MotorbikeControllerFacade facade;

    @Mock
    MotorbikeFacade motorbikeFacade;

    @Mock
    MotorbikeControllerResponse response;

    @Mock
    MotorbikeControllerRequest request;

    @Test
    void save() {
        when(motorbikeFacade.save(request)).thenReturn(response);
        MotorbikeControllerResponse actual = controller.save(request);
        Assertions.assertEquals(response, actual);
    }

    @Test
    void setCookie() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void readCookie() {
    }
}