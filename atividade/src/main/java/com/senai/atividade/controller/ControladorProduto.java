package com.senai.atividade.controller;

import com.senai.atividade.database.BancoProduto;
import com.senai.atividade.model.Produto;
import org.springframework.stereotype.Service;
import java.util.List;

public class ControladorProduto {
    BancoProduto banco = BancoProduto.getInstance();

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
