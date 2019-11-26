package br.com.senac.pi.controllers;

import br.com.senac.pi.model.Dao.DaoCliente;
import br.com.senac.pi.model.entidades.Cliente;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class ControllerTabelaCliente implements FactoryTabela<Cliente>{
     
    private DefaultTableModel model;
     private final DaoCliente dao = new DaoCliente();
     private List<Cliente> listaDeCliente;
     
    public ControllerTabelaCliente(JTable tabela) throws SQLException{
        this.convertModelTabela(tabela);
        listaDeCliente = dao.getAll();
    }

    @Override
    public void convertModelTabela(JTable tabela) {
       this.model = (DefaultTableModel) tabela.getModel();
    }

    
    @Override
    public void atualizaTabela(List<Cliente> entidade) {
        new Thread(() -> {
            
            
            model.setNumRows(0);
            entidade.forEach(p -> {
            model.addRow(
                    new Object[]{
                        p.getNome(),
                        p.getCpf(),
                        p.getDataDeNascimento(),
                        p.getTell(),
                        p.getSexo(),
                        p.getEstadoCivil(),
                        p.getEmail(),
                        p.getCep()+" - "+p.getBairro()
                    });
        });
         }).start();
    }

    @Override
    public void inserirEntidadeTeste(List<Cliente> entidade) {
        new Thread(() -> {
            if (entidade.isEmpty()) {
            Cliente testeUsuario = new Cliente();
            testeUsuario.setNome("josé");
            testeUsuario.setCpf("33333333333");
            entidade.add(testeUsuario);
        }
        atualizaTabela(entidade);
        }).start(); 
    }

    @Override
    public void retornaItemPesquisado(Cliente entidade) {
          model.setNumRows(0);
             model.addRow(
                     new Object[]{
                         entidade.getNome(),
                         entidade.getCpf()
                     });
    }

    @Override
    public void buscaEntidades() throws SQLException {
        if(!listaDeCliente.isEmpty()){
            atualizaListaDeClientes();
        }
    }

    @Override
    public Cliente buscaEntidadeClicada(int index) throws SQLException {
        return listaDeCliente.get(index);
    }

    @Override
    public void apagaEntidade(int id) throws SQLException {
        dao.deletar(id);
        atualizaListaDeClientes();
        
    }

    private void atualizaListaDeClientes() throws SQLException {
        listaDeCliente.removeAll(listaDeCliente);
        listaDeCliente = dao.getAll();
        atualizaTabela(listaDeCliente);
    }

    @Override
    public void editaEntidade(Cliente entidade) throws SQLException {   
                dao.att(entidade);
                atualizaListaDeClientes(); 
    }

    @Override
    public void inserirEntidade(Cliente entidade) throws SQLException{      
                dao.inserir(entidade);
                atualizaListaDeClientes();    
    }
    
    
    
}
