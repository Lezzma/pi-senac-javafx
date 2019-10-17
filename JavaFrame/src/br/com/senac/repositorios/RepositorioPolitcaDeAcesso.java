/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.repositorios;

import javax.swing.JPanel;

/**
 *
 * @author jrneto
 */
public interface RepositorioPolitcaDeAcesso<T> {
    void colocarBotoesDousuario(T entidade);
    void recebeBotoesRestritos(JPanel...JPanel);
}
