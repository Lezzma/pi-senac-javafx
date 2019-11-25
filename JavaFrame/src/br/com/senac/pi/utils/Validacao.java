/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.utils;

import br.com.senac.pi.model.entidades.Cliente;
import br.com.senac.pi.model.entidades.Produtos;
import br.com.senac.pi.model.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrneto
 */
public class Validacao {

    //verifica se o cpf tem o formato adequado
    public boolean verificaCpf(String cpf) {
        String cpfValido = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
        return cpf.matches(cpfValido);
    }

    //verifica se o cep tem o formato adequado
    public boolean validaCep(String cep) {
        String cepValido = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        return cep.matches(cepValido);
    }
    
    public boolean validaRg(String rg){
        String rgValido = "\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d";
        return rg.matches(rgValido);
    }
    public boolean validaTell(String telefone) {
        String telefoneValido = "\\d\\d\\d\\d\\d\\d\\d\\d-\\d\\d\\d\\d";
        return telefone.matches(telefoneValido);
    }

    public boolean verificaNome(String nome) {
        return nome.matches("[a-zA-Z\\s\\W]+");
    }

    public boolean verificaNumero(String numero) {
        return numero.matches("^[0-9]*");
    }

    public boolean verificaEmail(String email) {
        return email.matches(".*@.*");
    }

    public boolean validaComplemento(String complemento) {
        complemento.matches(".");
        return false;
    }

    public boolean verificaNomeNull(String nome) {
        if (!nome.equals("")) {
            return true;
        }
        return false;
    }

    /*metodo responsavel por validar se o cliente esta valido 
     *verifica: nome,email,cpf,sexo e numero da casa
     *@param cliente
     */
    public List<String> validaCliente(Cliente cliente) {
        List<String> erros = new ArrayList<>();

        if (!verificaNome(cliente.getNome()) && !cliente.getNome().equals("")) {
            erros.add("Nome do cliente só pode conter letras");
        } else if (cliente.getNome().equals("")) {
            erros.add("Nome do cliente é obrigatório!");
        }

        if (!verificaEmail(cliente.getEmail()) && !cliente.getEmail().equals("")) {
            erros.add("Email inválido!");
        } else if (cliente.getEmail().equals("")) {
            erros.add("Email do cliente é obrigatório!");
        }
        if (!verificaCpf(cliente.getCpf()) && !cliente.getCpf().equals("")) {
            erros.add("CPF inválido!");
        } else if (cliente.getCpf().equals("")) {
            erros.add("CPF do cliente é obrigatório!");
        }
        if (!validaCep(cliente.getCep()) && !cliente.getCep().equals("")) {
            erros.add("CEP inválido!");
        } else if (cliente.getCep().equals("")) {
            erros.add("CEP do cliente é obrigatório!");
        }
        if (!verificaNomeNull(cliente.getSexo())) {
            erros.add("Sexo não pode ser nulo");
        }

       

        return erros;
    }

    public List<String> validaProdutos(Produtos produto) {
        List<String> erros = new ArrayList<>();

        if (produto.getNome().equals("")) {
            erros.add("Nome é obrigarótio");
        }

        if (produto.getCodigo().equals("")) {
            erros.add("Código do produto é obrigatório");
        }
        
        if(produto.getQuantidadeEstoque() == 0 ){
             erros.add("Quantidade do produto é obrigatório");
        }

        return erros;
    }

    public List<String> validaUsuarios(Usuario usuario) {
        List<String> erros = new ArrayList<>();
        //nome
        if(usuario.getNome().equals("")){
            erros.add("Nome do usuário é obrigado!");
        }
        
        //rg
        if(!validaRg(usuario.getRg()) && !usuario.getRg().equals("")){
            erros.add("RG invalido!");
        }
        //cpf
        
        if(!verificaCpf(usuario.getCpf()) && !usuario.getCpf().equals("")){
            erros.add("CPF invalido!");
        }
        //email
        if(!verificaEmail(usuario.getEmail()) && !usuario.getEmail().equals("")){
            erros.add("Email invalido!");
        }else if(usuario.getEmail().equals("")){
            erros.add("Email do usuário é obrigado!");
        }
        //senha
        
        return erros;
    }
}
