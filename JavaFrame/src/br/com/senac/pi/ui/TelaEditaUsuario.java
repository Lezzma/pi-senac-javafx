/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.ui;

import br.com.senac.pi.entidades.Cliente;
import br.com.senac.pi.entidades.Usuario;
import br.com.senac.pi.repositorio.UsuarioRepositorio;
import br.com.senac.repositorios.RepositorioTabelasUsuario;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author jose.rsneto10
 */
public class TelaEditaUsuario extends javax.swing.JFrame {
   
    private final JTable tabela;
    
    private final Usuario usuario;
    private final Usuario UsuarioAntesDeEditar;
    
    private List<Usuario> listaDeUsuario = new UsuarioRepositorio().getAll();
    private final UsuarioRepositorio dao = new UsuarioRepositorio();
    private RepositorioTabelasUsuario repositorioTabelasUsuario;
    private Cliente cliente;
    /**
     * Creates new form TelaEditaUsuario
     */
 
    /**
     * Creates new form TelaEditaUsuario
     * @param usuario
     * @param tabela
     */
    public TelaEditaUsuario(Usuario usuario,JTable tabela){
        initComponents();
        this.repositorioTabelasUsuario = new RepositorioTabelasUsuario(tabela);
        this.tabela = tabela;
        this.usuario = usuario;
        this.UsuarioAntesDeEditar = listaDeUsuario.get(listaDeUsuario.indexOf(usuario));
        
        prencheDadosUsuario(usuario);
        setIcon();
    }
    
  
    private void prencheDadosUsuario(Usuario usuario1) {
        edit_txt_nome.setText(usuario1.getNome());
        edit_txt_email.setText(usuario1.getEmail());
        edit_txt_rg.setText(usuario1.getRg());
        edit_txt_cpf.setText(usuario1.getCpf());
        
        
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
        btn_cancelar_editar_user = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        edit_txt_nome = new javax.swing.JTextField();
        edit_txt_email = new javax.swing.JTextField();
        edit_txt_rg = new javax.swing.JTextField();
        edit_txt_cpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_deletar_produto = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

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

        btn_cancelar_editar_user.setBackground(new java.awt.Color(51, 152, 219));
        btn_cancelar_editar_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelar_editar_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelar_editar_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelar_editar_userMouseExited(evt);
            }
        });
        btn_cancelar_editar_user.setLayout(null);

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_done_outline_white_18dp.png"))); // NOI18N
        btn_cancelar_editar_user.add(jLabel48);
        jLabel48.setBounds(10, 0, 40, 40);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Cancelar");
        btn_cancelar_editar_user.add(jLabel49);
        jLabel49.setBounds(50, 0, 60, 40);

        edit_txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_txt_emailActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Email");

        jLabel3.setText("RG");

        jLabel4.setText("CPF");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_salvar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btn_deletar_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addGap(64, 64, 64)
                        .addComponent(btn_cancelar_editar_user, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(edit_txt_cpf)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 213, Short.MAX_VALUE))
                            .addComponent(edit_txt_email))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salvar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_editar_user, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
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

    private void btn_salvar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_clienteMouseClicked
        // TODO add your handling code here:
      // TODO add your handling code here:
        usuario.setNome(edit_txt_nome.getText());
        usuario.setEmail(edit_txt_email.getText());
        usuario.setRg(edit_txt_rg.getText());
        usuario.setCpf(edit_txt_cpf.getText());
        
        if(!UsuarioAntesDeEditar.equals(usuario)){
            dao.deletar(UsuarioAntesDeEditar);
            dao.inserir(usuario);

        }
         int reply = JOptionPane.showConfirmDialog(null,
            "Deseja realmente editar esse usuário",
            "Edita usuario",
            JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            atualizaTabelaResetaContadorDaTelaEditar();
        }
    }//GEN-LAST:event_btn_salvar_clienteMouseClicked

    private void btn_salvar_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_clienteMouseEntered
        // TODO add your handling code here:
        btn_salvar_cliente.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_salvar_clienteMouseEntered

    private void btn_salvar_clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_clienteMouseExited
        // TODO add your handling code here:
        btn_salvar_cliente.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_salvar_clienteMouseExited

    private void btn_cancelar_editar_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_editar_userMouseClicked
        // TODO add your handling code here:
        atualizaTabelaResetaContadorDaTelaEditar();
        dispose();
        limpaCampos();
    }//GEN-LAST:event_btn_cancelar_editar_userMouseClicked

    private void limpaCampos() {
        edit_txt_cpf.setText("");
        edit_txt_email.setText("");
        edit_txt_nome.setText("");
        edit_txt_rg.setText("");
    }

    private void btn_cancelar_editar_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_editar_userMouseEntered
        // TODO add your handling code here:
        btn_cancelar_editar_user.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_cancelar_editar_userMouseEntered

    private void btn_cancelar_editar_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_editar_userMouseExited
        // TODO add your handling code here:
        btn_cancelar_editar_user.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_cancelar_editar_userMouseExited

    private void edit_txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_txt_emailActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formWindowLostFocus

    private void btn_deletar_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deletar_produtoMouseClicked
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null,
            "Deseja realmente remover este produto?",
            "Remover produto",
            JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            int itemClicado = tabela.getSelectedRow();
            dao.deletar(dao.getAll().get(itemClicado));
            atualizaTabelaResetaContadorDaTelaEditar();
        }
    }//GEN-LAST:event_btn_deletar_produtoMouseClicked
    public void atualizaTabelaResetaContadorDaTelaEditar() {
        repositorioTabelasUsuario.atualizaTabela(dao.getAll());
        Sistema.setTelaEditaUsuario(null);
        dispose();
    }
    private void btn_deletar_produtoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deletar_produtoMouseEntered
        // TODO add your handling code here:
        btn_deletar_produto.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_deletar_produtoMouseEntered

    private void btn_deletar_produtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deletar_produtoMouseExited
        // TODO add your handling code here:
        btn_deletar_produto.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_deletar_produtoMouseExited

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_cancelar_editar_user;
    private javax.swing.JPanel btn_deletar_produto;
    private javax.swing.JPanel btn_salvar_cliente;
    private javax.swing.JTextField edit_txt_cpf;
    private javax.swing.JTextField edit_txt_email;
    private javax.swing.JTextField edit_txt_nome;
    private javax.swing.JTextField edit_txt_rg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }
}
