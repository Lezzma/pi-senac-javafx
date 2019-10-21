/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.entidades;

import java.util.Date;

/**
 *
 * @author jrneto
 */
public class Venda {
    private int id;// id da venda
    private Usuario vendedor;//quem vendeu
    private Cliente cliente;//quem comprou
    private Carrinho carrinho;//oque ele comprou
    private double total_pago;//quanto pagou
    private Date diaDaCompra;//quando comprou

    public int getId() {
        return id;
    }
    
    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }


   

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void seCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public double getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(double total_pago) {
        this.total_pago = total_pago;
    }

    public Date getDiaDaCompra() {
        return diaDaCompra;
    }

    public void setDiaDaCompra(Date diaDaCompra) {
        this.diaDaCompra = diaDaCompra;
    }
    
    
}
