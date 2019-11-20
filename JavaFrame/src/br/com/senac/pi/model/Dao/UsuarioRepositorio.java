
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio implements DaoRepositorio<Usuario>{
 
    public static List<Usuario> LISTA_DE_USUARIOS = new ArrayList<>();
    @Override
    public List<Usuario> getAll() {
       return LISTA_DE_USUARIOS;
    }

    @Override
    public void inserir(Usuario entidade) {
       LISTA_DE_USUARIOS.add(entidade);
    }

    @Override
    public void att(Usuario entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Usuario entidade) {
        LISTA_DE_USUARIOS.remove(entidade);
    }
    
}
