/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.controlers;

import br.com.senac.pi.model.Dao.DaoRelatorio;
import br.com.senac.factoryReposit.RepositorioTabelaRelatorio;

/**
 *
 * @author jrneto
 */
public class RelatorioControler {
    RepositorioTabelaRelatorio relatorio;
    DaoRelatorio dao;
    public RelatorioControler(RepositorioTabelaRelatorio repositorioTabelaRelatorio){
        this.relatorio = repositorioTabelaRelatorio;
        this.dao = new DaoRelatorio();
    }
    
    public void atualizaTabelaRepositorio(){
        relatorio.atualizaTabela(dao.getAll());
    }
    
    public void inserirVendaTeste(){
        relatorio.inserirEntidadeTeste(dao.getAll());
    }
    
   
}
