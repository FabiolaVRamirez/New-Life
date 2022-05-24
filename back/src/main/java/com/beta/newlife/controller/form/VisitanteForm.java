package com.beta.newlife.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.beta.newlife.model.Visitante;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.ReadOnlyProperty;

public class VisitanteForm {
        
    @ReadOnlyProperty
    private Long apartamento;
    @CPF @NotEmpty @NotNull
    private String cpf;
    @NotEmpty @NotNull
    private String nome;
    @Length(min = 9, max = 9) @NotEmpty @NotNull
    private String rg;
    @Length(min = 11, max = 11) @NotEmpty @NotNull
    private String telefone1;
    @Length(min = 11, max = 11)
    private String telefone2;
    private String observacao;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Visitante converter() {
        return new Visitante(apartamento, nome, rg, cpf, telefone1, telefone2, observacao);
    }
}
