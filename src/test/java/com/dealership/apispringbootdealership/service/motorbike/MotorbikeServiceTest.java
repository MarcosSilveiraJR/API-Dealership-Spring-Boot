package com.dealership.apispringbootdealership.service.motorbike;

import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import com.dealership.apispringbootdealership.repository.MotorbikeRepository;
import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceRequest;
import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MotorbikeServiceTest {
    @InjectMocks
    MotorbikeService service;

    @Mock
    MotorbikeRepository repository;


    @Test
    void whenMotorbikeSaveWithSucess() {
        MotorbikeEntity entity = MotorbikeEntity.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        MotorbikeServiceRequest request = MotorbikeServiceRequest.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        MotorbikeServiceResponse expected = MotorbikeServiceResponse.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        when(repository.save(entity)).thenReturn(entity);
        MotorbikeServiceResponse actual = service.save(request);
        assertEquals(expected, actual);
    }

    @Test
    void whenMotorbikeUpdateWithSucess() {
        MotorbikeEntity entity = MotorbikeEntity.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        MotorbikeServiceRequest request = MotorbikeServiceRequest.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        MotorbikeServiceResponse expected = MotorbikeServiceResponse.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        when(repository.save(entity)).thenReturn(entity);
        when(repository.findById("6255a099c35196358df03b44")).thenReturn(Optional.of(entity));
        MotorbikeServiceResponse actual = service.update(request, "6255a099c35196358df03b44");
        assertEquals(expected, actual);


    }

    @Test
    void whenMotorbikeDeleteWithSuccess() {

        when(repository.existsById("6255a099c35196358df03b44")).thenReturn(true);
        service.delete("6255a099c35196358df03b44");
        verify(repository, times(1)).deleteById("6255a099c35196358df03b44");
    }

    @Test
    void whenMotorbikeFindById() {
        MotorbikeEntity entity = MotorbikeEntity.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        MotorbikeServiceRequest request = MotorbikeServiceRequest.builder()
                .id("6255a099c35196358df03b44")
                .build();

        MotorbikeServiceResponse expected = MotorbikeServiceResponse.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        when(repository.findById(request.toString())).thenReturn(Optional.of(entity));
        MotorbikeServiceResponse actual = service.getById(request.toString());
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    void whenMotorbikeFindAll() {
        List<MotorbikeEntity> entities = List.of(MotorbikeEntity.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build());

        List<MotorbikeServiceResponse> expected = List.of(MotorbikeServiceResponse.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build());

        when(repository.findAll()).thenReturn(entities);
        List<MotorbikeServiceResponse> actual = service.findAll();
        assertEquals(expected, actual);
    }

}