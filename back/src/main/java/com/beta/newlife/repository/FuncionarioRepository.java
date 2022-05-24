package com.beta.newlife.repository;

import java.util.List;

import com.beta.newlife.model.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {

    List<Funcionario> findByApartamento(Long apartamento);

}
