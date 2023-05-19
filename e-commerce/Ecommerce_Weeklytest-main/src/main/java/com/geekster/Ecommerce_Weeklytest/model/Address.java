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
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="addressId")
    private Integer id;

    @Column(name="name")
    private	String name;

    @Column(name="landmark")
    private	String landmark;

    @Column(name="phoneNumber")
    private String	phoneNumber;

    @Column(name="zipCode")
    private String	zipcode;

    @Column(name="state")
    private	String state;

    @JoinColumn(name="user_id")
    @ManyToOne
    private	User user ;// foreign key mapping
}
