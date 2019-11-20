
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.entidades.Cliente;
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
    public void att(Cliente entidade) {
      
    }

    @Override
    public void deletar(Cliente entidade) {
        LISTA_DE_CLIENTE.remove(entidade);
    }
    
}
