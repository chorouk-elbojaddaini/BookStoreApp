package com.springbookstore.springangapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String author;
    Long price;
    String description;
    String title;
    @Lob
    byte[] coverImage;
    String category;
    String language;

    @OneToMany(mappedBy = "book")
    private List<Purchase> purchases;


}