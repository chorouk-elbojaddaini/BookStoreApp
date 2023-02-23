package com.springbookstore.springangapp.service;


import com.springbookstore.springangapp.entity.Book;
import com.springbookstore.springangapp.error.BookNotFoundException;
import com.springbookstore.springangapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();

    }

    @Override
    public Book getBooksById(Long id) throws BookNotFoundException {
        Optional<Book> book = bookRepository.findById(id);
        if(!book.isPresent()){
         throw new BookNotFoundException("book with this id not found");
        }
        return book.get();
    }

    @Override
    public List<Book> searchByTitleOrAuthor(String term) throws BookNotFoundException {
        List<Book> books = bookRepository.findByTitleOrAuthor(term);
        if(books.isEmpty()){
            throw new BookNotFoundException("Search results : 0 found");
        }
        return books;
    }


}
