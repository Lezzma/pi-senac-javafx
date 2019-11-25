/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.model.entidades;

import java.util.Objects;

/**
 *
 * @author jrneto
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String tell;
    private String sexo;
    private String estadoCivil;
    private String email;
    private String cep;
    private String bairro;
    private String rua;
    private String complemento;
    private int numero;
    
    public Cliente(){}

    public Cliente(String nome, String cpf, String dataDeNascimento, String tell, String sexo, String estadoCivil, String email,String cep, String bairro,String rua,String complemento, int numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.tell = tell;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua; 
        this.complemento = complemento;
        this.numero = numero;
    }
    
    public Cliente(int id,String nome, String cpf, String dataDeNascimento, String tell, String sexo, String estadoCivil, String email,String cep, String bairro,String rua,String complemento, int numero) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.tell = tell;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua; 
        this.complemento = complemento;
        this.numero = numero;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

  
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
}
