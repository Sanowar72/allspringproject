package com.mapping.mapping.practice.controller;

import com.mapping.mapping.practice.model.Address;
import com.mapping.mapping.practice.service.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressServices addressServices;
    @GetMapping
    public String home(){
        return "this is address home .....";
    }

    @GetMapping(value = "/all")
    public Iterable<Address> getall(){
        return addressServices.getall();
    }

    @PostMapping(value = "/post")
    public String add(@RequestBody Address address){
        addressServices.add(address);
        return "added........";
    }

    @PutMapping(value = "updatebyid/{id}/{name}")
    public void updatebyid(@PathVariable Long id,@PathVariable String name){
        addressServices.updatebyid(id,name);
    }

    @DeleteMapping(value = "delete/{id}")
    public void deletebyid(@PathVariable Long id){
        addressServices.deletebyid(id);
    }
}
