package com.example.restaurants.repository;

import java.util.ArrayList;
import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurants.services.models.Restaurants;

// @RestController
@Component
// @Repository
public class RestaurantsDao {

    ArrayList<Restaurants> restaurantlist = new ArrayList<>();;

    public RestaurantsDao() {
        // restaurantlist = new ArrayList<>();
        restaurantlist.add(new Restaurants("0", "sonu kitchen", "chicken korma"));

    }

    public ArrayList<Restaurants> getall() {
        System.out.println("this got called" + restaurantlist);
        return restaurantlist;
    }

    public boolean add(Restaurants restaurants) {
        System.out.println("this is dao class" + restaurants);
        restaurantlist.add(restaurants);
        return true;
    }

    public Restaurants find(String id) {
        for (Restaurants restaurants : restaurantlist) {
            if (restaurants.getId().equals(id)) {
                return restaurants;
            }
        }
        return null;
    }

    // public ArrayList<Restaurants> getbyid(id){
    // return
    // }
    public String deletebyid(String id) {
        for (Restaurants restaurants : restaurantlist) {
            if (restaurants.getId().equals(id)) {
                restaurantlist.remove(restaurants);
                return "restaurants removed";
            }

        }
        return "restaurants not found";
    }

    public Restaurants update(String id, String specialization) {
        Restaurants restaurants = find(id);
        restaurants.setSpecialization(specialization);
        restaurantlist.remove(restaurants);
        restaurantlist.add(restaurants);
        return restaurants;

    }
}
