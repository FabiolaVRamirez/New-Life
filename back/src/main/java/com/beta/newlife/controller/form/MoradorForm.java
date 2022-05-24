package com.beta.newlife.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.beta.newlife.model.Morador;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

public class MoradorForm {

    @NotEmpty @NotNull
    private Long apartamento;
    @NotEmpty @NotNull
    private String nome;
    @Length(min = 9, max = 9) @NotEmpty @NotNull
    private String rg;
    @CPF @NotEmpty @NotNull
    private String cpf;
    @Length(min = 11, max = 11) @NotEmpty @NotNull
    private String telefone1;
    @Length(min = 11, max = 11)
    private String telefone2;
    @Email @NotNull @NotEmpty
    private String email;
    @NotEmpty @NotNull
    private String contatoEmergencia;
    @Length(min = 11, max = 11) @NotEmpty @NotNull
    private String ceTelefone;
    private String observacao;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Long getApartamento() {
        return apartamento;
    }

    public void setApartamento(Long apartamento) {
        this.apartamento = apartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public void setContatoEmergencia(String contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }

    public String getCeTelefone() {
        return ceTelefone;
    }

    public void setCeTelefone(String ceTelefone) {
        this.ceTelefone = ceTelefone;
    }

    public String getObservacao() {
        return observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Morador converter() {
        return new Morador(apartamento, nome, rg, cpf, telefone1, telefone2, email, contatoEmergencia, ceTelefone, observacao);
    }
}
