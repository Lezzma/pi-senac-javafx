/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.repositorio;

import br.com.senac.pi.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author netos
 */
public class UsuarioRepositorio implements DaoRepositorio<Usuario>{
 
    public static List<Usuario> usuarios = new ArrayList<>();
    @Override
    public List<Usuario> getAll() {
       return usuarios;
    }

    @Override
    public void inserir(Usuario entidade) {
       usuarios.add(entidade);
    }

    @Override
    public void att(Usuario entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Usuario entidade) {
        usuarios.remove(entidade);
    }
    
}
