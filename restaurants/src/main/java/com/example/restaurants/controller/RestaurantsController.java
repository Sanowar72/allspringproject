package com.example.restaurants.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurants.services.RestaurantsServices;
import com.example.restaurants.services.models.Restaurants;

import jakarta.validation.Valid;

@RestController
public class RestaurantsController {

    @GetMapping(value = "/home")
    public static String getData() {
        return "Hello World this is testing spring";
    }

    @Autowired
    RestaurantsServices restaurantsServices;

    @GetMapping(value = "/alllist")
    public ArrayList<Restaurants> getall() {
        return restaurantsServices.alllist();
    }

    @PostMapping(value = "/add")
    public String addrestaurant(@Valid @RequestBody Restaurants restaurants) {
        System.out.println(restaurants);
        boolean result = restaurantsServices.add(restaurants);
        if (result) {
            return "Successfully added";
        }
        return "restaurant not added";
    }

    @GetMapping(value = "/byid/{id}")
    public Restaurants getbyid(@PathVariable String id) {
        System.out.println("this is id" + id);
        return restaurantsServices.getbyid(id);
    }

    @DeleteMapping(value = "/deletebyid/{id}")
    public String deletebyid(@PathVariable String id) {
        return restaurantsServices.deletebyid(id);
    }

    @PutMapping(value = "/update/{id}/{specialization}")
    public Restaurants update(@PathVariable String id, @PathVariable String specialization) {
        System.out.println(specialization);
        return restaurantsServices.update(id, specialization);
    }

}
