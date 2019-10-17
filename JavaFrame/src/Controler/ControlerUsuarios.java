/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import br.com.senac.pi.entidades.Setor;
import br.com.senac.pi.entidades.Usuario;
import br.com.senac.pi.repositorio.UsuarioRepositorio;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jose.rsneto10
 */
public class ControlerUsuarios {
    static UsuarioRepositorio dao = new UsuarioRepositorio();
    
    //Cria novo usuario
    
    public static Boolean criarUsuario(int id, String nome, String email,String rg,String cpf, String senha, Setor setor){
        try {
            Usuario novoUsuario = new Usuario(id, nome,email ,rg, cpf,senha,setor);
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
