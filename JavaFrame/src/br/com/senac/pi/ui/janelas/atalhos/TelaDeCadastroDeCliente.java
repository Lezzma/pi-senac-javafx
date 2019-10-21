/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.ui.janelas.atalhos;

import Controler.ClienteControler;
import br.com.senac.pi.entidades.Cliente;
import br.com.senac.pi.ui.TelaFrenteDeCaixa;
import br.com.senac.repositorios.RepositorioroTabelaCliente;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author jrneto
 */
public class TelaDeCadastroDeCliente extends javax.swing.JDialog {
    private ClienteControler clienteControler;
    private TelaFrenteDeCaixa caixa;
 
    /**
     * Creates new form TelaDeCadastroDeCliente
     */
    public TelaDeCadastroDeCliente(java.awt.Frame parent, boolean modal,TelaFrenteDeCaixa telaPrincipal) {
        super(parent, modal);
        initComponents();
        this.caixa = telaPrincipal;

        //controler da entidade cliente
        //controla os eventos sobre a tabela
        //@param repositorioTabelaCLIENTE
        clienteControler = new ClienteControler(new RepositorioroTabelaCliente(tabela_de_clientes));
        
        //criando um cliente teste, somente para prenchimento da tabela
        clienteControler.criaClienteTeste();
        clienteControler.atualizaTabelaCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaCadastraCliente = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_nome_user = new javax.swing.JLabel();
        txt_nome_cliente = new javax.swing.JTextField();
        lbl_cpf_user = new javax.swing.JLabel();
        txt_cpf_cliente = new javax.swing.JFormattedTextField();
        pane_titulo_user = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btn_cancelar_cliente = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btn_salvar_cliente = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btn_salvar_cliente1 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabela_de_clientes = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btn_pesquisa = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        btn_salvar_cliente3 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        pane_titulo_user1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(700, 700));

        telaCadastraCliente.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_nome_user.setText("Nome:");

