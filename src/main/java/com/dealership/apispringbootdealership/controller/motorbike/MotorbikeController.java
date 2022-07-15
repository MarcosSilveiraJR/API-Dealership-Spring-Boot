package com.dealership.apispringbootdealership.controller.motorbike;

import com.dealership.apispringbootdealership.controller.motorbike.model.MotorbikeControllerRequest;
import com.dealership.apispringbootdealership.controller.motorbike.model.MotorbikeControllerResponse;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/motorbike")
public class MotorbikeController {

    private final MotorbikeControllerFacade facade;

    @PostMapping
    @ApiOperation(value = "Salva uma moto no banco de dados")
    @ResponseStatus(CREATED)
    public MotorbikeControllerResponse save(@RequestBody @Valid MotorbikeControllerRequest motorbikeControllerRequest) {
        return facade.save(motorbikeControllerRequest);
    }

    @PostMapping("/cookies")
    @ApiOperation(value = "Salva um Cookie")
    public String setCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("id", "1");
        cookie.setMaxAge(7 * 24 * 60 * 60);
        cookie.setDomain("localhost");
        cookie.setHttpOnly(true);
        cookie.setSecure(true);
        cookie.setPath("/");
        response.addCookie(cookie);
        return "Cookie adicionado!";
    }

    @PutMapping("/{id}")
    @ResponseStatus(OK)
    @ApiOperation("Altera as características da de uma moto pelo ID")
    public MotorbikeControllerResponse update(@RequestBody MotorbikeControllerRequest motorbikeControllerRequest,
                                              @PathVariable String id) {
        return facade.update(motorbikeControllerRequest, id);
    }

    @DeleteMapping
    @ResponseStatus(NO_CONTENT)
    @ApiOperation("Deleta uma moto do banco de dados")
    public void delete(@RequestParam String id) {
        facade.delete(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    @ApiOperation("Retorna uma moto do banco de dados")
    public MotorbikeControllerResponse getById(@PathVariable String id) {

        return facade.getById(id);
    }

    @GetMapping
    @ResponseStatus(OK)
    @ApiOperation("Retorna todas as motos do banco de dados")
    public List<MotorbikeControllerResponse> findAll() {
        List<MotorbikeControllerResponse> responses = facade.findAll();
        for (MotorbikeControllerResponse controllerResponse : responses){
            String id = controllerResponse.getId();
            controllerResponse.add(linkTo(methodOn(MotorbikeController.class).getById(id)).withSelfRel());
        }
        return responses;
    }

    @GetMapping("/read-spring-cookie")
    @ApiOperation("Retorna o cookie salvo")
    public String readCookie(
            @CookieValue(name = "user-id", defaultValue = "default-user-id") String userId) {
        return userId;
    }

}
