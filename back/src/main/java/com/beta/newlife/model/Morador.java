package com.beta.newlife.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "moradores")
@Entity
public class Morador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_morador")
    private Long id;
    @Column(name = "apartamento")
    private Long apartamento;
    @Column(name = "nome")
    private String nome;
    @Column(name = "rg")
    private String rg;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "telefone1")
    private String telefone1;
    @Column(name = "telefone2")
    private String telefone2;
    @Column(name = "email")
    private String email;
    @Column(name = "contato_emergencia")
    private String contatoEmergencia;
    @Column(name = "ce_telefone")
    private String ceTelefone;
    @Column(name = "observacao")
    private String observacao;

    public Morador() {

    }

    public Morador(Long id, Long apartamento, String nome, String rg, String cpf, String telefone1, String telefone2,
            String email, String contatoEmergencia, String ceTelefone, String observacao) {
        this.id = id;
        this.apartamento = apartamento;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
        this.contatoEmergencia = contatoEmergencia;
        this.ceTelefone = ceTelefone;
        this.observacao = observacao;
    }

    public Morador(Long apartamento, String nome, String rg, String cpf, String telefone1, String telefone2,
            String email, String contatoEmergencia, String ceTelefone, String observacao) {
        this.apartamento = apartamento;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
        this.contatoEmergencia = contatoEmergencia;
        this.ceTelefone = ceTelefone;
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apartamento == null) ? 0 : apartamento.hashCode());
        result = prime * result + ((ceTelefone == null) ? 0 : ceTelefone.hashCode());
        result = prime * result + ((contatoEmergencia == null) ? 0 : contatoEmergencia.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
        result = prime * result + ((rg == null) ? 0 : rg.hashCode());
        result = prime * result + ((telefone1 == null) ? 0 : telefone1.hashCode());
        result = prime * result + ((telefone2 == null) ? 0 : telefone2.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Morador other = (Morador) obj;
        if (apartamento == null) {
            if (other.apartamento != null)
                return false;
        } else if (!apartamento.equals(other.apartamento))
            return false;
        if (ceTelefone == null) {
            if (other.ceTelefone != null)
                return false;
        } else if (!ceTelefone.equals(other.ceTelefone))
            return false;
        if (contatoEmergencia == null) {
            if (other.contatoEmergencia != null)
                return false;
        } else if (!contatoEmergencia.equals(other.contatoEmergencia))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (observacao == null) {
            if (other.observacao != null)
                return false;
        } else if (!observacao.equals(other.observacao))
            return false;
        if (rg == null) {
            if (other.rg != null)
                return false;
        } else if (!rg.equals(other.rg))
            return false;
        if (telefone1 == null) {
            if (other.telefone1 != null)
                return false;
        } else if (!telefone1.equals(other.telefone1))
            return false;
        if (telefone2 == null) {
            if (other.telefone2 != null)
                return false;
        } else if (!telefone2.equals(other.telefone2))
            return false;
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
}

