/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi.View;

import br.com.senac.pi.model.entidades.Carrinho;
import br.com.senac.pi.model.entidades.Cliente;
import br.com.senac.pi.model.entidades.Produtos;
import br.com.senac.pi.model.entidades.Usuario;
import br.com.senac.pi.model.entidades.Venda;
import br.com.senac.pi.model.Dao.DaoCarrinho;
import br.com.senac.pi.model.Dao.DaoVendas;
import br.com.senac.pi.View.janelas.atalhos.TelaDeCadastroDeCliente;
import br.com.senac.pi.View.janelas.atalhos.TelaPesquisaProdutoFrenteDeCaixa;
import br.com.senac.pi.controllers.ControllerTabelaCarrinho;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jrneto
 */
public class TelaFrenteDeCaixa extends javax.swing.JFrame {

    private DaoCarrinho daoCarrinho;
    private DaoVendas daoVendas;

    private Cliente clienteVinculado;

    private Usuario usuarioLogado;
    private ControllerTabelaCarrinho repositorioCarrinho;
    
    double total = 0;
    double valorRecebido = 0;

    /**
     * Creates new form TelaFrenteDeCaixa
     * @param usuario
     */
    public TelaFrenteDeCaixa(Usuario usuario) {
        initComponents();

        //inicia a tela de frente de caixa em tela cheia
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        clienteVinculado = new Cliente();
        
        //init daos
        daoCarrinho = new DaoCarrinho();
        daoVendas = new DaoVendas();
        
        //pega o usuáiro atual 
        usuarioLogado = usuario;

        //responsavel por atualizar a tabela de carrinho
        repositorioCarrinho = new ControllerTabelaCarrinho(tabela_carrinho);
        repositorioCarrinho.atualizaTabela(daoCarrinho.getAll());

        //captura ações dos botões de atalho 
        //exemplo: f7,f8 e f9....
        capturaClickDoteclado();

        //frente de caixa sempre inicia com valor zerado
        ValorTotal.setText("0.0");

        //valida se tem cliente vinculado
        verificaTemCliente(null);

        //coloca o icone do sistema
        setIcon();
    }
    public Usuario getUsuarioLogado(){
        return usuarioLogado;
    }
    public Cliente getClienteVinculado() {
        return clienteVinculado;
    }

    public void setClienteVinculado(Cliente clienteVinculado) {
        this.clienteVinculado = clienteVinculado;
    }
    
    private void colocaValorTotal() {
        for (Produtos p : daoCarrinho.getAll()) {
            this.total += p.getPreco() * p.getQuantidadeVenda();
        }
        ValorTotal.setText(String.valueOf(this.total));

    }
  
    
    public void verificaTemCliente(Cliente cliente) {
        if (cliente == null) {
            txt_sem_cliente.setVisible(true);
            btn_realizarVenda.setVisible(false);
        } else {
            txt_sem_cliente.setVisible(false);
            btn_realizarVenda.setVisible(true);
        }
    }

   

