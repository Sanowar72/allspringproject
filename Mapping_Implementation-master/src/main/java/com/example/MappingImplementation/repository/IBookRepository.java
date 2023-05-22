package com.example.MappingImplementation.repository;

import com.example.MappingImplementation.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {
}
