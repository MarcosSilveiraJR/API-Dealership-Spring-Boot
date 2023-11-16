package integration;

import com.dealership.integration.model.AddressIntegrationResponse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(classes = AddressIntegrationTest.class)
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
class AddressIntegrationTest {

    @Test
    void getCep() {
        String CEP = "93222-130";
        String URL = "https://viacep.com.br/ws/" + CEP + "/json/";

        TestRestTemplate testRestTemplate = new TestRestTemplate();

        AddressIntegrationResponse rs = AddressIntegrationResponse.builder()
                .cep(CEP)
                .logradouro("Rua Portão")
                .complemento("")
                .bairro("Vargas")
                .localidade("Sapucaia do Sul")
                .uf("RS")
                .build();

        AddressIntegrationResponse forObject = testRestTemplate.getRestTemplate().getForObject((URL),
                AddressIntegrationResponse.class);

        Assert.assertEquals(forObject, rs);
    }
}