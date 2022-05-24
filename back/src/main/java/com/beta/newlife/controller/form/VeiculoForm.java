package com.beta.newlife.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.beta.newlife.model.Veiculo;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.ReadOnlyProperty;

public class VeiculoForm {
    @ReadOnlyProperty
    private Long apartamento;
    @Length(min = 7, max = 7) @NotEmpty @NotNull
    private String placa;
    @NotEmpty @NotNull
    private String marca;
    @NotEmpty @NotNull
    private String modelo;
    @NotEmpty @NotNull
    private String cor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Veiculo converter() {
        return new Veiculo(apartamento, placa, marca, modelo, cor);
    }
}
