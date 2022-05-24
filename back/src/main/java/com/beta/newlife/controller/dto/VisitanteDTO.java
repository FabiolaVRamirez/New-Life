package com.beta.newlife.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.beta.newlife.model.Visitante;

public class VisitanteDTO {
    private Long apartamento;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone1;
    private String telefone2;
    private String observacao;

    public VisitanteDTO(Visitante visitante) {
        this.apartamento = visitante.getApartamento();
        this.nome = visitante.getNome();
        this.rg = visitante.getRg();
        this.cpf = visitante.getCpf();
        this.telefone1 = visitante.getTelefone1();
        this.telefone2 = visitante.getTelefone2();
        this.observacao = visitante.getObservacao();
    }

    public Long getApartamento() {
        return apartamento;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public String getObservacao() {
        return observacao;
    }

    public static List<VisitanteDTO> converter(List<Visitante>visitantes) {
        return visitantes.stream().map(VisitanteDTO::new).collect(Collectors.toList());
    }
}
