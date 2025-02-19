package com.senai.atividade.database;

import com.senai.atividade.model.Cliente;
import com.senai.atividade.model.Produto;
import com.senai.atividade.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoDados {
    private List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Venda> vendas;

    public BancoDados(){
        this.produtos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    //Produto
    public void insertProduto(Produto p){
        produtos.add(p);
    }

    public Produto findOneProduto(int id){
        for (Produto p : produtos){
            if (p.getIdProduto() == id){
                return p;
            }
        }
        return null;
    }

    public List<Produto> findAllProduto() {
        return new ArrayList<>(produtos);
    }

    public boolean updateProduto(Produto p){
        for(int i = 0; i < produtos.size();i++){
            if(produtos.get(i).getIdProduto() == p.getIdProduto()){
                produtos.set(i,p);
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduto(int id){
        return produtos.removeIf(p -> p.getIdProduto() == id);
    }

    //Cliente
    public void insertCliente(Cliente c){
        clientes.add(c);
    }

    public Cliente findOneCliente(int id){
        for (Cliente c : clientes){
            if (c.getIdCliente() == id){
                return c;
            }
        }
        return null;
    }

    public List<Cliente> findAllCliente() {
        return new ArrayList<>(clientes);
    }

    public boolean updateCliente(Cliente c){
        for(int i = 0; i < clientes.size();i++){
            if(clientes.get(i).getIdCliente() == c.getIdCliente()){
                clientes.set(i,c);
                return true;
            }
        }
        return false;
    }

    public boolean deleteCliente(int id){
        return clientes.removeIf(c -> c.getIdCliente() == id);
    }


    //Venda
    public void insertVenda(Venda v){
        vendas.add(v);
    }

    public Venda findOneVenda(int id){
        for (Venda v : vendas){
            if (v.getIdVenda() == id){
                return v;
            }
        }
        return null;
    }

    public List<Venda> findAllVenda() {
        return new ArrayList<>(vendas);
    }

    public boolean updateVenda(Venda v){
        for(int i = 0; i < vendas.size();i++){
            if(vendas.get(i).getIdVenda() == v.getIdVenda()){
                vendas.set(i,v);
                return true;
            }
        }
        return false;
    }

    public boolean deleteVenda(int id){
        return vendas.removeIf(v -> v.getIdVenda() == id);
    }
}
