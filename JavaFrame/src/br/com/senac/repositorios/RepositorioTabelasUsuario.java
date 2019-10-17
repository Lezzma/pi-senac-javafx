/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.repositorios;

import br.com.senac.pi.entidades.Usuario;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose.rsneto10
 */
public class RepositorioTabelasUsuario implements RepositorioTabela<Usuario> {
    DefaultTableModel model;
    
    public RepositorioTabelasUsuario(JTable tabela){
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
     
}
