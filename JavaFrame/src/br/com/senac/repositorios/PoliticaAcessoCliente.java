/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.repositorios;

import br.com.senac.pi.entidades.Cliente;
import javax.swing.JPanel;

/**
 *
 * @author jrneto
 */
public class PoliticaAcessoCliente implements PoliticaDeAcesso<Cliente>{

    @Override
    public void recebeBotoesRestritos(JPanel... JPanel) {
        if(!JPanel.equals(null)){
        int quantidadeDeBotoes = JPanel.length-1;
            for(int i=0;i<= quantidadeDeBotoes; i++){
                JPanel[i].setVisible(false);
            }
        }
    }

    @Override
    public void setProximoSetor(Cliente proximaSetor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
