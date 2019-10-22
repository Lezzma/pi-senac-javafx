/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.ui.janelas.atalhos;

import br.com.senac.pi.entidades.Produtos;
import br.com.senac.pi.repositorio.DaoCarrinho;
import br.com.senac.pi.repositorio.DaoRepositorio;
import br.com.senac.pi.repositorio.ProdutoRepositorio;
import br.com.senac.repositorios.RepositorioTabela;
import br.com.senac.repositorios.RepositorioTabelaProduto;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author jrneto
 */
public class TelaPesquisaProdutoFrenteDeCaixa extends javax.swing.JFrame {

    private RepositorioTabela repoTabela;
    private RepositorioTabela repoTabelaCarrinho;
    private DaoRepositorio daoProduto;
    private List<Produtos> listaDeProdutos;
    private JLabel valorTotal;
    private double valor;
    private DaoRepositorio daoCarrinho;
    private Produtos produtoClicado;

    /**
     * Creates new form TelaPesquisaProdutoFrenteDeCaixa
     */
    public TelaPesquisaProdutoFrenteDeCaixa() {
        initComponents();
        this.repoTabela = new RepositorioTabelaProduto(tab_pes_fdc);
        this.daoProduto = new ProdutoRepositorio();
        this.listaDeProdutos = daoProduto.getAll();
        configuraTabela(listaDeProdutos);
    }

    public TelaPesquisaProdutoFrenteDeCaixa(JTable tabela, JLabel valototal) {
        initComponents();
        this.valorTotal = valototal;
        this.valor = Double.parseDouble(valototal.getText());
        this.repoTabela = new RepositorioTabelaProduto(tab_pes_fdc);
        this.repoTabela = new RepositorioTabelaProduto(tab_pes_fdc);
        this.repoTabelaCarrinho = new RepositorioTabelaProduto(tabela);
        this.daoProduto = new ProdutoRepositorio();
        this.listaDeProdutos = daoProduto.getAll();
        this.daoCarrinho = new DaoCarrinho();
        configuraTabela(listaDeProdutos);
    }

    private void configuraTabela(List lista) {
        repoTabela.inserirEntidadeTeste(lista);
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
        tab_pes_fdc = new javax.swing.JTable();
        searche_fdc = new javax.swing.JTextField();
        btn_pesquisa_fdc = new javax.swing.JButton();
        jComboBox_tipo_pesquisa = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        item_quantidade = new javax.swing.JSpinner();
        btn_set_qtd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tab_pes_fdc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_pes_fdc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_pes_fdcMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_pes_fdc);

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

        jComboBox_tipo_pesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "ID", "Nome", "Marca" }));

        jLabel1.setText("Pesquisar por :");

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
                        .addComponent(btn_pesquisa_fdc)
                        .addGap(18, 18, 18)
                        .addComponent(searche_fdc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_tipo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_set_qtd, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searche_fdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_pesquisa_fdc)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox_tipo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        String tipoDePesquisa = jComboBox_tipo_pesquisa.getSelectedItem().toString();

        pesquisa(tipoDePesquisa, itemPesquisado);
    }//GEN-LAST:event_btn_pesquisa_fdcActionPerformed

    private void tab_pes_fdcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_pes_fdcMouseClicked
        duploClickTabela(evt);
        int indexItem = tab_pes_fdc.getSelectedRow();
        this.produtoClicado = listaDeProdutos.get(indexItem);
        item_quantidade.setValue(produtoClicado.getQuantidade());

    }//GEN-LAST:event_tab_pes_fdcMouseClicked
    protected void duploClickTabela(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            Produtos produtoClicado = pegaProdutoClicado();
            if (!daoCarrinho.getAll().contains(produtoClicado)) {
                daoCarrinho.inserir(produtoClicado);
                valor += produtoClicado.getPreco() * produtoClicado.getQuantidade();
                valorTotal.setText(String.valueOf(valor));
                repoTabelaCarrinho.atualizaTabela(daoCarrinho.getAll());
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Esse produto já está no carrinho", "Ação não permitida!", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    private void btn_set_qtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_set_qtdActionPerformed
        // TODO add your handling code here:
        int quantidadeColocada = Integer.parseInt(item_quantidade.getValue().toString());
        if (this.produtoClicado.getQuantidade() != quantidadeColocada) {
            this.produtoClicado.setQuantidade(quantidadeColocada);
            item_quantidade.setValue(0);
            repoTabela.atualizaTabela(listaDeProdutos);
        }
    }//GEN-LAST:event_btn_set_qtdActionPerformed

    private void btn_set_qtdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_set_qtdMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_set_qtdMouseClicked

    private Produtos pegaProdutoClicado() {
        // TODO add your handling code here:

        int itemClicado = tab_pes_fdc.getSelectedRow();
        Produtos produtoClicado = listaDeProdutos.get(itemClicado);

        return produtoClicado;
    }

    private void pesquisa(String tipoDePesquisa, String itemPesquisado) {
        switch (tipoDePesquisa) {
            case "Código":
//                      Código
//                        ID
//                        Nome
//                        Marca
                listaDeProdutos.forEach(p -> {
                    if (p.getCodigo().equals(itemPesquisado)) {
                        repoTabela.retornaItemPesquisado(p);
                    }
                });
                break;
            case "ID":
                break;
            case "Nome":
                listaDeProdutos.forEach(p -> {
                    if (p.getNome().equals(itemPesquisado)) {
                        repoTabela.retornaItemPesquisado(p);
                    }
                });
                break;
            case "Marca":
                listaDeProdutos.forEach(p -> {
                    if (p.getMarca().equals(itemPesquisado)) {
                        repoTabela.retornaItemPesquisado(p);
                    }
                });
                break;
        }
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
                new TelaPesquisaProdutoFrenteDeCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pesquisa_fdc;
    private javax.swing.JButton btn_set_qtd;
    private javax.swing.JSpinner item_quantidade;
    private javax.swing.JComboBox jComboBox_tipo_pesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searche_fdc;
    private javax.swing.JTable tab_pes_fdc;
    // End of variables declaration//GEN-END:variables
}
