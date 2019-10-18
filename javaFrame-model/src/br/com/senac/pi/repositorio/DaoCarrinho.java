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
 * @author jrneto
 */
public class DaoCarrinho implements DaoRepositorio<Produtos>{
    private static List<Produtos> carrinhoDeCompras = new ArrayList<>();
    
    @Override
    public List<Produtos> getAll() {
        return carrinhoDeCompras;
    }

    @Override
    public void inserir(Produtos entidade) {
        carrinhoDeCompras.add(entidade);
    }

    @Override
    public void att(Produtos entidade) {
        
    }

    @Override
    public void deletar(Produtos entidade) {
       carrinhoDeCompras.remove(entidade);
    }
}
