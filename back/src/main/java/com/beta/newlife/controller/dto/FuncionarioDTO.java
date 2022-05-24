package com.beta.newlife.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.beta.newlife.model.Funcionario;

public class FuncionarioDTO {
    private Long apartamento;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone1;
    private String telefone2;
    private String observacao;

    public FuncionarioDTO(Funcionario funcionario) {
        this.apartamento = funcionario.getApartamento();
        this.nome = funcionario.getNome();
        this.rg = funcionario.getRg();
        this.cpf = funcionario.getCpf();
        this.telefone1 = funcionario.getTelefone1();
        this.telefone2 = funcionario.getTelefone2();
        this.observacao = funcionario.getObservacao();
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

    public static List<FuncionarioDTO> converter(List<Funcionario>funcionarios) {
        return funcionarios.stream().map(FuncionarioDTO::new).collect(Collectors.toList());
    }
}
