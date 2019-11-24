package br.com.senac.pi.controllers;

import br.com.senac.pi.model.entidades.Produtos;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerTabelaCarrinho implements FactoryTabela<Produtos> {

    DefaultTableModel model;

    public ControllerTabelaCarrinho(JTable tabela) {
        this.convertModelTabela(tabela);
    }

    @Override
    public void convertModelTabela(JTable tabela) {
        this.model = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void atualizaTabela(List<Produtos> entidade) {
        new Thread(() -> {
            model.setNumRows(0);
            entidade.forEach(p -> {
                model.addRow(
                        new Object[]{
                            p.getCodigo(),
                            p.getNome(),
                            p.getPreco(),
                            p.getQuantidadeVenda()
                        });
            });
        }).start();
    }

    @Override
    public void inserirEntidadeTeste(List<Produtos> entidade) {
       
    }

    @Override
    public void retornaItemPesquisado(Produtos entidade) {

        model.setNumRows(0);
        model.addRow(
                new Object[]{
                    entidade.getCodigo(),
                    entidade.getNome(),
                    entidade.getPreco()
                });

    }

    @Override
    public void buscaEntidades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produtos buscaEntidadeClicada(int index) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagaEntidade(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editaEntidade(Produtos entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
