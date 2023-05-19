package com.mapping.mapping.practice.repository;

import com.mapping.mapping.practice.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends CrudRepository<Book,Long> {


}
