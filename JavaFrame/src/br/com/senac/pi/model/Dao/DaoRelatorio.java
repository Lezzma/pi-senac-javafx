/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.entidades.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrneto
 */
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
    public void att(Venda entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Venda entidade) {
        LISTA_DE_RELATORIO.remove(entidade);
    }
}
