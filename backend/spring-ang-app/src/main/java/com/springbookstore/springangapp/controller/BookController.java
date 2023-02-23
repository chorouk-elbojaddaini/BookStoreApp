package com.springbookstore.springangapp.controller;

import com.springbookstore.springangapp.entity.Book;
import com.springbookstore.springangapp.error.BookNotFoundException;
import com.springbookstore.springangapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }


    @GetMapping("/books/{id}")
    public Book getBooksById(@PathVariable("id") Long id)  throws BookNotFoundException {
        return bookService.getBooksById(id);
    }
    @GetMapping("/search")
    public List<Book> searchByTitleOrAuthor(@RequestParam("term") String term) throws BookNotFoundException {
        return bookService.searchByTitleOrAuthor(term);

    }

}
