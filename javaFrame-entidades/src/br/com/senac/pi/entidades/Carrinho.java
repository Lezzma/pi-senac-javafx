/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.entidades;

import java.util.List;

/**
 *
 * @author jrneto
 */
public class Carrinho {
    
    private int id;
    private int quantidadeDeItems = 0;
    private double precoTotal = 0;
    private List<Produtos> listaDeProdutos;
    
    
    public Carrinho(List<Produtos> lista) {
        this.listaDeProdutos = lista;
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
    
    public int getQuantidadeDeItems(){
        return quantidadeDeItems;
    }
    
    
}
