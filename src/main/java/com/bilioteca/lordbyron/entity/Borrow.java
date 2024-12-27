package com.bilioteca.lordbyron.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Borrow")
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBorrow;

    @ManyToOne
    @JoinColumn(name = "users", nullable = false)
    private Users users;

    @ManyToOne
    @JoinColumn(name = "id_book", nullable = false)
    private Book book;

    @Temporal(TemporalType.DATE)
    private Date dateBorrow;

    @Temporal(TemporalType.DATE)
    private Date dateDevolution;

    @Enumerated(EnumType.STRING)
    private StateBorrow state;

    // Getters y Setters
    // Constructor vacío y parametrizado
}