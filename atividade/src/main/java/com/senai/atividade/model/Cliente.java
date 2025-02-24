package com.senai.atividade.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente {
    private Integer idCliente;
    private String nome;
    private String cpf;

}
