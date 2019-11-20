package br.com.senac.pi.controllers;

import br.com.senac.pi.model.Dao.DaoProduto;
import br.com.senac.pi.model.entidades.Produtos;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerTabelaProduto implements FactoryTabela<Produtos>{
    private DefaultTableModel model;
    private DaoProduto dao = new DaoProduto();
    private List<Produtos> listaDeProdutos = new ArrayList<>();
    
    public ControllerTabelaProduto(JTable tabela){
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
                         p.getId(),
                         p.getNome(),
                         p.getPreco(),
                         p.getQuantidadeEstoque(),
                         p.getQuantidadeVenda()
                     });
         });
          }).start();
    }

    @Override
    public void inserirEntidadeTeste(List<Produtos> entidade) {
          new Thread(() -> {
            if (entidade.isEmpty()) {
            Produtos produtoTeste = new Produtos("123123","leite","leve leite","leite top",20,12.0);
            entidade.add(produtoTeste);
        }
        atualizaTabela(entidade);
        }).start();
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
    public void buscaEntidades() throws SQLException{
        atualizaTabela(dao.getAll());
    }
}
