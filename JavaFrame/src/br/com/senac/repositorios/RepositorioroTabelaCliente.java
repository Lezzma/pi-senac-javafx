/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.repositorios;

import br.com.senac.pi.entidades.Cliente;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrneto
 */
public class RepositorioroTabelaCliente implements RepositorioTabela<Cliente>{
     DefaultTableModel model;
    
    public RepositorioroTabelaCliente(JTable tabela){
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
                        p.getCpf()
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

    
}
