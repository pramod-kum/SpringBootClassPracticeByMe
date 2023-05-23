package com.geekster.Mapping.controller;

import com.geekster.Mapping.models.Address;
import com.geekster.Mapping.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    IAddressRepository addressRepository;

    @PostMapping("/address")
    void saveAddress(@RequestBody Address address){
        addressRepository.save(address);
    }
}
