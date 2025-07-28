package com.example.lib_en_ligne.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;

    @Column(nullable=false)
    private String author;

    @Column(nullable=false)
    private Double price;

    @Column(length=2000)
    private String description;

    private String imageUrl;

    private Integer stock;

    // Getters / Setters
    
    // Constructeurs, equals, hashCode, toString
}
