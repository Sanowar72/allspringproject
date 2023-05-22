package com.example.MappingImplementation.service;

import com.example.MappingImplementation.model.Book;
import com.example.MappingImplementation.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepository iBookRepository;
    public Book saveBook(Book book) {
        return iBookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return iBookRepository.findAll();
    }
}
