package com.senai.atividade.database;

import com.senai.atividade.model.Cliente;
import com.senai.atividade.model.Produto;
import com.senai.atividade.model.Venda;
import java.util.ArrayList;
import java.util.List;

public class BancoVenda {
    private List<Venda> vendas;
    private static BancoVenda instance;
    public static BancoVenda getInstance() {
        if (instance == null) {
            instance = new BancoVenda();
        }
        return instance;
    }

    public BancoVenda() {
        this.vendas = new ArrayList<>();
    }
    public void insertVenda(Venda v) {
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
