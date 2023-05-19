package com.geekster.Ecommerce_Weeklytest.service;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.reflect.IReflectionWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com .geekster.Ecommerce_Weeklytest.model.Product;
import com.geekster.Ecommerce_Weeklytest.repo.ProductRepo;


@Service
public class ProductService {

    @Autowired
    private ProductRepo ProductRepo;

    public List<Product> getAllProduct(String category) {
        List<Product> products;
        if(category!=null) {
            products=new ArrayList<>();
            products.addAll(ProductRepo.findByCategory(category));
        }
        else {
            products=ProductRepo.findAll();
        }
        return products;
    }

    public ResponseEntity<String> deleteById(Integer productId) {
        try {
            if(productId!=null) {
                ProductRepo.deleteById(productId);
                return new ResponseEntity<>("Delete Product ", HttpStatus.ACCEPTED);
            }
            else {
                return new ResponseEntity<>("Please enter Id ", HttpStatus.ACCEPTED);
            }

        }
        catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.NOT_FOUND);
        }


    }

}
