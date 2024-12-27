package com.bilioteca.lordbyron.repository;

import com.bilioteca.lordbyron.entity.Borrow;
import com.bilioteca.lordbyron.entity.StateBorrow;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface BorrowRepository extends JpaRepository<Borrow, Long> {
    List<Borrow> findByUsuarioId(Long idUsers);
    List<Borrow> findByEstado(StateBorrow state);
}