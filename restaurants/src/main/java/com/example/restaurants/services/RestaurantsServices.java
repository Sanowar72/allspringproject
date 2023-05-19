package com.example.restaurants.services;

import java.util.ArrayList;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurants.repository.RestaurantsDao;
import com.example.restaurants.services.models.Restaurants;

// @RestController
// @Component
@Service
public class RestaurantsServices {

    @Autowired
    RestaurantsDao restaurantsDao;

    public ArrayList<Restaurants> alllist() {
        return restaurantsDao.getall();
    }

    public boolean add(Restaurants restaurants) {
        boolean result = restaurantsDao.add(restaurants);
        System.out.println("this is service cls" + restaurants + "this is status of dao add method" + restaurants);
        return result;
    }

    public Restaurants getbyid(String id) {
        ArrayList<Restaurants> getallreslist = restaurantsDao.getall();
        for (Restaurants restaurants : getallreslist) {
            if (restaurants.getId().equals(id))
                return restaurants;

        }
        return null;
    }

    public String deletebyid(String id) {
        return restaurantsDao.deletebyid(id);
    }

    public Restaurants update(String id, String specialization) {
        return restaurantsDao.update(id, specialization);
    }
}
