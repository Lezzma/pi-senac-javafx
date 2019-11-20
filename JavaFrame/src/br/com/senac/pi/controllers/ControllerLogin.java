/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.controllers;

import br.com.senac.pi.model.entidades.Setor;
import br.com.senac.pi.model.entidades.Usuario;
import br.com.senac.pi.model.Dao.UsuarioRepositorio;
import java.util.List;

/**
 *
 * @author jrneto
 */
public class ControllerLogin {
    private UsuarioRepositorio dao = new UsuarioRepositorio();
    private List<Usuario> listaDeUsuario = dao.getAll();
    private Usuario userLogado;
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
