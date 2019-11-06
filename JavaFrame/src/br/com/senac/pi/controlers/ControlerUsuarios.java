/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.controlers;

import br.com.senac.pi.model.entidades.Setor;
import br.com.senac.pi.model.entidades.Usuario;
import br.com.senac.pi.model.Dao.UsuarioRepositorio;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jose.rsneto10
 */
public class ControlerUsuarios {
    static UsuarioRepositorio dao = new UsuarioRepositorio();
    
    //Cria novo usuario
    
    public static Boolean criarUsuario(Usuario novoUsuario){
        try {
            dao.inserir(novoUsuario);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return false;
    }
    //pega a quantidade de usuarios
    public List<Usuario> pegarUsuarios(){
        return dao.getAll();
    }
}
