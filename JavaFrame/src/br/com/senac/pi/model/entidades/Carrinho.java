/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.model.entidades;

import java.util.List;

/**
 *
 * @author jrneto
 */
public class Carrinho {
    
    private int id;
    private int quantidadeDeItems = 0;
    private static List<Produtos> listaDeProdutos;
    
    
    public Carrinho(List<Produtos> lista) {
        this.listaDeProdutos = lista;
    }
    public int getId(){
        return id;
    }
    public void adicionaProduto(Produtos produto){
        listaDeProdutos.add(produto); 
    }
    
    public void removeProduto(Produtos produto){
        listaDeProdutos.remove(produto);
    }
    
    public void setQuantidadeDeItems(int quantidade){
        this.quantidadeDeItems += quantidade;
    }
    public List<Produtos> getAll(){
        return listaDeProdutos;
    }
    
    public int getQuantidadeDeItems(){
        return quantidadeDeItems;
    }

    
   
    
    
}
