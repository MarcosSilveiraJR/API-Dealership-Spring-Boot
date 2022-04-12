package com.dealership.apispringbootdealership.controller.motorbike;

import com.dealership.apispringbootdealership.controller.model.request.MotorbikeControllerRequest;
import com.dealership.apispringbootdealership.controller.model.response.MotorbikeControllerResponse;
import com.dealership.apispringbootdealership.service.motorbike.MotorbikeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/motorbike")
public class MotorbikeController {

    private final MotorbikeControllerFacade facade;
    private final MotorbikeService service;

    @PostMapping
    @ResponseStatus(CREATED)
    public MotorbikeControllerResponse save(@RequestBody @Valid MotorbikeControllerRequest motorbikeControllerRequest) {
        return facade.save(motorbikeControllerRequest);
    }

    @PostMapping("/cookies")
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
    @ResponseStatus(NO_CONTENT)
    public MotorbikeControllerResponse update(@RequestBody MotorbikeControllerRequest motorbikeControllerRequest,
                                              @PathVariable String id) {
        return facade.update(motorbikeControllerRequest, id);
    }

    @DeleteMapping
    @ResponseStatus(NO_CONTENT)
    public void delete(@RequestParam String id) {
        facade.delete(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public MotorbikeControllerResponse getById(@PathVariable String id) {
        return facade.getById(id);
    }

    @GetMapping
    @ResponseStatus(OK)
    public List<MotorbikeControllerResponse> findAll() {
        return facade.findAll();
    }

    @GetMapping("/read-spring-cookie")
    public String readCookie(
            @CookieValue(name = "user-id", defaultValue = "default-user-id") String userId) {
        return userId;
    }

//    @GetMapping("/cep/{cep}")
//    public AddressEntity getAddress(@PathVariable String cep){
//        return service.getAddress(cep);
//    }

}
