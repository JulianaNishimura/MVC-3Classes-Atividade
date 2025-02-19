package com.senai.atividade.controller;

import com.senai.atividade.database.BancoDados;
import com.senai.atividade.model.Produto;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class ControladorProduto {
    private BancoDados banco = new BancoDados();

    public List<Produto> listarProdutos() {
        return banco.findAllProduto();
    }

    public void postarProdutos(Produto produto) {
        banco.insertProduto(produto);
    }

    public boolean atualizarProduto(Produto produto) {
        return banco.updateProduto(produto);
    }

    public boolean deletarProduto(int id) {
        return banco.deleteProduto(id);
    }
}
