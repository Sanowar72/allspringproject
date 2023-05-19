package com.mapping.mapping.practice.service;

import com.mapping.mapping.practice.model.Laptop;
import com.mapping.mapping.practice.repository.ILaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServices {
    @Autowired
    ILaptopRepository laptopRepository;
    public Iterable<Laptop> getall() {
        return laptopRepository.findAll();
    }

    public void addlaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    public void deletebyid(Long id) {
        laptopRepository.deleteById(id);
    }
}
