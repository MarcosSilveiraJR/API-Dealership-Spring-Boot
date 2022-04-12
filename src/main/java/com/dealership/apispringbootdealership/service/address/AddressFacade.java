package com.dealership.apispringbootdealership.service.address;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AddressFacade {
    public AddressService addressService;
}
