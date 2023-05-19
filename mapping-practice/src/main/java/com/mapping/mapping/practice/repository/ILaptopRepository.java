package com.mapping.mapping.practice.repository;

import com.mapping.mapping.practice.model.Laptop;
import com.mapping.mapping.practice.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepository extends CrudRepository<Laptop,Long> {
}
