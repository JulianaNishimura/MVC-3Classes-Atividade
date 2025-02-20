package com.senai.atividade.controller;

import com.senai.atividade.database.BancoDados;
import com.senai.atividade.model.Cliente;
import com.senai.atividade.model.Venda;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class ControladorVenda {
    private final BancoDados banco;

    public ControladorVenda(BancoDados banco) {
        this.banco = banco;
    }

    public List<Venda> listarVendas() {
        return banco.findAllVenda();
    }

    public void postarVenda(Venda venda) {
        banco.insertVenda(venda);
    }

    public boolean atualizarVenda(Venda venda) {
        return banco.updateVenda(venda);
    }

    public boolean deletarVenda(int id) {
        return banco.deleteVenda(id);
    }
}
