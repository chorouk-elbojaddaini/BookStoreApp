package com.springbookstore.springangapp.service;

import com.springbookstore.springangapp.entity.Book;
import com.springbookstore.springangapp.error.BookNotFoundException;

import java.util.List;

public interface BookService {
    List<Book> getBooks();


    Book getBooksById(Long id) throws BookNotFoundException;

    List<Book> searchByTitleOrAuthor(String term) throws BookNotFoundException;
}
