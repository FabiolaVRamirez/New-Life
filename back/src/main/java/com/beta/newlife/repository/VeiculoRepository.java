package com.beta.newlife.repository;

import java.util.List;

import com.beta.newlife.model.Veiculo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, String> {
    
    List<Veiculo> findByPlaca(String placa);

}
