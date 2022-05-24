package com.beta.newlife.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.beta.newlife.model.Veiculo;

public class VeiculoDTO {
    private Long apartamento;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;

    public VeiculoDTO(Veiculo veiculo) {
        this.apartamento = veiculo.getApartamento();
        this.placa = veiculo.getPlaca();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
    }

    public Long getApartamento() {
        return apartamento;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public static List<VeiculoDTO> converter(List<Veiculo>veiculos) {
        return veiculos.stream().map(VeiculoDTO::new).collect(Collectors.toList());
    }
}
