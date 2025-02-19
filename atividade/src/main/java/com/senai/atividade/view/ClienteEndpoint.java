package com.senai.atividade.view;

import com.senai.atividade.controller.ControladorCliente;
import com.senai.atividade.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteEndpoint {

    public ControladorCliente cc = new ControladorCliente();
    @GetMapping
    public List<Cliente> getInformationsClientes() {
        return cc.listarClientes();
    }

    @PostMapping
    public String postInformationsClientes(@RequestBody Cliente cliente) {
        cc.postarCliente(cliente);
        return "Sucesso ao cadastrar";
    }

    @PutMapping
    public String putInformationsClientes(@RequestBody Cliente cliente){
        if(cc.atualizarCliente(cliente)){
            return "Sucesso ao atualizar o cliente!";
        } else {
            return "Falha ao atualizar o cliente...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsCliente(@RequestParam int id){
        if(cc.deletarCliente(id)){
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }
}
