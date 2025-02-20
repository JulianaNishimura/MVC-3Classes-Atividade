package com.senai.atividade.controller;

import com.senai.atividade.database.BancoDados;
import com.senai.atividade.model.Produto;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class ControladorProduto {
    private final BancoDados banco;

    public ControladorProduto(BancoDados banco) {
        this.banco = banco;
    }

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
