package com.senai.atividade.view;

import com.senai.atividade.controller.ControladorCliente;
import com.senai.atividade.controller.ControladorProduto;
import com.senai.atividade.controller.ControladorVenda;
import com.senai.atividade.model.Cliente;
import com.senai.atividade.model.Produto;
import com.senai.atividade.model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Endpoint {

    public ControladorProduto cp = new ControladorProduto();
    public ControladorCliente cc = new ControladorCliente();

    public ControladorVenda cv = new ControladorVenda();

    //produtos
    @GetMapping("/produtos")
    public List<Produto> getInformationsProdutos() {
        return cp.listarProdutos();
    }

    @PostMapping("/produtos")
    public String postInformationsProdutos(@RequestBody Produto produto) {
        cp.postarProdutos(produto);
        return "Sucesso ao Cadastrar!";
    }

    @PutMapping("/produtos")
    public String putInformationsProdutos(@RequestBody Produto produto) {
        if (cp.atualizarProduto(produto)) {
            return "Sucesso ao atualizar produto!";
        } else {
            return "Falha ao atualizar produto...";
        }
    }

    @DeleteMapping("/produtos/{id}")
    public String deleteInformationsProduto(@RequestParam int id) {
        if (cp.deletarProduto(id)) {
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }

    //clientes
    @GetMapping("/clientes")
    public List<Cliente> getInformationsClientes() {
        return cc.listarClientes();
    }

    @PostMapping("/clientes")
    public String postInformationsClientes(@RequestBody Cliente cliente) {
        cc.postarCliente(cliente);
        return "Sucesso ao cadastrar";
    }

    @PutMapping("/clientes")
    public String putInformationsClientes(@RequestBody Cliente cliente){
        if(cc.atualizarCliente(cliente)){
            return "Sucesso ao atualizar o cliente!";
        } else {
            return "Falha ao atualizar o cliente...";
        }
    }

    @DeleteMapping("/clientes/{id}")
    public String deleteInformationsCliente(@RequestParam int id){
        if(cc.deletarCliente(id)){
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }

    //vendas
    @GetMapping("/vendas")
    public List<Venda> getInformationsVendas(){
        return cv.listarVendas();
    }

    @PostMapping("/vendas")
    public String postInformationsVendas(@RequestBody Venda venda){
        cv.postarVenda(venda);
        return "Sucesso ao cadastrar";
    }

    @PutMapping("/vendas")
    public String putInformationsVendas(@RequestBody Venda venda){
        if(cv.atualizarVenda(venda)){
            return "Sucesso ao atualizar a venda!";
        } else {
            return "Falha ao atualizar a venda...";
        }
    }

    @DeleteMapping("/vendas/{id}")
    public String deleteInformationsVendas(@RequestParam int id){
        if(cv.deletarVenda(id)){
            return "Deletado com sucesso!";
        } else {
            return "Falha ao deletar...";
        }
    }
}
