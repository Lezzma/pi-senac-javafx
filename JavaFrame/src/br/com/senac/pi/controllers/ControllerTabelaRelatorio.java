/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.controllers;

import br.com.senac.pi.model.entidades.Cliente;
import br.com.senac.pi.model.entidades.Usuario;
import br.com.senac.pi.model.entidades.Venda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;

import java.util.Date;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrneto
 */
public class ControllerTabelaRelatorio implements FactoryTabela<Venda>{
    DefaultTableModel model;
    
    public ControllerTabelaRelatorio(JTable tabela){
        this.convertModelTabela(tabela);
    }
    
    @Override
    public void convertModelTabela(JTable tabela) {
        this.model = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void atualizaTabela(List<Venda> entidade) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         new Thread(() -> {
            model.setNumRows(0);
            entidade.forEach(v -> {
            model.addRow(
                    new Object[]{
                       v.getId(),
                       v.getCliente().getNome(),
                       v.getVendedor().getNome(),
                       dateFormat.format(v.getDiaDaCompra()),
                       v.getTotal_pago()
                    });
        });
         }).start();
    }

    @Override
    public void inserirEntidadeTeste(List<Venda> entidade) {
       new Thread(() -> {
           
           
            if (entidade.isEmpty()) {
                Usuario vendedor = new Usuario();
                vendedor.setNome("José");
           
                Cliente cliente = new Cliente();
                cliente.setNome("Naga");
            
            Venda testeVenda = new Venda();
            testeVenda.setCliente(cliente);
            testeVenda.setVendedor(vendedor);
               
            testeVenda.setDiaDaCompra(Date.from(Instant.now()));
            testeVenda.setTotal_pago(1200.0);
            entidade.add(testeVenda);
        }
            atualizaTabela(entidade);
        }).start(); 
    }

    @Override
    public void retornaItemPesquisado(Venda entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
