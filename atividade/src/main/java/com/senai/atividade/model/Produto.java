package com.senai.atividade.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Produto {
    private Integer idProduto;
    private String nome;
    private Double preco;
    private Integer quantidade;

}
