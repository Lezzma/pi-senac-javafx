/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import br.com.senac.pi.entidades.Cliente;
import br.com.senac.pi.repositorio.DaoCliente;
import br.com.senac.repositorios.RepositorioroTabelaCliente;
import java.util.List;

/**
 *
 * @author jrneto
 */
public class ClienteControler {
    private RepositorioroTabelaCliente repositorioTabelaCliente;
    private DaoCliente dao = new DaoCliente();
 

    public ClienteControler(RepositorioroTabelaCliente repositorioTabelaCliente) {
        this.repositorioTabelaCliente = repositorioTabelaCliente;
    }

    public void atualizaTabelaCliente(){
        repositorioTabelaCliente.atualizaTabela(dao.getAll());
    }
    
    public List<Cliente> pegarTodosClientes(){
        return dao.getAll();
    }
    //inseri um novo usuario na tabela
    //atualiza a tabela
    public void criarNovoCliente(Cliente cliente){
        dao.inserir(cliente);
        repositorioTabelaCliente.atualizaTabela(dao.getAll());
    }
    
    public void removeCleinte(Cliente cliente){
        dao.deletar(cliente);
        repositorioTabelaCliente.atualizaTabela(dao.getAll());
    }
    
    //cria um cliente teste 
    public void criaClienteTeste(){
        if(dao.getAll().isEmpty()){
            Cliente clieteTeste = new Cliente("Jabulani", "33333333333");
            dao.inserir(clieteTeste);
            
        }
    }
    
    
    
}
