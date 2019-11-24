package br.com.senac.pi.controllers;

import br.com.senac.pi.model.Dao.DaoProduto;
import br.com.senac.pi.model.entidades.Produtos;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class ControllerTabelaProduto implements FactoryTabela<Produtos>{
    private DefaultTableModel model;
    private DaoProduto dao = new DaoProduto();
    
    public ControllerTabelaProduto(JTable tabela){
        this.convertModelTabela(tabela);
    }
    
    @Override
    public void convertModelTabela(JTable tabela) {
       this.model = (DefaultTableModel) tabela.getModel();
    }
     
    @Override
    public void atualizaTabela(List<Produtos> entidade) {
       
             model.setNumRows(0);
             
             entidade.forEach(p -> {
             model.addRow(
                     new Object[]{
                         p.getId(),
                         p.getNome(),
                         p.getPreco(),
                         p.getQuantidadeEstoque(),
                         p.getQuantidadeVenda()
                     });
         });
         
    }

    @Override
    public void inserirEntidadeTeste(List<Produtos> entidade) {
    }

    @Override
    public void retornaItemPesquisado(Produtos entidade) {
         
             model.setNumRows(0);
             model.addRow(
                     new Object[]{
                         entidade.getId(),
                         entidade.getNome(),
                         entidade.getPreco(),
                         entidade.getQuantidadeEstoque()
                     });
    }
    
    @Override
    public Produtos buscaEntidadeClicada(int index) throws SQLException{
        Produtos produtoClicado = dao.getAll().get(index);
        
        if(produtoClicado != null){
         return produtoClicado;
        }
        return null;
    }
    
    @Override
    public void buscaEntidades() throws SQLException{
        atualizaTabela(dao.getAll());
    }

    @Override
    public void apagaEntidade(int id) throws SQLException {
            dao.deletar(id);
    }

    @Override
    public void editaEntidade(Produtos produto) throws SQLException {
        if(dao.getAll().contains(produto)){
                dao.att(produto);
        }
            
    }
}
