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
public class ValidaTexto implements Valida{
 
    //verifica se o cpf tem o formato adequado
    @Override
    public boolean verificaCpf(String cpf) {
       String cpfValido = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
       return cpf.matches(cpfValido);
    }
    
    //verifica se o cep tem o formato adequado
    @Override
    public boolean validaCep(String cep) {
        String cepValido = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        return cep.matches(cepValido);
    }

    @Override
    public boolean verificaNome(String nome) {
        return nome.matches("^[A-z][a-z]*");
    }

    @Override
    public boolean verificaNumero(String numero) {
            return numero.matches("^[0-9]*");
    }

    @Override
    public boolean verificaEmail(String email) {
            return email.matches(".*@.*");
    }

   public boolean verificaNomeNull(String nome){
       if(!nome.equals("")){
           return true;
       }
       return false;
   }
   
    
    
}
