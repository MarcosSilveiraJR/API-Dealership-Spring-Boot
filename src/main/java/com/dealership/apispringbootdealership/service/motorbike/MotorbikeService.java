package com.dealership.apispringbootdealership.service.motorbike;

import com.dealership.apispringbootdealership.entity.MotorbikeEntity;
import com.dealership.apispringbootdealership.exceptions.notfound.NotFoundException;
import com.dealership.apispringbootdealership.repository.MotorbikeRepository;
import com.dealership.apispringbootdealership.service.motorbike.mapper.MotorbikeServiceResponseMapper;
import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceRequest;
import com.dealership.apispringbootdealership.service.motorbike.model.MotorbikeServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.dealership.apispringbootdealership.service.motorbike.mapper.MotorbikeServiceRequestMapper.toEntityMotorbike;
import static com.dealership.apispringbootdealership.service.motorbike.mapper.MotorbikeServiceResponseMapper.toMotorbikeServiceResponse;

@AllArgsConstructor
@Service
public class MotorbikeService  {

    public static final String NOT_FOUND = " Not Found";
    public final MotorbikeRepository repository;

    public MotorbikeServiceResponse save(MotorbikeServiceRequest motorbikeServiceRequest) {
        return toMotorbikeServiceResponse(repository.save(toEntityMotorbike(motorbikeServiceRequest)));
    }

    public MotorbikeServiceResponse update(MotorbikeServiceRequest motorbikeServiceRequest, String id) {
        MotorbikeEntity motorbikeEntitySave = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID " + id + NOT_FOUND));
        MotorbikeEntity motorbikeEntity = toEntityMotorbike(motorbikeServiceRequest);
        motorbikeServiceRequest.setId(motorbikeEntitySave.getId());
        MotorbikeEntity save = repository.save(motorbikeEntity);
        return toMotorbikeServiceResponse(save);
    }

    public void delete(String id) {
        var allMotorbikes = "all";
        if (repository.existsById(id))
            repository.deleteById(id);
        else if (id.equals(allMotorbikes)) {
            repository.deleteAll();
        } else throw new NotFoundException("ID " + id + " Nonexistent");
    }

    public MotorbikeServiceResponse getById(String id) {
        MotorbikeEntity motorbikeEntity = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID " + id + NOT_FOUND));
        return toMotorbikeServiceResponse(motorbikeEntity);
    }

    public List<MotorbikeServiceResponse> findAll() {
        return repository.findAll().stream()
                .map(MotorbikeServiceResponseMapper::toMotorbikeServiceResponse)
                .toList();
    }

}