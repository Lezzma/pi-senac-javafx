/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.repositorio;

import br.com.senac.pi.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrneto
 */
public class DaoCliente implements DaoRepositorio<Cliente>{
    private static List<Cliente> listaDeCliente = new ArrayList<>();
    
    @Override
    public List<Cliente> getAll() {
        return listaDeCliente;
    }

    @Override
    public void inserir(Cliente entidade) {
        listaDeCliente.add(entidade);
    }

    @Override
    public void att(Cliente entidade) {
      
    }

    @Override
    public void deletar(Cliente entidade) {
        listaDeCliente.remove(entidade);
    }
    
}
