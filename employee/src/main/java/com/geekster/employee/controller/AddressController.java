package com.geekster.employee.controller;

import com.geekster.employee.model.Address;
import com.geekster.employee.service.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    AddressServices addressServices;
    @GetMapping(value = "/home")
    public String home(){
        return "this is home for testing address controller";
    }
    @PostMapping(value = "/address")
    public void addaddress(@RequestBody Address address){
        addressServices.addaddress(address);
    }
    @GetMapping(value = "/all")
    public Iterable<Address> getall(){
        return addressServices.getall();
    }
    @GetMapping(value = "/byid/{id}")
    public Optional<Address> getbyid(@PathVariable Long id){
        return addressServices.getbyid(id);
    }
    @PutMapping(value = "/updatebyid/{id}/{street}")
    public void updatebyid(@PathVariable Long id,@PathVariable String street){
        addressServices.updatebyid(id,street);
    }


    @DeleteMapping(value = "delete/{id}")
    public String deletebyid(@PathVariable Long id){
        return addressServices.deletebyid(id);
    }
}
