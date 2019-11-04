/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.model.entidades;

/**
 *
 * @author jose.rsneto10
 */
public class Produtos {

    private String codigo, nome,marca,descricao;
    private double preco;
    private int quantidadeVenda, quantidadeEstoque;
    
    public Produtos(){}
    
    public Produtos(String codigo, String nome,String marca,String descricao,int quantidadeEstoque,double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
        
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }
    
    

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "|codigo=" + codigo + "| nome=" + nome + "| marca=" + marca + "| descricao=" + descricao + "| preco=" + preco + "| quantidadeVenda=" + quantidadeVenda + '|';
    }



}
