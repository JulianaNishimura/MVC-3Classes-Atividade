package com.senai.atividade.controller;

import com.senai.atividade.database.BancoCliente;
import com.senai.atividade.model.Cliente;
import org.springframework.stereotype.Service;
import java.util.List;

public class ControladorCliente {
    BancoCliente banco = BancoCliente.getInstance();

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
