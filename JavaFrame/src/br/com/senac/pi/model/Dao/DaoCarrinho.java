
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.entidades.Produtos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoCarrinho implements DaoRepositorio<Produtos>{
    private static List<Produtos> LISTA_CARRINHO_DE_COMPRAS = new ArrayList<>();
    
    @Override
    public List<Produtos> getAll() {
        return LISTA_CARRINHO_DE_COMPRAS;
    }

    @Override
    public void inserir(Produtos entidade) {
        LISTA_CARRINHO_DE_COMPRAS.add(entidade);
    }


    @Override
    public void deletar(int id) {
       LISTA_CARRINHO_DE_COMPRAS.remove(id);
    }
    
    public void limpaCarrinho(){
        LISTA_CARRINHO_DE_COMPRAS.removeAll(LISTA_CARRINHO_DE_COMPRAS);
    }

    @Override
    public void att(Produtos entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
