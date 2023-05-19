package com.mapping.mapping.practice.service;

import com.mapping.mapping.practice.model.Book;
import com.mapping.mapping.practice.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    IBookRepository bookRepository;
    public Iterable<Book> getall() {
        return bookRepository.findAll();
    }

    public void addbook(Book book) {
        bookRepository.save(book);
    }

    public void deletebyid(Long id) {
        bookRepository.deleteById(id);
    }
}
