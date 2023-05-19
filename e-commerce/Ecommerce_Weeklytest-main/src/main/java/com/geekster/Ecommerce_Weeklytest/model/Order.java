package com.geekster.Ecommerce_Weeklytest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="orderId")
    private Integer id;

    @JoinColumn(name="userId")
    @ManyToOne
    private User user;//integer (foreign key mapping)

    @JoinColumn(name="productId")
    @ManyToOne
    private Product product;//integer(foreign key mapping)

    @JoinColumn(name="addressId")
    @ManyToOne
    private Address address;//integer(foreign key mapping)

    @Column(name="quantity")
    private Integer productQuantity;//integer
}
