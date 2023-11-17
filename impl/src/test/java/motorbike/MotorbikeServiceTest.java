package motorbike;

import com.dealership.entity.MotorbikeEntity;
import com.dealership.entity.model.motorbike.MotorbikeRequest;
import com.dealership.entity.model.motorbike.MotorbikeResponse;
import com.dealership.repository.MotorbikeRepository;
import com.dealership.service.motorbike.MotorbikeService;
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

        MotorbikeRequest request = MotorbikeRequest.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        MotorbikeResponse expected = MotorbikeResponse.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        when(repository.save(entity)).thenReturn(entity);
        MotorbikeResponse actual = service.save(request);
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

        MotorbikeRequest request = MotorbikeRequest.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        MotorbikeResponse expected = MotorbikeResponse.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        when(repository.save(entity)).thenReturn(entity);
        when(repository.findById("6255a099c35196358df03b44")).thenReturn(Optional.of(entity));
        MotorbikeResponse actual = service.update(request, "6255a099c35196358df03b44");
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

        MotorbikeRequest request = MotorbikeRequest.builder()
                .id("6255a099c35196358df03b44")
                .build();

        MotorbikeResponse expected = MotorbikeResponse.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build();

        when(repository.findById(request.toString())).thenReturn(Optional.of(entity));
        MotorbikeResponse actual = service.getById(request.toString());
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

        List<MotorbikeResponse> expected = List.of(MotorbikeResponse.builder()
                .id("6255a099c35196358df03b44")
                .brand("Honda")
                .model("CB 600")
                .color("Preta")
                .price(BigDecimal.valueOf(22.000))
                .year(2012)
                .build());

        when(repository.findAll()).thenReturn(entities);
        List<MotorbikeResponse> actual = service.listAll();
        assertEquals(expected, actual);
    }

}