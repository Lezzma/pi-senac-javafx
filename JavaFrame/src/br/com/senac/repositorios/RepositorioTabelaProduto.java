/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.repositorios;

import br.com.senac.pi.entidades.Produtos;
import br.com.senac.pi.entidades.Usuario;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrneto
 */
public class RepositorioTabelaProduto implements RepositorioTabela<Produtos>{
    DefaultTableModel model;
    
    public RepositorioTabelaProduto(JTable tabela){
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
                         p.getPreco()
                     });
         });
          }).start();
    }

    @Override
    public void inserirEntidadeTeste(List<Produtos> entidade) {
          new Thread(() -> {
            if (entidade.isEmpty()) {
            Produtos produtoTeste = new Produtos("123123","leite",20);
            produtoTeste.setQuantidade(1);
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
                         entidade.getCodigo(),
                         entidade.getNome(),
                         entidade.getPreco()
                     });
       
      
    }
    
}
