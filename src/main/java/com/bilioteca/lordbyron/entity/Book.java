package com.bilioteca.lordbyron.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;
    private String acquisition;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    private String published;
    private String genero;
    private String language;
    private String identifier;
    private Integer year;
    private String city;
    private String edition;
    private String ISBN;
    private String ISSN;
    private String description;
    private String content;
    private String area;
    private Integer pages;
    private String level;
    private String ubication;

    // Getters y Setters
    // Constructor vacío y parametrizado
}
