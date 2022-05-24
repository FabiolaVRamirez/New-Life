package com.beta.newlife.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import com.beta.newlife.controller.dto.VeiculoDTO;
import com.beta.newlife.controller.form.VeiculoForm;
import com.beta.newlife.model.Veiculo;
import com.beta.newlife.repository.VeiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculosController {
    
    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping
    @ResponseBody
    public List<VeiculoDTO> listar(String placa) {
        List<Veiculo> veiculos = veiculoRepository.findByPlaca(placa);
        return VeiculoDTO.converter(veiculos);
    }

    @PostMapping
    public ResponseEntity<VeiculoDTO> cadastrar(@RequestBody @Valid VeiculoForm form, UriComponentsBuilder uriBuilder) {
        Veiculo veiculo = form.converter();
        veiculoRepository.save(veiculo);

        URI uri = uriBuilder.path("/api/veiculos/{id}").buildAndExpand(veiculo.getPlaca()).toUri();
        return ResponseEntity.created(uri).body(new VeiculoDTO(veiculo));
    }

}
