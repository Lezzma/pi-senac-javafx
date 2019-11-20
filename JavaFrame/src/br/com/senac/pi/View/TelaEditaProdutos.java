/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.View;

import br.com.senac.pi.model.entidades.Cliente;
import br.com.senac.pi.model.entidades.Produtos;
import br.com.senac.pi.model.Dao.DaoRepositorio;
import br.com.senac.pi.model.Dao.DaoProduto;
import br.com.senac.pi.controllers.ControllerTabelaProduto;
import br.com.senac.pi.utils.Validacao;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author jose.rsneto10
 */
public class TelaEditaProdutos extends javax.swing.JFrame {
   
    private final JTable tabela;
    
    private final Produtos produto;
    private final Produtos produtoAntesDeEditar;
    private final DaoRepositorio dao = new DaoProduto();
    private List<Produtos> listaDeProdutos = dao.getAll();
    private Cliente cliente;
    private ControllerTabelaProduto repositorioTabelaProduto;
    /**
     * Creates new form TelaEditaUsuario
     */
 
    /**
     * Creates new form TelaEditaProduto
     * @param produto
     * @param tabela
     */
    public TelaEditaProdutos(Produtos produto,JTable tabela){
        initComponents();
        this.tabela = tabela;
        this.produto = produto;
        this.produtoAntesDeEditar = produto;
        this.repositorioTabelaProduto = new ControllerTabelaProduto(tabela);
        prencheDadosProdutos(produto);
        setIcon();
    }
    
  
    private void prencheDadosProdutos(Produtos produto) {
        edit_txt_codigo.setText(produto.getCodigo());
        edit_txt_codigo.setEditable(true);
        edit_txt_nome_produto.setText(produto.getNome());
        edit_txt_preco.setText(String.valueOf(produto.getPreco()));  
        edit_txt_marca_produto.setText(produto.getMarca());
        edit_txt_quantidade_produto.setValue(produto.getQuantidadeEstoque());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_salvar_cliente = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        edit_txt_codigo = new javax.swing.JTextField();
        edit_txt_nome_produto = new javax.swing.JTextField();
        edit_txt_preco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_deletar_produto = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edit_txt_quantidade_produto = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        edit_txt_marca_produto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        btn_salvar_cliente.setBackground(new java.awt.Color(51, 152, 219));
        btn_salvar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salvar_clienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salvar_clienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salvar_clienteMouseExited(evt);
            }
        });
        btn_salvar_cliente.setLayout(null);

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_done_outline_white_18dp.png"))); // NOI18N
        btn_salvar_cliente.add(jLabel46);
        jLabel46.setBounds(10, 0, 40, 40);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Editar");
        btn_salvar_cliente.add(jLabel47);
        jLabel47.setBounds(50, 0, 60, 40);

        btn_cancelar.setBackground(new java.awt.Color(51, 152, 219));
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseExited(evt);
            }
        });
        btn_cancelar.setLayout(null);

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_done_outline_white_18dp.png"))); // NOI18N
        btn_cancelar.add(jLabel48);
        jLabel48.setBounds(10, 0, 40, 40);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Cancelar");
        btn_cancelar.add(jLabel49);
        jLabel49.setBounds(50, 0, 60, 40);

        edit_txt_nome_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_txt_nome_produtoActionPerformed(evt);
            }
        });

        jLabel1.setText("*Codigo:");

        jLabel2.setText("*Nome:");

        jLabel3.setText("*Preço");

        btn_deletar_produto.setBackground(new java.awt.Color(51, 152, 219));
        btn_deletar_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deletar_produtoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_deletar_produtoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_deletar_produtoMouseExited(evt);
            }
        });
        btn_deletar_produto.setLayout(null);

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_warning_white_18dp.png"))); // NOI18N
        btn_deletar_produto.add(jLabel50);
        jLabel50.setBounds(10, 0, 40, 40);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Deletar");
        btn_deletar_produto.add(jLabel51);
        jLabel51.setBounds(50, 0, 60, 40);

        jLabel4.setText("*Quantidade");

        jLabel5.setText("Marca:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_txt_nome_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(edit_txt_codigo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_salvar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_deletar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(edit_txt_marca_produto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(edit_txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit_txt_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_txt_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_txt_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_txt_marca_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salvar_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletar_produto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //edita o produto clicado
    //coloca as alterações feitas
    //verifica se realmente teve alguma alteraçãp
    //pergunta se realmente quer editar
    //Se a resposta for sim, att talela.
    //chama o metodo 'setTelaEditaProdutos' da classe Sistema
    //@produto
    //@produtoAntesDeEditar
    private void btn_salvar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_clienteMouseClicked
        // TODO add your handling code here:
            Validacao valida =  new Validacao();
            List<String> erros = new ArrayList<>();
            StringBuilder errosTotal = new StringBuilder();
            
            produto.setCodigo(edit_txt_codigo.getText());
            produto.setNome(edit_txt_nome_produto.getText());
            produto.setMarca(edit_txt_marca_produto.getText());
            produto.setQuantidadeEstoque(Integer.parseInt(edit_txt_quantidade_produto.getValue().toString()));
            erros = valida.validaProdutos(produto);
             
            try {
                produto.setPreco(Double.parseDouble(edit_txt_preco.getText()));
            } catch (Exception e) {
                erros.add("Preço do produto não pode está vazio!");
            }
            
            if(!erros.isEmpty()){
                
                erros.forEach(erro -> {
                    errosTotal.append(erro+"\n");
                });
                JOptionPane.showMessageDialog(null, errosTotal.toString());
                
            }else{
                
                if(!produtoAntesDeEditar.equals(produto)){
                    dao.deletar(produtoAntesDeEditar);
                    dao.inserir(produto);  
                }

                int reply = JOptionPane.showConfirmDialog(null,
                    "Deseja realmente editar esse produto",
                    "Editar produto",
                    JOptionPane.YES_NO_OPTION);

                if (reply == JOptionPane.YES_OPTION) {
                    atualizaTabelaEresetaContadorDaTelaEditar();
                }
            }
            
            
       
      

    }//GEN-LAST:event_btn_salvar_clienteMouseClicked

    public void atualizaTabelaEresetaContadorDaTelaEditar() {
        repositorioTabelaProduto.atualizaTabela(dao.getAll());
        Sistema.setTelaEditaProdutos(null);
        dispose();
    }

    private void btn_salvar_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_clienteMouseEntered
        // TODO add your handling code here:
        btn_salvar_cliente.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_salvar_clienteMouseEntered

    private void btn_salvar_clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_clienteMouseExited
        // TODO add your handling code here:
        btn_salvar_cliente.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_salvar_clienteMouseExited

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        // TODO add your handling code here:
        dispose();
        //reseta a variavel Tela Edita Produtos
        Sistema.setTelaEditaProdutos(null);
        limpaCampos();
    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void limpaCampos() {
     
        edit_txt_nome_produto.setText("");
        edit_txt_codigo.setText("");
        edit_txt_preco.setText("");
    }

    private void btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseEntered
        // TODO add your handling code here:
        btn_cancelar.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_cancelarMouseEntered

    private void btn_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseExited
        // TODO add your handling code here:
        btn_cancelar.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_cancelarMouseExited

    private void edit_txt_nome_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_txt_nome_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_txt_nome_produtoActionPerformed

    private void btn_deletar_produtoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deletar_produtoMouseEntered
        // TODO add your handling code here:
           btn_deletar_produto.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_deletar_produtoMouseEntered

    private void btn_deletar_produtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deletar_produtoMouseExited
        // TODO add your handling code here:
        btn_deletar_produto.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_deletar_produtoMouseExited

    private void btn_deletar_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deletar_produtoMouseClicked
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null,
                "Deseja realmente remover este produto?",
                "Remover produto",
                JOptionPane.YES_NO_OPTION);
        
        if (reply == JOptionPane.YES_OPTION) {
            int itemClicado = tabela.getSelectedRow();
            dao.deletar(dao.getAll().get(itemClicado));
            atualizaTabelaEresetaContadorDaTelaEditar();
        }
    }//GEN-LAST:event_btn_deletar_produtoMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_cancelar;
    private javax.swing.JPanel btn_deletar_produto;
    private javax.swing.JPanel btn_salvar_cliente;
    private javax.swing.JTextField edit_txt_codigo;
    private javax.swing.JTextField edit_txt_marca_produto;
    private javax.swing.JTextField edit_txt_nome_produto;
    private javax.swing.JTextField edit_txt_preco;
    private javax.swing.JSpinner edit_txt_quantidade_produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }
}