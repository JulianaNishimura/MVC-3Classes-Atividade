package com.senai.atividade.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.ArrayList;


@NoArgsConstructor
@AllArgsConstructor
public class Venda {
    public int idVenda;
    public ZonedDateTime dataVenda;

    public ArrayList<Produto> produtos;
    public Cliente cliente;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public ZonedDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(ZonedDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
