/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.entidades.Produtos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrneto
 */
public class DaoCarrinho implements DaoRepositorio<Produtos>{
    private static List<Produtos> LISTA_CARRINHO_DE_COMPRAS = new ArrayList<>();
    
    @Override
    public List<Produtos> getAll() {
        return LISTA_CARRINHO_DE_COMPRAS;
    }

    @Override
    public void inserir(Produtos entidade) {
        LISTA_CARRINHO_DE_COMPRAS.add(entidade);
    }

    @Override
    public void att(Produtos entidade) {
        
    }

    @Override
    public void deletar(Produtos entidade) {
       LISTA_CARRINHO_DE_COMPRAS.remove(entidade);
    }
    
    public void limpaCarrinho(){
        LISTA_CARRINHO_DE_COMPRAS.removeAll(LISTA_CARRINHO_DE_COMPRAS);
    }
}
