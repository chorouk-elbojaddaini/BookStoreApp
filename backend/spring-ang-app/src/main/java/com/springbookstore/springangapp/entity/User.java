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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     Long id_user;
     String firstName;
     String lastName;
     String address;
     String email;
     String phoneNumber;

    @OneToMany(mappedBy = "user")
    private List<Purchase> purchases;
}
