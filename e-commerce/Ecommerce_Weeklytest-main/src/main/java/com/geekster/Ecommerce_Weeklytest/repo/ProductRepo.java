package com.geekster.Ecommerce_Weeklytest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.Ecommerce_Weeklytest.model.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    public List<Product> findByCategory(String category);

}
