/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.entidades;

/**
 *
 * @author netos
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String setor;
    private String rg;
    private String cpf;

    public Usuario(int id, String nome, String email, String senha, String setor) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.setor = setor;
    }
    
     public Usuario(String nome,String rg,String cpf ,String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.setor = setor;
    }
    public Usuario(){}

    

   
  
    
    public int getId() {
        return id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
    
}
