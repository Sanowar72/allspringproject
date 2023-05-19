package com.mapping.mapping.practice.service;

import com.mapping.mapping.practice.model.Address;
import com.mapping.mapping.practice.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServices {
    @Autowired
    IAddressRepository addressRepository;

    public Iterable<Address> getall() {
        return addressRepository.findAll();
    }

    public void add(Address address) {
        addressRepository.save(address);
    }

    public void deletebyid(Long id) {
        addressRepository.deleteById(id);
    }

    public void updatebyid(Long id, String name) {
        addressRepository.updatefirstnamebyid(id,name);
    }
}
