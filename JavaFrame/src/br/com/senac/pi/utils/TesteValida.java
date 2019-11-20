/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.utils;

/**
 *
 * @author jrneto
 */
public class TesteValida {
    
    public static void main(String[]a){
        
        Validacao valida = new Validacao();
        
        //TESTE CPF
        boolean cpf = valida.verificaCpf("388.791.698-07");
        System.out.println("cpf: "+cpf);
        
        //TESTE CEP
        boolean cep = valida.validaCep("04849-160");
        System.out.println("cep: "+cep);
        
        //TESTE NOME
        boolean nome =  valida.verificaNome("jose");
        System.out.println("nome: "+nome);
        
        //TESTE NUMERO
        boolean numero = valida.verificaNumero("123");
        System.out.println("numero: "+numero);
        
        //TESTE EMAIL
        boolean email = valida.verificaEmail("neto.silva100@hotmail.com");
        System.out.println("Email: "+email);
        
        

        
    }
    
    
}
