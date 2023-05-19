package com.geekster.Ecommerce_Weeklytest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productId")
    private Integer id;
    @Column(name="productName")
    private String name;
    @Column(name="productPrice")
    private Integer price;
    @Column(name="description")
    private String description;
    @Column(name="category")
    private String category;
    @Column(name="brand")
    private String brand;
}
