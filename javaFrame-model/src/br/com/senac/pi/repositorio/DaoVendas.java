/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.repositorio;

import br.com.senac.pi.entidades.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrneto
 */
public class DaoVendas implements DaoRepositorio<Venda>{
    private static List<Venda> listaDeVendas = new ArrayList<>();

  

    @Override
    public List<Venda> getAll() {
        return listaDeVendas;
    }

    @Override
    public void inserir(Venda entidade) {
        listaDeVendas.add(entidade);
    }

    @Override
    public void att(Venda entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Venda entidade) {
        listaDeVendas.remove(entidade);
    }
    
}
