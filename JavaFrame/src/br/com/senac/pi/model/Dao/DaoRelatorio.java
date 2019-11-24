
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.entidades.Venda;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoRelatorio  implements DaoRepositorio<Venda>{
    private static List<Venda> LISTA_DE_RELATORIO = new DaoVendas().getAll();
    @Override
    public List<Venda> getAll() {
        return LISTA_DE_RELATORIO;
    }

    @Override
    public void inserir(Venda entidade) {
      LISTA_DE_RELATORIO.add(entidade);
    }

    

    @Override
    public void deletar(int id) {
        LISTA_DE_RELATORIO.remove(id);
    }

    @Override
    public void att(Venda entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
