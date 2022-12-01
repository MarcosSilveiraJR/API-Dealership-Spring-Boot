package controller.motorbike;

import com.dealership.controller.motorbike.MotorbikeController;
import com.dealership.controller.motorbike.MotorbikeControllerFacade;
import com.dealership.controller.motorbike.model.MotorbikeControllerRequest;
import com.dealership.controller.motorbike.model.MotorbikeControllerResponse;
import com.dealership.service.motorbike.MotorbikeServiceFacade;
import com.dealership.service.motorbike.model.MotorbikeServiceRequest;
import com.dealership.service.motorbike.model.MotorbikeServiceResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

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
    @Autowired
    MotorbikeServiceFacade motorbikeServiceFacade;

    @Mock
    MotorbikeControllerResponse response;

    @Mock
    MotorbikeServiceRequest request;

    MotorbikeServiceResponse motorbikeServiceResponse = new MotorbikeServiceResponse("1", "kk", "jj",
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