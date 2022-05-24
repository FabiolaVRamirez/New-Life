package com.beta.newlife.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import com.beta.newlife.controller.dto.VisitanteDTO;
import com.beta.newlife.controller.form.VisitanteForm;
import com.beta.newlife.model.Visitante;
import com.beta.newlife.repository.VisitanteRepository;

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
@RequestMapping("/api/visitantes")
public class VisitantesController {
    
    @Autowired
    private VisitanteRepository visitanteRepository;

    @GetMapping
    @ResponseBody
    public List<VisitanteDTO> listar(Long apartamento) {
        List<Visitante> visitantes = visitanteRepository.findByApartamento(apartamento);
        return VisitanteDTO.converter(visitantes);
    }

    @PostMapping
    public ResponseEntity<VisitanteDTO> cadastrar(@RequestBody @Valid VisitanteForm form, UriComponentsBuilder uriBuilder) {
        Visitante visitante = form.converter();
        visitanteRepository.save(visitante);

        URI uri = uriBuilder.path("/api/visitantes/{id}").buildAndExpand(visitante.getCpf()).toUri();
        return ResponseEntity.created(uri).body(new VisitanteDTO(visitante));
    }

}


