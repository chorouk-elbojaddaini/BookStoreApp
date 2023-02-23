package com.springbookstore.springangapp.repository;

import com.springbookstore.springangapp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    @Query("SELECT b FROM Book b WHERE b.title LIKE %:term% OR b.author LIKE %:term%")
    public List<Book> findByTitleOrAuthor(@Param("term") String term);
}
