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
 * @author jose.rsneto10
 */
public class DaoProduto implements DaoRepositorio<Produtos> {

    public static List<Produtos> LISTA_DE_PRODUTOS = new ArrayList<>();

    @Override
    public List<Produtos> getAll() {
        return LISTA_DE_PRODUTOS;
    }

    @Override
    public void inserir(Produtos entidade) {
       
         LISTA_DE_PRODUTOS.add(entidade);
        
    }

    @Override
    public void att(Produtos entidade) {
  
    }

    @Override
    public void deletar(Produtos entidade) {
       LISTA_DE_PRODUTOS.remove(entidade);
    }

}