        txt_nome_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_clienteActionPerformed(evt);
            }
        });

        lbl_cpf_user.setText("CPF:");

        try {
            txt_cpf_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nome_user)
                    .addComponent(lbl_cpf_user))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome_user))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cpf_user))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pane_titulo_user.setBackground(new java.awt.Color(44, 62, 80));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Novo Cliente");

        btn_cancelar_cliente.setBackground(new java.awt.Color(51, 152, 219));
        btn_cancelar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelar_clienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelar_clienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelar_clienteMouseExited(evt);
            }
        });
        btn_cancelar_cliente.setLayout(null);

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_cancel_white_18dp.png"))); // NOI18N
        btn_cancelar_cliente.add(jLabel44);
        jLabel44.setBounds(0, 0, 40, 40);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Cancelar");
        btn_cancelar_cliente.add(jLabel45);
        jLabel45.setBounds(50, 0, 70, 40);

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
        jLabel47.setText("Salvar");
        btn_salvar_cliente.add(jLabel47);
        jLabel47.setBounds(50, 0, 70, 40);

        btn_salvar_cliente1.setBackground(new java.awt.Color(51, 152, 219));
        btn_salvar_cliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salvar_cliente1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salvar_cliente1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salvar_cliente1MouseExited(evt);
            }
        });
        btn_salvar_cliente1.setLayout(null);

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_done_outline_white_18dp.png"))); // NOI18N
        btn_salvar_cliente1.add(jLabel48);
        jLabel48.setBounds(10, 0, 40, 40);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Salvar");
        btn_salvar_cliente1.add(jLabel49);
        jLabel49.setBounds(50, 0, 70, 40);

        btn_salvar_cliente.add(btn_salvar_cliente1);
        btn_salvar_cliente1.setBounds(0, 0, 0, 0);

        javax.swing.GroupLayout pane_titulo_userLayout = new javax.swing.GroupLayout(pane_titulo_user);
        pane_titulo_user.setLayout(pane_titulo_userLayout);
        pane_titulo_userLayout.setHorizontalGroup(
            pane_titulo_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_titulo_userLayout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salvar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pane_titulo_userLayout.setVerticalGroup(
            pane_titulo_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_titulo_userLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pane_titulo_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salvar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tabela_de_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_de_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_de_clientesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabela_de_clientes);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btn_pesquisa.setBackground(new java.awt.Color(51, 152, 219));
        btn_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pesquisaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pesquisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pesquisaMouseExited(evt);
            }
        });
        btn_pesquisa.setLayout(null);

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_search_white_18dp.png"))); // NOI18N
        btn_pesquisa.add(jLabel50);
        jLabel50.setBounds(0, 0, 30, 30);

        btn_salvar_cliente3.setBackground(new java.awt.Color(51, 152, 219));
        btn_salvar_cliente3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salvar_cliente3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salvar_cliente3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salvar_cliente3MouseExited(evt);
            }
        });
        btn_salvar_cliente3.setLayout(null);

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_done_outline_white_18dp.png"))); // NOI18N
        btn_salvar_cliente3.add(jLabel52);
        jLabel52.setBounds(10, 0, 40, 40);

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Salvar");
        btn_salvar_cliente3.add(jLabel53);
        jLabel53.setBounds(50, 0, 70, 40);

        btn_pesquisa.add(btn_salvar_cliente3);
        btn_salvar_cliente3.setBounds(0, 0, 0, 0);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CPF", "Nome", " " }));

        pane_titulo_user1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Pesquisar Cliente");

        javax.swing.GroupLayout pane_titulo_user1Layout = new javax.swing.GroupLayout(pane_titulo_user1);
        pane_titulo_user1.setLayout(pane_titulo_user1Layout);
        pane_titulo_user1Layout.setHorizontalGroup(
            pane_titulo_user1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_titulo_user1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pane_titulo_user1Layout.setVerticalGroup(
            pane_titulo_user1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_titulo_user1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout telaCadastraClienteLayout = new javax.swing.GroupLayout(telaCadastraCliente);
        telaCadastraCliente.setLayout(telaCadastraClienteLayout);
        telaCadastraClienteLayout.setHorizontalGroup(
            telaCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane_titulo_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaCadastraClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(telaCadastraClienteLayout.createSequentialGroup()
                        .addComponent(btn_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(pane_titulo_user1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaCadastraClienteLayout.setVerticalGroup(
            telaCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastraClienteLayout.createSequentialGroup()
                .addComponent(pane_titulo_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(pane_titulo_user1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(telaCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(telaCadastraCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(telaCadastraCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nome_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_clienteActionPerformed

    private void btn_cancelar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_clienteMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_cancelar_clienteMouseClicked

    private void btn_cancelar_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_clienteMouseEntered
        // TODO add your handling code here:
        btn_cancelar_cliente.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_cancelar_clienteMouseEntered

    private void btn_cancelar_clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_clienteMouseExited
        // TODO add your handling code here:
        btn_cancelar_cliente.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_cancelar_clienteMouseExited

    private void btn_salvar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_clienteMouseClicked
        // TODO add your handling code here:
        Cliente novoCliente = new Cliente(txt_nome_cliente.getText(),txt_cpf_cliente.getText());
        clienteControler.criarNovoCliente(novoCliente);
    }//GEN-LAST:event_btn_salvar_clienteMouseClicked

    private void btn_salvar_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_clienteMouseEntered
        // TODO add your handling code here:
         btn_salvar_cliente.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_salvar_clienteMouseEntered

    private void btn_salvar_clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_clienteMouseExited
        // TODO add your handling code here:
          btn_salvar_cliente.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_salvar_clienteMouseExited

    private void btn_salvar_cliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_cliente1MouseClicked

    private void btn_salvar_cliente1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_cliente1MouseEntered

    private void btn_salvar_cliente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_cliente1MouseExited

    private void btn_salvar_cliente3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_cliente3MouseClicked

    private void btn_salvar_cliente3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente3MouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btn_salvar_cliente3MouseEntered

    private void btn_salvar_cliente3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente3MouseExited
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btn_salvar_cliente3MouseExited

    private void btn_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pesquisaMouseClicked

    private void btn_pesquisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisaMouseEntered
        // TODO add your handling code here:
        btn_pesquisa.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_pesquisaMouseEntered

    private void btn_pesquisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisaMouseExited
        // TODO add your handling code here:
        btn_pesquisa.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_pesquisaMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tabela_de_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_de_clientesMouseClicked
        if(this.caixa.getClienteVinculado() == null){
             int itemClicado = tabela_de_clientes.getSelectedRow();
        // TODO add your handling code here:
        new TelaEditarClientes(null,true,
                clienteControler.pegarTodosClientes().get(itemClicado),
                tabela_de_clientes,caixa,
                TelaDeCadastroDeCliente.this
        ).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Já possui um cliente vinculado\n"
                    + "caso queira trocar o cliente, contate o administrador\n"
                    + "para cancelar o caixa.","Alerta",JOptionPane.WARNING_MESSAGE);
        }
       
        
//        clienteControler.atualizarCliente(itemClicado, null);
    }//GEN-LAST:event_tabela_de_clientesMouseClicked

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
            java.util.logging.Logger.getLogger(TelaDeCadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDeCadastroDeCliente dialog = new TelaDeCadastroDeCliente(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_cancelar_cliente;
    private javax.swing.JPanel btn_pesquisa;
    private javax.swing.JPanel btn_salvar_cliente;
    private javax.swing.JPanel btn_salvar_cliente1;
    private javax.swing.JPanel btn_salvar_cliente3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_cpf_user;
    private javax.swing.JLabel lbl_nome_user;
    private javax.swing.JPanel pane_titulo_user;
    private javax.swing.JPanel pane_titulo_user1;
    private javax.swing.JTable tabela_de_clientes;
    private javax.swing.JPanel telaCadastraCliente;
    private javax.swing.JFormattedTextField txt_cpf_cliente;
    private javax.swing.JTextField txt_nome_cliente;
    // End of variables declaration//GEN-END:variables
}
