package com.example.lib_en_ligne.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import com.example.lib_en_ligne.models.Order; // ✅ Ton entité correcte

@Entity
@Table(name = "users") // évite conflit avec mot réservé SQL "user"
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String username;

    @Column(nullable=false, unique=true)
    private String email;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private String role; // ex: ROLE_USER, ROLE_ADMIN

    // Relation 1 User => 1 Cart
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Cart cart;

    // Relation 1 User => N Orders
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Order> orders;

    // Getters / Setters (omise ici pour la lisibilité)
    
    // Constructeurs, equals, hashCode, toString (à ajouter)
}
