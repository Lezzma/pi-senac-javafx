/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.utils;

import br.com.senac.pi.model.entidades.Cliente;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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
    
    public boolean validaTell(String telefone){
        String telefoneValido = "\\d\\d\\d\\d\\d\\d\\d\\d-\\d\\d\\d\\d";
        return telefone.matches(telefoneValido);
    }
    
    @Override
    public boolean verificaNome(String nome) {
        return nome.matches("[a-zA-Z\\s\\W]+");
    }

    @Override
    public boolean verificaNumero(String numero) {
            return numero.matches("^[0-9]*");
    }

    @Override
    public boolean verificaEmail(String email) {
            return email.matches(".*@.*");
    }
   public boolean validaComplemento(String complemento){
       complemento.matches(".");
       return false;
   }
   public boolean verificaNomeNull(String nome){
       if(!nome.equals("")){
           return true;
       }
       return false;
   }
   
   /*metodo responsavel por validar se o cliente esta valido 
   *verifica: nome,email,cpf,sexo e numero da casa
   *@param cliente
   */
   public List<String> validaCliente(Cliente cliente){
       List<String> erros = new ArrayList<>();
       
       if(!verificaNome(cliente.getNome()) && !cliente.getNome().equals("")){
           erros.add("Nome do cliente só pode conter letras");
       }else if(cliente.getNome().equals("")){
           erros.add("Nome do cliente é obrigatório!");
       }
       
       if(!verificaEmail(cliente.getEmail()) && !cliente.getEmail().equals("")){
           erros.add("Email inválido!");
       }else if(cliente.getEmail().equals("")){
            erros.add("Email do cliente é obrigatório!");
       }
       if(!verificaCpf(cliente.getCpf()) && !cliente.getCpf().equals("")){
           erros.add("CPF inválido!");
       }else if(cliente.getCpf().equals("")){
            erros.add("CPF do cliente é obrigatório!");
       }
       if(!validaCep(cliente.getEndereco().getCep()) && !cliente.getEndereco().getCep().equals("")){
        erros.add("CEP inválido!");
       }else if(cliente.getEndereco().getCep().equals("")){
            erros.add("CEP do cliente é obrigatório!");
       }
       if(!verificaNomeNull(cliente.getSexo())){
           erros.add("Sexo não pode ser nulo");
       }
      
       if(!verificaNumero(cliente.getEndereco().getNumero()) && !cliente.getEndereco().getNumero().equals("")){
           erros.add("No numero da residencia só pode conter numeros!");
       }else if(cliente.getEndereco().getNumero().equals("")){
            erros.add("Numero da residencia do cliente é obrigatório!");
       }
                                
       return erros;
   }

    
}
