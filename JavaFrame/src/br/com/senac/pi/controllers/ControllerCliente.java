package br.com.senac.pi.controllers;

import br.com.senac.pi.model.entidades.Cliente;
import br.com.senac.pi.model.entidades.Endereco;
import br.com.senac.pi.model.Dao.DaoCliente;
import java.util.List;
import java.util.Optional;

public class ControllerCliente {

    private final CotrollerTabelaCliente repositorioTabelaCliente;
    private final DaoCliente dao = new DaoCliente();

    public ControllerCliente(CotrollerTabelaCliente repositorioTabelaCliente) {
        this.repositorioTabelaCliente = repositorioTabelaCliente;
    }
    
    public void atualizaTabelaCliente() {
        repositorioTabelaCliente.atualizaTabela(dao.getAll());
    }

    public List<Cliente> pegarTodosClientes() {
        return dao.getAll();
    }

    //inseri um novo usuario na tabela
    //atualiza a tabela
    public void criarNovoCliente(Cliente cliente) {
        dao.inserir(cliente);
        repositorioTabelaCliente.atualizaTabela(dao.getAll());
    }

    public void removeCleinte(Cliente cliente) {
        dao.deletar(cliente.getId());
        repositorioTabelaCliente.atualizaTabela(dao.getAll());
    }

    //cria um cliente teste 
    public void criaClienteTeste() {
        if (dao.getAll().isEmpty()) {
            Cliente clieteTeste = new Cliente(
                    "Jabulani",
                    "33333333333",
                    "05/01/1998",
                    "55555555",
                    "Masculino",
                    "solteiro",
                    "neto.silva101@outlook.com",
                        new Endereco("04849160", "Cocaia", "Manuel pla", "casa 5", "123"));
            dao.inserir(clieteTeste);

        }
    }

    public void pesquisaClienteCpf(String itemPesquisado) {
        if (!itemPesquisado.equals("")) {
            Optional<Cliente> cliente = dao.getAll().stream().filter(cli -> cli.getCpf().equals(itemPesquisado)).findFirst();
            if(cliente.isPresent()){
            repositorioTabelaCliente.retornaItemPesquisado(cliente.get());
            }
            
        }
    }

    public void pesquisaClienteNome(String itemPesquisado) {
        if (!itemPesquisado.equals("")) {
            Optional<Cliente> cliente = dao.getAll().stream().filter(cli -> cli.getNome().equals(itemPesquisado)).findFirst();
            if(cliente.isPresent()){
            repositorioTabelaCliente.retornaItemPesquisado(cliente.get());
            }
            
        }
    }

}
