/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.controllers;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose.rsneto10
 */
public interface FactoryTabela<T> {
    
    void convertModelTabela(JTable tabela);
    void buscaEntidades()throws SQLException;
    void atualizaTabela(List<T> entidade);
    void inserirEntidadeTeste(List<T> entidade);
    void retornaItemPesquisado(T entidade);
    T buscaEntidadeClicada(int index)throws SQLException;
    void apagaEntidade(int id) throws SQLException;
    void editaEntidade(T entidade)throws SQLException;
    void inserirEntidade(T entidade)throws SQLException;
    
}
