package com.mapping.mapping.practice.controller;

import com.mapping.mapping.practice.model.Laptop;
import com.mapping.mapping.practice.service.LaptopServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("laptop")
public class LaptopController {

    @Autowired
    LaptopServices laptopServices;
    @GetMapping
    public Iterable<Laptop> getall(){
        return laptopServices.getall();
    }
    @PostMapping("/addlaptop")
    public String addlaptop(@RequestBody Laptop laptop){
        laptopServices.addlaptop(laptop);
        return "Added.......";
    }
    @DeleteMapping("deletebyid/{id}")
    public String deletebyid(@PathVariable Long id){
        laptopServices.deletebyid(id);
        return "deleted.......";
    }
}
