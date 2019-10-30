/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.model.entidades;

import javax.swing.JTextField;
import javax.swing.text.Caret;

/**
 *
 * @author jrneto
 */
public class Endereco {
    private String cep;
    private String bairro;
    private String rua;
    private char complemento;
    private int numero;

    public Endereco(String cep, String bairro, String rua, char complemento, int numero) {
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.complemento = complemento;
        this.numero = numero;
    }

    public Endereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Endereco(String text, String text0, JTextField txt_rua_novo_cliente, Caret caret, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public char getComplemento() {
        return complemento;
    }

    public void setComplemento(char complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
