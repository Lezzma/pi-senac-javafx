
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.entidades.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoCliente implements DaoRepositorio<Cliente>{
    private static List<Cliente> LISTA_DE_CLIENTE = new ArrayList<>();
    
    @Override
    public List<Cliente> getAll() {
        return LISTA_DE_CLIENTE;
    }

    @Override
    public void inserir(Cliente entidade) {
        LISTA_DE_CLIENTE.add(entidade);
    }

    

    @Override
    public void deletar(int id) {
        LISTA_DE_CLIENTE.remove(id);
    }

    @Override
    public void att(Cliente entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
