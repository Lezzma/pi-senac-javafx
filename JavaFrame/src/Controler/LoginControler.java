/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import br.com.senac.pi.entidades.Setor;
import br.com.senac.pi.entidades.Usuario;
import br.com.senac.pi.repositorio.UsuarioRepositorio;
import br.com.senac.pi.ui.Sistema;
import java.util.List;

/**
 *
 * @author jrneto
 */
public class LoginControler {
    private UsuarioRepositorio dao = new UsuarioRepositorio();
    private List<Usuario> listaDeUsuario = dao.getAll();
    private Usuario userLogado = new Usuario();
    private boolean token = false;
  
    
    public boolean autUser(String login,String senha){
        
         listaDeUsuario.forEach(usuario -> {
            if(login.equals(usuario.getNome()) && senha.equals(usuario.getSenha())){
                    this.userLogado = usuario;
                    if(!this.userLogado.getSetor().equals(Setor.cliente)){
                        this.token = true;
                    }
                    
                }
            });
            return this.token;
       }
    
    public Usuario getUserLogado(){  
        return userLogado;
    }
}
