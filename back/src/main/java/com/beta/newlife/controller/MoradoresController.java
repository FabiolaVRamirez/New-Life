package com.beta.newlife.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import com.beta.newlife.controller.dto.MoradorDTO;
import com.beta.newlife.controller.form.MoradorForm;
import com.beta.newlife.model.Morador;
import com.beta.newlife.repository.MoradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.PathVariable;*/
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/moradores")
public class MoradoresController {
    
    @Autowired
    private MoradorRepository moradorRepository;

    @GetMapping("/nome")
    @ResponseBody
    public List<MoradorDTO> listar1(String nome) {
        List<Morador> moradores = moradorRepository.findByNome(nome);
        return MoradorDTO.converter(moradores);
    }

    @GetMapping("/apartamento")
    @ResponseBody
    public List<MoradorDTO> listar2(Long apartamento) {
        List<Morador> moradores = moradorRepository.findByApartamento(apartamento);
        return MoradorDTO.converter(moradores);
    }

    @PostMapping
    public ResponseEntity<MoradorDTO> cadastrar(@RequestBody @Valid MoradorForm form, UriComponentsBuilder uriBuilder) {
        Morador morador = form.converter();
        moradorRepository.save(morador);

        URI uri = uriBuilder.path("/api/moradores/{id}").buildAndExpand(morador.getCpf()).toUri();
        return ResponseEntity.created(uri).body(new MoradorDTO(morador));
    }

   /*@GetMapping("/{cpf}")
    public MoradorDTO detalhar(@PathVariable String cpf) {
        Morador morador = moradorRepository.getReferenceById(cpf);
        return new MoradorDTO(morador);
    }*/

}
