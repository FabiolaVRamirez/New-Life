package com.beta.newlife.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import com.beta.newlife.controller.dto.FuncionarioDTO;
import com.beta.newlife.controller.form.FuncionarioForm;
import com.beta.newlife.model.Funcionario;
import com.beta.newlife.repository.FuncionarioRepository;

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
@RequestMapping("/api/funcionarios")
public class FuncionariosController {
    
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    @ResponseBody
    public List<FuncionarioDTO> listar(Long apartamento) {
        List<Funcionario> funcionarios = funcionarioRepository.findByApartamento(apartamento);
        return FuncionarioDTO.converter(funcionarios);
    }

    @PostMapping
    public ResponseEntity<FuncionarioDTO> cadastrar(@RequestBody @Valid FuncionarioForm form, UriComponentsBuilder uriBuilder) {
        Funcionario funcionario = form.converter();
        funcionarioRepository.save(funcionario);

        URI uri = uriBuilder.path("/api/funcionarios/{id}").buildAndExpand(funcionario.getCpf()).toUri();
        return ResponseEntity.created(uri).body(new FuncionarioDTO(funcionario));
    }

}

