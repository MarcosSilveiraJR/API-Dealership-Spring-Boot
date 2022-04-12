package com.dealership.apispringbootdealership.service.motorbike;

import com.dealership.apispringbootdealership.entity.Address;
import com.dealership.apispringbootdealership.entity.Motorbike;
import com.dealership.apispringbootdealership.exceptions.notfound.NotFoundException;
import com.dealership.apispringbootdealership.integration.RestClient;
import com.dealership.apispringbootdealership.repository.MotorbikeRepository;
import com.dealership.apispringbootdealership.service.mapper.response.MotorbikeServiceResponseMapper;
import com.dealership.apispringbootdealership.service.model.request.MotorbikeServiceRequest;
import com.dealership.apispringbootdealership.service.model.response.MotorbikeServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.dealership.apispringbootdealership.service.mapper.request.MotorbikeServiceRequestMapper.toEntityMotorbike;
import static com.dealership.apispringbootdealership.service.mapper.response.MotorbikeServiceResponseMapper.toMotorbikeServiceResponse;

@AllArgsConstructor
@Service
public class MotorbikeService {

    public static final String NOT_FOUND = " Not Found";
    private final MotorbikeRepository repository;
    private final RestClient restClient;

    public MotorbikeServiceResponse save(MotorbikeServiceRequest motorbikeServiceRequest) {
        Motorbike motorbike = toEntityMotorbike(motorbikeServiceRequest);
        Motorbike save = repository.save(motorbike);
        return toMotorbikeServiceResponse(save);
    }

    public MotorbikeServiceResponse update(MotorbikeServiceRequest motorbikeServiceRequest, String id) {
        Motorbike motorbikeSave = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID " + id + NOT_FOUND));
        Motorbike motorbike = toEntityMotorbike(motorbikeServiceRequest);
        motorbikeServiceRequest.setId(motorbikeSave.getId());
        Motorbike save = repository.save(motorbike);
        return toMotorbikeServiceResponse(save);
    }

    public void delete(String id) {
        var allMotorbikes = "all";
        if (repository.existsById(id))
            repository.deleteById(id);
        else if (id.equals(allMotorbikes)) {
            repository.deleteAll();
        } else throw new NotFoundException("ID " + id + " nonexistent");
    }

    public MotorbikeServiceResponse getById(String id) {
        Motorbike motorbike = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID " + id + NOT_FOUND));
        return toMotorbikeServiceResponse(motorbike);
    }

    public List<MotorbikeServiceResponse> findAll() {
        return repository.findAll().stream()
                .map(MotorbikeServiceResponseMapper::toMotorbikeServiceResponse)
                .toList();
    }

    public Address getAddress(String cep) {
        return restClient.getJsonCep(cep);
    }

}