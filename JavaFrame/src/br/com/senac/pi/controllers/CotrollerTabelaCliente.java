package br.com.senac.pi.controllers;

import br.com.senac.pi.model.entidades.Cliente;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CotrollerTabelaCliente implements FactoryTabela<Cliente>{
     DefaultTableModel model;
    
    public CotrollerTabelaCliente(JTable tabela){
        this.convertModelTabela(tabela);
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
                        p.getEndereco().getBairro()+" - Cep:"+p.getEndereco().getCep()
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
    public void buscaEntidades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    
}
