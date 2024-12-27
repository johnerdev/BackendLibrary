package com.bilioteca.lordbyron.repository;

import com.bilioteca.lordbyron.entity.Reserve;
import com.bilioteca.lordbyron.entity.StateReserve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {
    List<Reserve> findByUserId(Long idUser);
    List<Reserve> findByState(StateReserve state);
}

