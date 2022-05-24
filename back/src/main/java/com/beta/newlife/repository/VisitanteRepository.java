package com.beta.newlife.repository;

import java.util.List;

import com.beta.newlife.model.Visitante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitanteRepository extends JpaRepository<Visitante, String> {

    List<Visitante> findByApartamento(Long apartamento);


}
