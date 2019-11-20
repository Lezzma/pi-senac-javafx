/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.controllers;

import br.com.senac.pi.model.entidades.Setor;
import javax.swing.JPanel;

/**
 *
 * @author jrneto
 */
public interface FactoryPoliticaDeAcesso<T> {

    void recebeBotoesRestritos(JPanel...JPanel);
    void setProximoSetor(T proximaSetor);
}
