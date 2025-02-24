package com.senai.atividade.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.ZonedDateTime;
import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Venda {
    private Integer idVenda;
    private ZonedDateTime dataVenda;

    private ArrayList<Produto> produtos;
    private Cliente cliente;

}
