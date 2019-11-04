/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.utils;

/**
 *
 * @author jrneto
 */
public interface Valida {
    boolean verificaCpf(String cpf);
    
    //verifica nome
    boolean validaCep(String cep);
    
    //valida nome
    boolean verificaNome(String nome);
    
    //verififica se e numero
    boolean verificaNumero(String numero);
    
    //verifica email
    boolean verificaEmail(String email);
    

}
