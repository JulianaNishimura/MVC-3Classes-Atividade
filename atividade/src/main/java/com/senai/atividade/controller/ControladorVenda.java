package com.senai.atividade.controller;

import com.senai.atividade.database.BancoCliente;
import com.senai.atividade.database.BancoProduto;
import com.senai.atividade.database.BancoVenda;
import com.senai.atividade.model.Cliente;
import com.senai.atividade.model.Produto;
import com.senai.atividade.model.Venda;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class ControladorVenda {
    BancoVenda banco = BancoVenda.getInstance();
    BancoCliente bancoDeClientes = BancoCliente.getInstance();
    BancoProduto bancoDeProdutos = BancoProduto.getInstance();

    public List<Venda> listarVendas() {
        return banco.findAllVenda();
    }

    public boolean postarVenda(Venda venda) {

        Cliente clienteEnviado = venda.getCliente();
        List<Produto> produtosEnviados = venda.getProdutos();

        if (bancoDeClientes.findOneCliente(clienteEnviado.getIdCliente()) == null) {
            return false;
        }
        for (Produto p : produtosEnviados) {
            if (bancoDeProdutos.findOneProduto(p.getIdProduto()) == null) {
                return false;
            }
        }

        banco.insertVenda(venda);
        return true;
    }

    public boolean atualizarVenda(Venda venda) {
        return banco.updateVenda(venda);
    }

    public boolean deletarVenda(int id) {
        return banco.deleteVenda(id);
    }
}
