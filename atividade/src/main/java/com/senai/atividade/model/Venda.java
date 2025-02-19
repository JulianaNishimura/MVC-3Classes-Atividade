package com.senai.atividade.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Venda {
    public int idVenda;
    public ZonedDateTime dataVenda;

    public ArrayList<Produto> produtos;
    public Cliente cliente;
}
