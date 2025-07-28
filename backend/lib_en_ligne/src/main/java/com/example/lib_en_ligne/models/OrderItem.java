package com.example.lib_en_ligne.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Chaque article appartient à une commande
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    // Chaque article réfère à un livre
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    private Integer quantity;

    private Double price; // prix à l'achat (peut différer du prix du livre)

    // Getters / Setters
}