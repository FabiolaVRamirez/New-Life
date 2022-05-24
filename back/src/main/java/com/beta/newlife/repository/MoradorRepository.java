package com.beta.newlife.repository;

import java.util.List;

import com.beta.newlife.model.Morador;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository<Morador, String>{

    List<Morador> findByApartamento(Long apartamento);
    
    List<Morador> findByNome(String nome);
    
}
