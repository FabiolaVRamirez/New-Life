package com.beta.newlife.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.beta.newlife.model.Morador;

public class MoradorDTO {
    private Long apartamento;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone1;
    private String telefone2;
    private String email;
    private String contatoEmergencia;
    private String ceTelefone;
    private String observacao;

    public MoradorDTO(Morador morador) {
        this.apartamento = morador.getApartamento();
        this.nome = morador.getNome();
        this.rg = morador.getRg();
        this.cpf = morador.getCpf();
        this.telefone1 = morador.getTelefone1();
        this.telefone2 = morador.getTelefone2();
        this.email = morador.getEmail();
        this.contatoEmergencia = morador.getContatoEmergencia();
        this.ceTelefone = morador.getCeTelefone();
        this.observacao = morador.getObservacao();
    }

    public String getCpf() {
        return cpf;
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

    public String getTelefone1() {
        return telefone1;
    }
 
    public String getTelefone2() {
        return telefone2;
    }
 
    public String getEmail() {
        return email;
    }

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public String getCeTelefone() {
        return ceTelefone;
    }
 
    public String getObservacao() {
        return observacao;
    }

    public static List<MoradorDTO> converter(List<Morador>moradores) {
        return moradores.stream().map(MoradorDTO::new).collect(Collectors.toList());
    }
}
