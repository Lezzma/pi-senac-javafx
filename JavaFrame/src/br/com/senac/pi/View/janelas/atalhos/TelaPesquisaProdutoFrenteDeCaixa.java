/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.View.janelas.atalhos;

import br.com.senac.pi.controllers.ControllerTabelaCarrinho;
import br.com.senac.pi.model.entidades.Produtos;
import br.com.senac.pi.model.Dao.DaoCarrinho;
import br.com.senac.pi.model.Dao.DaoProduto;
import br.com.senac.pi.controllers.ControllerTabelaProduto;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import br.com.senac.pi.controllers.FactoryTabela;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrneto
 */
public class TelaPesquisaProdutoFrenteDeCaixa extends javax.swing.JFrame {

    private ControllerTabelaProduto repoTabelaProdutos;
    private ControllerTabelaCarrinho repoTabelaCarrinho;
    
    private final DaoProduto daoProduto;
    private final List<Produtos> listaDeProdutos;
    
    private JLabel valorTotal;
    private double valor;
    private DaoCarrinho daoCarrinho;
    private Produtos produtoClicado;

    /**
     * Creates new form TelaPesquisaProdutoFrenteDeCaixa
     */
   

    public TelaPesquisaProdutoFrenteDeCaixa(JTable tabela, JLabel valototal) throws SQLException {
        initComponents();
        
        //coloca valor total
        valorTotal = valototal;
        
        //recebe o valor anterior
        valor = Double.parseDouble(valototal.getText());
        
        //tabela de pesquisar produtos
        repoTabelaProdutos = new ControllerTabelaProduto(tabela_frenteDeCaixa_produtos);
       
        //tabela da frente de caixa
        repoTabelaCarrinho = new ControllerTabelaCarrinho(tabela);
        
        //dao que busca todos produtos
        daoProduto = new DaoProduto();
        
        //lista contendo todos os produtos
        listaDeProdutos = daoProduto.getAll();
        
        //dao do carrinho de compras
        //usado para adicionar o produto no carrinho
        daoCarrinho = new DaoCarrinho();
        
        //metodo resposavel por configura a tabela de pesquisa
        configuraTabela(listaDeProdutos);
    }

    private void configuraTabela(List lista) {
        repoTabelaProdutos.atualizaTabela(lista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_frenteDeCaixa_produtos = new javax.swing.JTable();
        searche_fdc = new javax.swing.JTextField();
        btn_pesquisa_fdc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        item_quantidade = new javax.swing.JSpinner();
        btn_set_qtd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabela_frenteDeCaixa_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Qtd estoque", "Qtd venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_frenteDeCaixa_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_frenteDeCaixa_produtosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_frenteDeCaixa_produtos);

        searche_fdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searche_fdcActionPerformed(evt);
            }
        });

        btn_pesquisa_fdc.setText("Pesquisar");
        btn_pesquisa_fdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisa_fdcActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar por Código");

        jLabel2.setText("Quantidade");

        btn_set_qtd.setText("Quantificar");
        btn_set_qtd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_set_qtdMouseClicked(evt);
            }
        });
        btn_set_qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_set_qtdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_set_qtd, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_pesquisa_fdc)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searche_fdc)
                                .addGap(223, 223, 223)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searche_fdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisa_fdc))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_set_qtd)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searche_fdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searche_fdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searche_fdcActionPerformed

    private void btn_pesquisa_fdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisa_fdcActionPerformed
        // TODO add your handling code here:

        String itemPesquisado = searche_fdc.getText();

        pesquisa(itemPesquisado);
    }//GEN-LAST:event_btn_pesquisa_fdcActionPerformed

    private void tabela_frenteDeCaixa_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_frenteDeCaixa_produtosMouseClicked
       
        if(evt.getClickCount() == 2 ){
            duploClickTabela();
            item_quantidade.setValue(pegaProdutoClicado().getQuantidadeVenda());
        }else{
                int idexProduto = tabela_frenteDeCaixa_produtos.getSelectedRow();
                produtoClicado = listaDeProdutos.get(idexProduto);
        }
        
        
    }//GEN-LAST:event_tabela_frenteDeCaixa_produtosMouseClicked
    protected void duploClickTabela() {
            Produtos itemClicado = pegaProdutoClicado();
            
            if (!daoCarrinho.getAll().contains(itemClicado) && itemClicado.getQuantidadeEstoque() > 0) {
               
                //coloca o item clicado no carrinho de comprass
                daoCarrinho.inserir(itemClicado);
                
                //armazena o valor total
                valor += itemClicado.getPreco() * itemClicado.getQuantidadeVenda();
                
                //coloca o valor total na tela de frente de caixa
                valorTotal.setText(String.valueOf(valor));
                
                //atualiza a tabela da frente de caixa
                repoTabelaCarrinho.atualizaTabela(daoCarrinho.getAll());
                
                //fecha a janela atual
                dispose();

            }else if(itemClicado.getQuantidadeEstoque() == 0){
                JOptionPane.showMessageDialog(null, "Esse produto não tem em estoque", "Ação não permitida!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                
                JOptionPane.showMessageDialog(null, "Esse produto já está no carrinho", "Ação não permitida!", JOptionPane.INFORMATION_MESSAGE);
                repoTabelaCarrinho.atualizaTabela(daoCarrinho.getAll());
            }
        

    }

    private void btn_set_qtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_set_qtdActionPerformed
        // TODO add your handling code here:
        int quantidadeColocada = Integer.parseInt(item_quantidade.getValue().toString());
        if(quantidadeColocada <= produtoClicado.getQuantidadeEstoque() ){
            produtoClicado.setQuantidadeVenda(quantidadeColocada);
            item_quantidade.setValue(0);
            repoTabelaProdutos.atualizaTabela(listaDeProdutos);
        }else{
        JOptionPane.showMessageDialog(null, "A quantidade coloca essede a quantidade em estoque", "Ação não permitida!", JOptionPane.INFORMATION_MESSAGE);
        }
           
        
    }//GEN-LAST:event_btn_set_qtdActionPerformed

    private void btn_set_qtdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_set_qtdMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_set_qtdMouseClicked

    private Produtos pegaProdutoClicado() {
        int itemClicado = tabela_frenteDeCaixa_produtos.getSelectedRow();
        Produtos pegaritemClicado = listaDeProdutos.get(itemClicado);

        return pegaritemClicado;
    }

    private void pesquisa(String itemPesquisado) {
      
                listaDeProdutos.forEach(p -> {
                    if (p.getCodigo().equals(itemPesquisado)) {
                        repoTabelaProdutos.retornaItemPesquisado(p);
                    }
                });
             
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaProdutoFrenteDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaProdutoFrenteDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaProdutoFrenteDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaProdutoFrenteDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPesquisaProdutoFrenteDeCaixa(null,null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaPesquisaProdutoFrenteDeCaixa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pesquisa_fdc;
    private javax.swing.JButton btn_set_qtd;
    private javax.swing.JSpinner item_quantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searche_fdc;
    private javax.swing.JTable tabela_frenteDeCaixa_produtos;
    // End of variables declaration//GEN-END:variables
}
