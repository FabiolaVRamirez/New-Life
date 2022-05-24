/*package com.beta.newlife.controller;

import java.util.List;

import com.beta.newlife.controller.dto.ConsultaDTO;
import com.beta.newlife.controller.dto.MoradorDTO;
import com.beta.newlife.model.Morador;
import com.beta.newlife.model.Veiculo;
import com.beta.newlife.repository.MoradorRepository;
import com.beta.newlife.repository.VeiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consulta")
public class ConsultaController {

    @Autowired
    private MoradorRepository moradorRepository;
    @Autowired
    private VeiculoRepository veiculoRepository;
    
    @GetMapping
    @ResponseBody
    public List<ConsultaDTO> listar(String placa, String nome, Long apartamento) {
        List<Veiculo> veiculos = veiculoRepository.findByPlaca(placa);
        List<Morador> moradores = moradorRepository.findByNome(nome);
        return ?;
    }

}*/
