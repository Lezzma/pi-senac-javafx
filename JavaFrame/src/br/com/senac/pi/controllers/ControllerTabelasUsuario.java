package br.com.senac.pi.controllers;

import br.com.senac.pi.model.entidades.Usuario;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerTabelasUsuario implements FactoryTabela<Usuario> {
    DefaultTableModel model;
    
    public ControllerTabelasUsuario(JTable tabela){
        this.convertModelTabela(tabela);
    }

    @Override
    public void convertModelTabela(JTable tabela) {
       this.model = (DefaultTableModel) tabela.getModel();
    }
    
    @Override
    public void atualizaTabela(List<Usuario> entidade) {
        new Thread(() -> {
            model.setNumRows(0);
            entidade.forEach(p -> {
            model.addRow(
                    new Object[]{
                        p.getNome(),
                        p.getEmail(),
                        p.getRg(),
                        p.getCpf(),
                        p.getSetor()
                    });
        });
         }).start();
    }

    @Override
    public void inserirEntidadeTeste(List<Usuario> entidade) {
        new Thread(() -> {
            if (entidade.isEmpty()) {
            Usuario testeUsuario = new Usuario();
            testeUsuario.setNome("josé");
            testeUsuario.setRg("502222227");
            testeUsuario.setCpf("33333333333");
            testeUsuario.setEmail("ppp@hotmail.com");
            testeUsuario.setSenha("81776279");
            entidade.add(testeUsuario);
        }
        atualizaTabela(entidade);
        }).start();
        
    }

    @Override
    public void retornaItemPesquisado(Usuario entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscaEntidades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario buscaEntidadeClicada(int index) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagaEntidade(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void editaEntidade(Usuario entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserirEntidade(Usuario entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
