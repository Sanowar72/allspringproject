package com.geekster.Ecommerce_Weeklytest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.Ecommerce_Weeklytest.model.Product;
import com.geekster.Ecommerce_Weeklytest.service.ProductService;
import com.geekster.Ecommerce_Weeklytest.service.UserService;

import jakarta.annotation.Nullable;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct(@Nullable @RequestParam String category){
        return productService.getAllProduct(category);
    }

    @DeleteMapping("/deleteById/{productId}")
    public String deleteProduct(@PathVariable Integer productId){
        productService.deleteById(productId);
        return "Successfully deleted";
    }

}
