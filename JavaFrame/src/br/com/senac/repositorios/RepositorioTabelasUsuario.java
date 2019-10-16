/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.repositorios;

import br.com.senac.pi.entidades.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose.rsneto10
 */
public class RepositorioTabelasUsuario implements RepositorioTabela<Usuario> {
    @Override
    public void atualizaTabela(DefaultTableModel model, List<Usuario> entidade) {
        new Thread(() -> {
            model.setNumRows(0);
            entidade.forEach(p -> {
            model.addRow(
                    new Object[]{
                        p.getNome(),
                        p.getRg(),
                        p.getCpf(),
                        p.getEmail()
                    });
        });
         }).start();
    }

    @Override
    public void inserirUsuarioTeste(List<Usuario> entidade,DefaultTableModel model) {
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
        atualizaTabela(model, entidade);
        }).start();
        
    }
     
}
