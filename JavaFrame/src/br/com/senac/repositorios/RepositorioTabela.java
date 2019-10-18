/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.repositorios;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose.rsneto10
 */
public interface RepositorioTabela<T> {
    
    void convertModelTabela(JTable tabela);
    void atualizaTabela(List<T> entidade);
    void inserirEntidadeTeste(List<T> entidade);
    void retornaItemPesquisado(T entidade);
    
}
