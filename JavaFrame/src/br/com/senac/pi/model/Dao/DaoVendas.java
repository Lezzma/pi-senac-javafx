
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.entidades.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoVendas implements DaoRepositorio<Venda>{
    private List<Venda> listaDeVendas = new ArrayList<>();
    private Connection conexao;
    private PreparedStatement ps;
    private ResultSet rs;
   

    @Override
    public List<Venda> getAll() {
        return listaDeVendas;
    }

    @Override
    public void inserir(Venda entidade) {
        
    }

    @Override
    public void deletar(int id) {
        listaDeVendas.remove(id);
    }

    @Override
    public void att(Venda entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
