package br.com.senac.pi.controllers;

import br.com.senac.pi.model.Dao.DaoCliente;
import br.com.senac.pi.model.entidades.Cliente;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CotrollerTabelaCliente implements FactoryTabela<Cliente>{
     
    private DefaultTableModel model;
     private DaoCliente dao = new DaoCliente();
     private List<Cliente> listaDeCliente;
     
    public CotrollerTabelaCliente(JTable tabela) throws SQLException{
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
            listaDeCliente.removeAll(listaDeCliente);
            listaDeCliente = dao.getAll();
        }
        atualizaTabela(listaDeCliente);
    }

    @Override
    public Cliente buscaEntidadeClicada(int index) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagaEntidade(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editaEntidade(Cliente entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserirEntidade(Cliente entidade) throws SQLException{
           
                dao.inserir(entidade);
            
    }
    
    
    
}
