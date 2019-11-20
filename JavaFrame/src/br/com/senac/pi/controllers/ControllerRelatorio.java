/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.controllers;

import br.com.senac.pi.model.Dao.DaoRelatorio;

/**
 *
 * @author jrneto
 */
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
