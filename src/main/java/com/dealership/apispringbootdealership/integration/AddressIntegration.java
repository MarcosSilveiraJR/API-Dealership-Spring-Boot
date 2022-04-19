package com.dealership.apispringbootdealership.integration;

import com.dealership.apispringbootdealership.integration.model.response.AddressIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class AddressIntegration {
    private RestTemplate restTemplate;
    public AddressIntegrationResponse getCep(String cep) {
        return restTemplate.getForObject("/ws/" + cep + "/json/", AddressIntegrationResponse.class);
    }


//    public ASResponse get(ASRequest)
//        getcep(ASReq->AIRe)
//        save(AIresponse->Entity)
//        Map(Entity->ASResp)
//    public List<AddressEntity> getListaCep() {
//        return Arrays.stream(Objects.requireNonNull(restTemplate1.getForObject("/ws/" + "/json/", AddressEntity[].class)))
//                .toList();a
//    }

}