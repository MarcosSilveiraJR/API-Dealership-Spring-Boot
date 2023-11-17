package controller.motorbike;

import com.dealership.controller.motorbike.MotorbikeController;
import com.dealership.controller.motorbike.MotorbikeControllerFacade;
import com.dealership.controller.motorbike.model.MotorbikeControllerRequest;
import com.dealership.controller.motorbike.model.MotorbikeControllerResponse;
import com.dealership.entity.model.motorbike.MotorbikeRequest;
import com.dealership.entity.model.motorbike.MotorbikeResponse;
import com.dealership.service.motorbike.MotorbikeServiceFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.math.BigDecimal;

import static org.mockito.Mockito.when;

class MotorbikeControllerTest {

    @InjectMocks
    MotorbikeController controller;

    @Mock
    MotorbikeControllerRequest controllerRequest;

    @Mock
    MotorbikeControllerFacade facade;

    @Mock
    MotorbikeServiceFacade motorbikeServiceFacade;

    @Mock
    MotorbikeControllerResponse response;

    @Mock
    MotorbikeRequest request;

    MotorbikeResponse motorbikeServiceResponse = new MotorbikeResponse("1", "kk", "jj",
            "dd", new BigDecimal(10.0), 10);


    @Test
    void save() {
        when(motorbikeServiceFacade.save(request)).thenReturn(motorbikeServiceResponse);
        MotorbikeControllerResponse actual = controller.save(controllerRequest);
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