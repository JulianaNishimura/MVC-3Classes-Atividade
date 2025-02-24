package com.senai.atividade.view;

import com.senai.atividade.controller.ControladorProduto;
import com.senai.atividade.model.Produto;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoEndpoint {

    ControladorProduto cp = new ControladorProduto();

    //produtos
    @GetMapping
    public List<Produto> getInformationsProdutos() {
        return cp.listarProdutos();
    }

    @PostMapping
    public String postInformationsProdutos(@RequestBody Produto produto) {
        cp.postarProdutos(produto);
        return "Sucesso ao Cadastrar!";
    }

    @PutMapping
    public String putInformationsProdutos(@RequestBody Produto produto) {
        if (cp.atualizarProduto(produto)) {
            return "Sucesso ao atualizar produto!";
        } else {
            return "Falha ao atualizar produto...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsProduto(@RequestParam int id) {
        if (cp.deletarProduto(id)) {
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }
}