    private void capturaClickDoteclado() {
        KeyboardFocusManager
                .getCurrentKeyboardFocusManager()
                .addKeyEventDispatcher(new KeyEventDispatcher() {

                    @Override
                    public boolean dispatchKeyEvent(KeyEvent ke) {
                        if (ke.getID() == ke.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_F7) {
                            try {
                                new TelaPesquisaProdutoFrenteDeCaixa(tabela_carrinho, ValorTotal).setVisible(true);
                                return true;
                            } catch (SQLException ex) {
                               throw new RuntimeException(ex);
                            }
                            
                        }
                        if (ke.getID() == ke.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_F8) {
                            try {
                                new TelaDeCadastroDeCliente(TelaFrenteDeCaixa.this, true, TelaFrenteDeCaixa.this).setVisible(true);
                            } catch (SQLException ex) {
                               throw new RuntimeException(ex);
                            }
                            return true;
                        }

                        if (ke.getID() == ke.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_F9) {
                            String senha = JOptionPane.showInputDialog("Digite a senha de administrador");
                            if (senha.equals("admin")) {
                                reiniciaFrenteDeCaixa();
                            }
                            return true;
                        }
                        return false;
                    }
                });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela_frente_caixa = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txt_codigo_barra = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_carrinho = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        ValorTotal = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txt_valor_recebido = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txt_troco = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_valor_unitario = new javax.swing.JLabel();
        btn_sair_frente_de_caixa = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_realizarVenda = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txt_sem_cliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tela_frente_caixa.setBackground(new java.awt.Color(255, 255, 255));
        tela_frente_caixa.setMaximumSize(new java.awt.Dimension(500, 1220));
        tela_frente_caixa.setPreferredSize(new java.awt.Dimension(400, 450));

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));

        txt_codigo_barra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txt_codigo_barra.setForeground(new java.awt.Color(255, 255, 255));
        txt_codigo_barra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_codigo_barra.setPreferredSize(new java.awt.Dimension(500, 150));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CÓDIGO DE BARRAS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_codigo_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tabela_carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
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
        tabela_carrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_carrinhoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_carrinho);

        jPanel10.setBackground(new java.awt.Color(51, 153, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Lista de Produtos");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(51, 153, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SUBTOTAL");

        ValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        ValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        ValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("R$");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(51, 153, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("TOTAL RECEBIDO");

        txt_valor_recebido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_valor_recebido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_valor_recebido.setText("0.00");
        txt_valor_recebido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_valor_recebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valor_recebidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_valor_recebido))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_valor_recebido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(51, 153, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TROCO");

        txt_troco.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txt_troco.setForeground(new java.awt.Color(255, 255, 255));
        txt_troco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 226, Short.MAX_VALUE))
                    .addComponent(txt_troco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_troco, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(51, 153, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("TOTAL DO ITEM");

        txt_quantidade.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txt_quantidade.setForeground(new java.awt.Color(255, 255, 255));
        txt_quantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(51, 153, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("VALOR UNITÁRIO");

        txt_valor_unitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txt_valor_unitario.setForeground(new java.awt.Color(255, 255, 255));
        txt_valor_unitario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_valor_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_valor_unitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_sair_frente_de_caixa.setBackground(new java.awt.Color(51, 152, 219));
        btn_sair_frente_de_caixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sair_frente_de_caixaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sair_frente_de_caixaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sair_frente_de_caixaMouseExited(evt);
            }
        });
        btn_sair_frente_de_caixa.setLayout(null);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_exit_to_app_white_18dp.png"))); // NOI18N
        btn_sair_frente_de_caixa.add(jLabel34);
        jLabel34.setBounds(20, 0, 40, 40);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Sair");
        btn_sair_frente_de_caixa.add(jLabel35);
        jLabel35.setBounds(60, 0, 140, 40);

        jLabel1.setText("F7 - Pesquisa Poduto");

        jLabel2.setText("F8 - Vincular/Pesquisa/Cadastra Cliente");

        btn_realizarVenda.setBackground(new java.awt.Color(102, 255, 102));
        btn_realizarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_realizarVendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_realizarVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_realizarVendaMouseExited(evt);
            }
        });
        btn_realizarVenda.setLayout(null);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_shopping_cart_white_18dp.png"))); // NOI18N
        btn_realizarVenda.add(jLabel36);
        jLabel36.setBounds(20, 0, 40, 40);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Realizar Venda");
        btn_realizarVenda.add(jLabel37);
        jLabel37.setBounds(60, 0, 140, 40);

        txt_sem_cliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_sem_cliente.setForeground(new java.awt.Color(255, 0, 51));
        txt_sem_cliente.setText("Vincule um cliente para vender");

        jLabel3.setText("F9 - Cancelar Caixa");

        javax.swing.GroupLayout tela_frente_caixaLayout = new javax.swing.GroupLayout(tela_frente_caixa);
        tela_frente_caixa.setLayout(tela_frente_caixaLayout);
        tela_frente_caixaLayout.setHorizontalGroup(
            tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(130, 493, Short.MAX_VALUE)))
                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela_frente_caixaLayout.createSequentialGroup()
                        .addGap(0, 136, Short.MAX_VALUE)
                        .addComponent(btn_realizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sair_frente_de_caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(txt_sem_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(825, Short.MAX_VALUE)))
        );
        tela_frente_caixaLayout.setVerticalGroup(
            tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)))
                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_sair_frente_de_caixa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_realizarVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(txt_sem_cliente)
                    .addContainerGap(675, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1226, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(tela_frente_caixa, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(tela_frente_caixa, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sair_frente_de_caixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sair_frente_de_caixaMouseClicked
        //quando a frente de caixa é fechado, lista do repositorioCarrinho é zerada
       // dispose();
        System.exit(0);
        //new Login().setVisible(true);
//        int reply = JOptionPane.showConfirmDialog(null,
//                "Deseja realmente sair do sistema",
//                "Fechar sistema",
//                JOptionPane.YES_NO_OPTION);
//
//        if (reply == JOptionPane.YES_OPTION) {
//            System.exit(0);
//        }
        //fecha tela de frente de caixa
        //abre a tela de login
        
    }//GEN-LAST:event_btn_sair_frente_de_caixaMouseClicked

    private void btn_sair_frente_de_caixaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sair_frente_de_caixaMouseEntered
        // TODO add your handling code here:
        btn_sair_frente_de_caixa.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_sair_frente_de_caixaMouseEntered

    private void btn_sair_frente_de_caixaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sair_frente_de_caixaMouseExited
        // TODO add your handling code here:
        btn_sair_frente_de_caixa.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_sair_frente_de_caixaMouseExited

    private void btn_realizarVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_realizarVendaMouseClicked
        // TODO add your handling code here:
        Venda vendaRealizada = new Venda();
        Carrinho carrinho = new Carrinho(daoCarrinho.getAll());
        //tira a quantidade de produtos do estoque quando a venda é realizada
        for(Produtos p: carrinho.getAll()){
            p.setQuantidadeEstoque(p.getQuantidadeEstoque()-p.getQuantidadeVenda());
        }
        
        vendaRealizada.setCliente(getClienteVinculado());
        vendaRealizada.setVendedor(usuarioLogado);
        vendaRealizada.setDiaDaCompra(Date.from(Instant.now()));
        vendaRealizada.setCarrinho(carrinho);
        vendaRealizada.setTotal_pago(Double.parseDouble(ValorTotal.getText()));

        colocaValorTotal();
        try {
            daoVendas.inserir(vendaRealizada);
            finalizaVenda(vendaRealizada);
        } catch (HeadlessException ex) {
            throw new RuntimeException(ex);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }//GEN-LAST:event_btn_realizarVendaMouseClicked

    private void finalizaVenda(Venda vendaRealizada) throws HeadlessException, SQLException {
        if (realizaPagamento()) {
            daoVendas.inserir(vendaRealizada);
            if (!daoVendas.getAll().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Venda Realizada com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                reiniciaFrenteDeCaixa();
            }
        } else {
            this.total = 0;
        }
    }

    private void reiniciaFrenteDeCaixa() {
        //limpa o carrinho de compras
        daoCarrinho.limpaCarrinho();
        repositorioCarrinho.atualizaTabela(daoCarrinho.getAll());
        
        //zera o total
        total = 0;
        
        //tirando o ultimo cliente 
        //tirando os campos invalidos
        clienteVinculado = null;
        verificaTemCliente(clienteVinculado);
        
        limpaCampos();
    }

    private void limpaCampos() {
        ValorTotal.setText("0.0");
        txt_troco.setText("0.0");
        txt_codigo_barra.setText("");
        txt_quantidade.setText("");
        txt_valor_unitario.setText("");
    }

    //metodo responsavel por realizar a venda
    //recebe o valor do cliente
    //verifica se o valor recebido do cliente cobre o valor total recebido,
    //se sim, realiza o calculo responsavel por emitir o troco
    //caso contratio não realiza o calculo e informa ao vendedor que falta dinheiro
    public boolean realizaPagamento() {

        valorRecebido = Double.parseDouble(txt_valor_recebido.getText());
        if (!daoCarrinho.getAll().isEmpty()) {
            if (valorRecebido >= total) {
                double troco = total - valorRecebido;
                txt_troco.setText(String.valueOf(Math.abs(troco)));

                JOptionPane.showMessageDialog(null,
                        "TROCO DO CLINETE: R$ " + String.valueOf(Math.abs(troco)),
                        "ATENÇÃO",
                        JOptionPane.WARNING_MESSAGE);

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Falta Dinheiro", "Não é permitido", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Carrinho esta vázio", "Não é permitido", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

    }
    private void btn_realizarVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_realizarVendaMouseEntered
        // TODO add your handling code here:
        btn_realizarVenda.setBackground(new Color(0, 204, 0));//Cor quando entra no botton
    }//GEN-LAST:event_btn_realizarVendaMouseEntered

    private void btn_realizarVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_realizarVendaMouseExited
        // TODO add your handling code here:
        btn_realizarVenda.setBackground(new Color(102, 255, 102));//cor quando sai do botton
    }//GEN-LAST:event_btn_realizarVendaMouseExited

    private void tabela_carrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_carrinhoMouseClicked
        // TODO add your handling code here:
        int indexItem = tabela_carrinho.getSelectedRow();
        Produtos produtoCliecado = daoCarrinho.getAll().get(indexItem);
        txt_codigo_barra.setText(produtoCliecado.getCodigo());
        txt_quantidade.setText(String.valueOf(produtoCliecado.getQuantidadeVenda()));
        txt_valor_unitario.setText(String.valueOf(produtoCliecado.getPreco()));

    }//GEN-LAST:event_tabela_carrinhoMouseClicked

    private void txt_valor_recebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valor_recebidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valor_recebidoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFrenteDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFrenteDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFrenteDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFrenteDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFrenteDeCaixa(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ValorTotal;
    private javax.swing.JPanel btn_realizarVenda;
    private javax.swing.JPanel btn_sair_frente_de_caixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela_carrinho;
    private javax.swing.JPanel tela_frente_caixa;
    private javax.swing.JLabel txt_codigo_barra;
    private javax.swing.JLabel txt_quantidade;
    private javax.swing.JLabel txt_sem_cliente;
    private javax.swing.JLabel txt_troco;
    private javax.swing.JTextField txt_valor_recebido;
    private javax.swing.JLabel txt_valor_unitario;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }
}
