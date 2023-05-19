package com.mapping.mapping.practice.controller;

import com.mapping.mapping.practice.model.Book;
import com.mapping.mapping.practice.repository.IBookRepository;
import com.mapping.mapping.practice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookRepository;
    @GetMapping(value = "/home")
    public String home(){
        return "this is home..........";
    }

    @GetMapping
    public Iterable<Book> getall(){
        return bookRepository.getall();
    }
    @PostMapping("post")
    public String addbook(@RequestBody Book book){
        bookRepository.addbook(book);
        return "added.......";
    }
    @DeleteMapping("deletebyid/{id}")
    public String deletebyid(@PathVariable Long id){
        bookRepository.deletebyid(id);
        return "deleted.......";
    }

}
