package com.example.MappingImplementation.repository;

import com.example.MappingImplementation.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepository extends JpaRepository<Laptop,Long> {
}
