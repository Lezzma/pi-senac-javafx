package br.com.senac.pi.controllers;

import br.com.senac.pi.model.Dao.DaoRelatorio;

public class ControllerRelatorio {
    ControllerTabelaRelatorio relatorio;
    DaoRelatorio dao;
    public ControllerRelatorio(ControllerTabelaRelatorio repositorioTabelaRelatorio){
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
