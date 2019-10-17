/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.repositorio;

import br.com.senac.pi.entidades.Produtos;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jose.rsneto10
 */
public class ProdutoRepositorio implements DaoRepositorio<Produtos> {

    public static List<Produtos> listaProdutos = new ArrayList<>();

    @Override
    public List<Produtos> getAll() {
        return listaProdutos;
    }

    @Override
    public void inserir(Produtos entidade) {
       
         listaProdutos.add(entidade);
        
    }

    @Override
    public void att(Produtos entidade) {
        
           
     
         
    }

    @Override
    public void deletar(Produtos entidade) {
       listaProdutos.remove(entidade);
    }

}
