package com.senai.atividade.controller;

import com.senai.atividade.database.BancoDados;
import com.senai.atividade.model.Cliente;
import com.senai.atividade.model.Produto;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class ControladorCliente {
    private final BancoDados banco;

    public ControladorCliente(BancoDados banco) {
        this.banco = banco;
    }

    public List<Cliente> listarClientes() {
        return banco.findAllCliente();
    }

    public void postarCliente(Cliente cliente) {
        banco.insertCliente(cliente);
    }

    public boolean atualizarCliente(Cliente cliente) {
        return banco.updateCliente(cliente);
    }

    public boolean deletarCliente(int id) {
        return banco.deleteCliente(id);
    }
}
