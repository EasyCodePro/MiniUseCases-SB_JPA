package com.sbjpa.jpaquery1.controller;

import com.sbjpa.jpaquery1.dto.AddressDto;
import com.sbjpa.jpaquery1.model.Address;
import com.sbjpa.jpaquery1.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JpaQuery1Controller {

    @Autowired
    AddressRepo addressRepo;

    @PostMapping("/getListOfAddress")
    public List<Address> getListOfAddress(@RequestBody AddressDto addressDto) {
        System.out.println(addressDto);
        return addressRepo.findByAnyOfOneOrAll(addressDto.getCity(), addressDto.getState(),
                addressDto.getZip());
    }

}
