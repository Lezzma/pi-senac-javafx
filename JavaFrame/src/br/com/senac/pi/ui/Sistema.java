package br.com.senac.pi.ui;


import Controler.ControlerUsuarios;
import br.com.senac.pi.entidades.Produtos;
import br.com.senac.pi.entidades.Usuario;
import static br.com.senac.pi.repositorio.ProdutoRepositorio.listaProdutos;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Sistema extends javax.swing.JFrame {

    private DefaultTableModel model;


    static public Sistema telaPrincipal = new Sistema();
    CardLayout cardLayout;
    ControlerUsuarios controlerUsuarios = new ControlerUsuarios();
    List<Usuario> listaDeUsuarios = new ArrayList<>();
    
    public Sistema() {
        initComponents();
        cardLayout = (CardLayout) homeJpainel.getLayout();
        cardLayout.show(homeJpainel, "jpainelHome");
        listaDeUsuarios = controlerUsuarios.pegarUsuarios();
        
        model = (DefaultTableModel) lista_usuarios.getModel();
        popularTabelaUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        sideBar = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_novo_produto = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btn_novo_cliente = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btn_gerar_relatorio = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btn_sair = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_gerarPeido = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_frente_caixa = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        homeJpainel = new javax.swing.JPanel();
        jPainelHome = new javax.swing.JPanel();
        cadastrarProduto = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_cancelar_pedido = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btn_salvar_pedido = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        linkTabelaProdutos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        telaCadastraCliente = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_nome_user = new javax.swing.JLabel();
        txt_nome_user = new javax.swing.JTextField();
        lbl_rg_user = new javax.swing.JLabel();
        txt_rg_user = new javax.swing.JTextField();
        lbl_cpf_user = new javax.swing.JLabel();
        txt_cpf_user = new javax.swing.JFormattedTextField();
        lbl_email_user = new javax.swing.JLabel();
        txt_email_user = new javax.swing.JTextField();
        lbl_senha_user = new javax.swing.JLabel();
        txt_senha_user = new javax.swing.JPasswordField();
        lbl_confirm_senha_user = new javax.swing.JLabel();
        txt_confirm_senha_user = new javax.swing.JPasswordField();
        pane_titulo_user = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btn_cancelar_cliente = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btn_salvar_cliente = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lista_usuarios = new javax.swing.JTable();
        tela_frente_caixa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jPanel16 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(818, 474));
        setMinimumSize(new java.awt.Dimension(800, 474));
        setModalExclusionType(null);
        setSize(new java.awt.Dimension(600, 400));

        sideBar.setBackground(new java.awt.Color(41, 128, 185));
        sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(119, 183, 225));
        btn_home.setLayout(null);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_home_white_18dp_1.png"))); // NOI18N
        btn_home.add(jLabel18);
        jLabel18.setBounds(20, 0, 40, 40);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Home");
        btn_home.add(jLabel19);
        jLabel19.setBounds(60, 0, 140, 40);

        sideBar.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 45));

        btn_novo_produto.setBackground(new java.awt.Color(51, 152, 219));
        btn_novo_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_novo_produtoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_novo_produtoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_novo_produtoMouseExited(evt);
            }
        });
        btn_novo_produto.setLayout(null);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_add_shopping_cart_white_18dp.png"))); // NOI18N
        btn_novo_produto.add(jLabel26);
        jLabel26.setBounds(20, 0, 40, 40);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Novo Produto");
        btn_novo_produto.add(jLabel27);
        jLabel27.setBounds(60, 0, 140, 40);

        sideBar.add(btn_novo_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 45));

        btn_novo_cliente.setBackground(new java.awt.Color(51, 152, 219));
        btn_novo_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_novo_clienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_novo_clienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_novo_clienteMouseExited(evt);
            }
        });
        btn_novo_cliente.setLayout(null);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_add_circle_white_18dp_1.png"))); // NOI18N
        btn_novo_cliente.add(jLabel28);
        jLabel28.setBounds(20, 0, 40, 40);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Novo Cliente");
        btn_novo_cliente.add(jLabel29);
        jLabel29.setBounds(60, 0, 140, 40);

        sideBar.add(btn_novo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, 45));

        btn_gerar_relatorio.setBackground(new java.awt.Color(51, 152, 219));
        btn_gerar_relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gerar_relatorioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_gerar_relatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_gerar_relatorioMouseExited(evt);
            }
        });
        btn_gerar_relatorio.setLayout(null);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_trending_up_white_18dp.png"))); // NOI18N
        btn_gerar_relatorio.add(jLabel30);
        jLabel30.setBounds(20, 0, 40, 40);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Gerar Relatório");
        btn_gerar_relatorio.add(jLabel31);
        jLabel31.setBounds(60, 0, 140, 40);

        sideBar.add(btn_gerar_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 45));

        btn_sair.setBackground(new java.awt.Color(51, 152, 219));
        btn_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sairMouseExited(evt);
            }
        });
        btn_sair.setLayout(null);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_exit_to_app_white_18dp.png"))); // NOI18N
        btn_sair.add(jLabel34);
        jLabel34.setBounds(20, 0, 40, 40);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Sair");
        btn_sair.add(jLabel35);
        jLabel35.setBounds(60, 0, 140, 40);

        sideBar.add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 210, 45));
        sideBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 10));

        btn_gerarPeido.setBackground(new java.awt.Color(51, 152, 219));
        btn_gerarPeido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gerarPeidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_gerarPeidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_gerarPeidoMouseExited(evt);
            }
        });
        btn_gerarPeido.setLayout(null);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_shopping_cart_white_18dp.png"))); // NOI18N
        btn_gerarPeido.add(jLabel36);
        jLabel36.setBounds(20, 0, 40, 40);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Gerar Pedido");
        btn_gerarPeido.add(jLabel37);
        jLabel37.setBounds(60, 0, 140, 40);

        sideBar.add(btn_gerarPeido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Java Home");
        sideBar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 20));

        btn_frente_caixa.setBackground(new java.awt.Color(51, 152, 219));
        btn_frente_caixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_frente_caixaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_frente_caixaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_frente_caixaMouseExited(evt);
            }
        });
        btn_frente_caixa.setLayout(null);

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_attach_money_white_18dp.png"))); // NOI18N
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
        });
        btn_frente_caixa.add(jLabel40);
        jLabel40.setBounds(20, 0, 40, 40);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Caixa");
        btn_frente_caixa.add(jLabel41);
        jLabel41.setBounds(60, 0, 140, 40);

        sideBar.add(btn_frente_caixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 210, 45));

        homeJpainel.setBackground(new java.awt.Color(255, 255, 255));
        homeJpainel.setLayout(new java.awt.CardLayout());

        jPainelHome.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPainelHomeLayout = new javax.swing.GroupLayout(jPainelHome);
        jPainelHome.setLayout(jPainelHomeLayout);
        jPainelHomeLayout.setHorizontalGroup(
            jPainelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1127, Short.MAX_VALUE)
        );
        jPainelHomeLayout.setVerticalGroup(
            jPainelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        homeJpainel.add(jPainelHome, "jpainelHome");

        cadastrarProduto.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setName("Cadastro de Produto"); // NOI18N

        jLabel1.setText("*Descrição:");

        jLabel2.setText("*Código:");

        jLabel3.setText("*Preço:");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel10.setText("Campos com *, são obrigatórios");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPreco)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(44, 62, 80));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Novo Produto");

        btn_cancelar_pedido.setBackground(new java.awt.Color(51, 152, 219));
        btn_cancelar_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelar_pedidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelar_pedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelar_pedidoMouseExited(evt);
            }
        });
        btn_cancelar_pedido.setLayout(null);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_cancel_white_18dp.png"))); // NOI18N
        btn_cancelar_pedido.add(jLabel32);
        jLabel32.setBounds(0, 0, 40, 40);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Cancelar");
        btn_cancelar_pedido.add(jLabel33);
        jLabel33.setBounds(50, 0, 70, 40);

        btn_salvar_pedido.setBackground(new java.awt.Color(51, 152, 219));
        btn_salvar_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salvar_pedidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salvar_pedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salvar_pedidoMouseExited(evt);
            }
        });
        btn_salvar_pedido.setLayout(null);

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_done_outline_white_18dp.png"))); // NOI18N
        btn_salvar_pedido.add(jLabel38);
        jLabel38.setBounds(10, 0, 40, 40);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Salvar");
        btn_salvar_pedido.add(jLabel39);
        jLabel39.setBounds(50, 0, 70, 40);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salvar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salvar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cadastrarProdutoLayout = new javax.swing.GroupLayout(cadastrarProduto);
        cadastrarProduto.setLayout(cadastrarProdutoLayout);
        cadastrarProdutoLayout.setHorizontalGroup(
            cadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cadastrarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cadastrarProdutoLayout.setVerticalGroup(
            cadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarProdutoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        homeJpainel.add(cadastrarProduto, "telaCadastrarProdutos");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        linkTabelaProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        linkTabelaProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linkTabelaProdutos.setText("Produtos");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Preco", "Quantidade", "Estoque minimo", "Vendas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setDragEnabled(true);
        tabelaProdutos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaProdutosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(linkTabelaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(linkTabelaProdutos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1127, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homeJpainel.add(jPanel2, "card2");

        telaCadastraCliente.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_nome_user.setText("Nome:");

        txt_nome_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_userActionPerformed(evt);
            }
        });

        lbl_rg_user.setText("RG:");

        txt_rg_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rg_userActionPerformed(evt);
            }
        });

        lbl_cpf_user.setText("CPF:");

        try {
            txt_cpf_user.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbl_email_user.setText("E-mail:");

        lbl_senha_user.setText("Senha:");

        lbl_confirm_senha_user.setText("Confirmar senha:");

        txt_confirm_senha_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_confirm_senha_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_confirm_senha_userFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_rg_user)
                            .addComponent(lbl_nome_user)
                            .addComponent(lbl_cpf_user)
                            .addComponent(lbl_email_user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_senha_user))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_rg_user, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nome_user, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cpf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_senha_user, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_email_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_confirm_senha_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_confirm_senha_user, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(738, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome_user))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_rg_user)
                    .addComponent(txt_rg_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cpf_user)
                    .addComponent(txt_cpf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email_user)
                    .addComponent(txt_email_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_senha_user)
                    .addComponent(txt_senha_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_confirm_senha_user)
                    .addComponent(txt_confirm_senha_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pane_titulo_userLayout = new javax.swing.GroupLayout(pane_titulo_user);
        pane_titulo_user.setLayout(pane_titulo_userLayout);
        pane_titulo_userLayout.setHorizontalGroup(
            pane_titulo_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_titulo_userLayout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
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

        lista_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "RG", "CPF", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        lista_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_usuariosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(lista_usuarios);

        javax.swing.GroupLayout telaCadastraClienteLayout = new javax.swing.GroupLayout(telaCadastraCliente);
        telaCadastraCliente.setLayout(telaCadastraClienteLayout);
        telaCadastraClienteLayout.setHorizontalGroup(
            telaCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane_titulo_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaCadastraClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(telaCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(telaCadastraClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        telaCadastraClienteLayout.setVerticalGroup(
            telaCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastraClienteLayout.createSequentialGroup()
                .addComponent(pane_titulo_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(396, 396, 396)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(telaCadastraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(telaCadastraClienteLayout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(212, Short.MAX_VALUE)))
        );

        homeJpainel.add(telaCadastraCliente, "telaCadastraUsuarios");

        tela_frente_caixa.setBackground(new java.awt.Color(255, 255, 255));
        tela_frente_caixa.setMaximumSize(new java.awt.Dimension(500, 1220));
        tela_frente_caixa.setPreferredSize(new java.awt.Dimension(400, 450));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CÓDIGO DE BARRAS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel10.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(51, 153, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CODIGO");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(51, 153, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SUBTOTAL");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(51, 153, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("TOTAL RECEBIDO");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(51, 153, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TROCO");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2);

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList3);

        jPanel16.setBackground(new java.awt.Color(51, 153, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("TOTAL DO ITEM");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(51, 153, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("VALOR UNITÁRIO");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tela_frente_caixaLayout = new javax.swing.GroupLayout(tela_frente_caixa);
        tela_frente_caixa.setLayout(tela_frente_caixaLayout);
        tela_frente_caixaLayout.setHorizontalGroup(
            tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tela_frente_caixaLayout.setVerticalGroup(
            tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tela_frente_caixaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(tela_frente_caixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(tela_frente_caixaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        homeJpainel.add(tela_frente_caixa, "telaFrenteDeCaixa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1127, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(homeJpainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeJpainel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void attTabela() {
        model.setNumRows(0);
        for (Usuario p : listaDeUsuarios) {
            model.addRow(
                    new Object[]{
                        p.getNome(),
                        p.getRg(),
                        p.getCpf(),
                        p.getEmail()
                    });
        }
    }
    public void popularTabelaUsuarios(){
                
                 
                if (listaDeUsuarios.isEmpty()) {
                        Usuario testeUsuario = new Usuario();
                        testeUsuario.setNome("josé");
                        testeUsuario.setRg("502222227");
                        testeUsuario.setCpf("33333333333");
                        testeUsuario.setEmail("ppp@hotmail.com");
                        testeUsuario.setSenha("81776279");
                        listaDeUsuarios.add(testeUsuario);
                    }
                
                model.setNumRows(0);
                for (Usuario p : listaDeUsuarios) {
                        model.addRow(
                                new Object[]{ 
                                        p.getNome(),
                                        p.getRg(),
                                        p.getCpf(),
                                        p.getEmail()
                                    });
                        }
    }
/*==============================================================================
 ACÕES DO BUTOES, ALTERAR TELA, ABRIR NOVA JANELA E MAUSE HOVER.
 ==============================================================================*/
    private void tabelaProdutosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaProdutosAncestorAdded
        //        if (listaProdutos.isEmpty()) {
            //            Produtos testeProduto = new Produtos();
            //            testeProduto.setCodigo("123123");
            //            testeProduto.setNome("teste");
            //            testeProduto.setPreco(120);
            //            testeProduto.setQuantidade(1);
            //            testeProduto.setQuantidadeMin(0);
            //            testeProduto.setDisponivel("sim");
            //            listaProdutos.add(testeProduto);
            //
            //        }
        //        model.setNumRows(0);
        //        for (Produtos p : listaProdutos) {
            //            model.addRow(
                //                new Object[]{
                    //                    p.getCodigo(),
                    //                    p.getNome(),
                    //                    p.getPreco(),
                    //                    p.getQuantidade(),
                    //                    p.getQuantidadeMin(),
                    //                    p.getDisponivel()
                    //                });
            //            }
    }//GEN-LAST:event_tabelaProdutosAncestorAdded

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        // TODO add your handling code here:
        //DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
        //        String codigo = (String) model.getValueAt(tabelaProdutos.getSelectedRow(), 0);
        //        String nome = (String) model.getValueAt(tabelaProdutos.getSelectedRow(), 1);
        //        double preco = (double) model.getValueAt(tabelaProdutos.getSelectedRow(), 2);
        //        System.out.println("Código: " + codigo + "\n" + "Nome: " + nome + "\n" + "Preço: " + preco);
        //        EditarProduto editarProduto = new EditarProduto(codigo, nome, preco);
        //        editarProduto.setVisible(true);
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txt_nome_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_userActionPerformed

    private void txt_confirm_senha_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_confirm_senha_userFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirm_senha_userFocusGained

    private void txt_confirm_senha_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_confirm_senha_userFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirm_senha_userFocusLost

    private void txt_rg_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rg_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rg_userActionPerformed

    private void btn_novo_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_novo_produtoMouseClicked
        // TODO add your handling code here:
         cardLayout.show(homeJpainel, "telaCadastrarProdutos");
    }//GEN-LAST:event_btn_novo_produtoMouseClicked

    private void btn_novo_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_novo_clienteMouseClicked
        // TODO add your handling code here:
        cardLayout.show(homeJpainel, "telaCadastraUsuarios");
    }//GEN-LAST:event_btn_novo_clienteMouseClicked

    private void btn_gerar_relatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gerar_relatorioMouseClicked
        // TODO add your handling code here:
         new JanelaDoGrafico().setVisible(true);
    }//GEN-LAST:event_btn_gerar_relatorioMouseClicked

    private void btn_novo_produtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_novo_produtoMouseExited
        // TODO add your handling code here:
        
        btn_novo_produto.setBackground(new Color(51, 152, 219));//cor quando entra no botton
    }//GEN-LAST:event_btn_novo_produtoMouseExited

    private void btn_novo_produtoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_novo_produtoMouseEntered
        // TODO add your handling code here:
        btn_novo_produto.setBackground(new Color(119, 183, 225));//cor quando sai do botton
    }//GEN-LAST:event_btn_novo_produtoMouseEntered

    private void btn_novo_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_novo_clienteMouseEntered
        // TODO add your handling code here:
         btn_novo_cliente.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_novo_clienteMouseEntered

    private void btn_novo_clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_novo_clienteMouseExited
        // TODO add your handling code here:
        btn_novo_cliente.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_novo_clienteMouseExited

    private void btn_gerar_relatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gerar_relatorioMouseEntered
        // TODO add your handling code here:
        btn_gerar_relatorio.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_gerar_relatorioMouseEntered

    private void btn_gerar_relatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gerar_relatorioMouseExited
        // TODO add your handling code here:
        btn_gerar_relatorio.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_gerar_relatorioMouseExited

    private void btn_cancelar_pedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_pedidoMouseEntered
        // TODO add your handling code here:
         btn_cancelar_pedido.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_cancelar_pedidoMouseEntered

    private void btn_cancelar_pedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_pedidoMouseExited
        // TODO add your handling code here:
        btn_cancelar_pedido.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_cancelar_pedidoMouseExited

    private void btn_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseEntered
        // TODO add your handling code here:
         btn_sair.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_sairMouseEntered

    private void btn_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseExited
        // TODO add your handling code here:
        btn_sair.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_sairMouseExited

    private void btn_cancelar_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_pedidoMouseClicked
        // TODO add your handling code here:
         cardLayout.show(homeJpainel, "jpainelHome");
    }//GEN-LAST:event_btn_cancelar_pedidoMouseClicked

    private void btn_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseClicked
        // TODO add your handling code here:
         dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_sairMouseClicked

    private void btn_gerarPeidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gerarPeidoMouseClicked
        // TODO add your handling code here:
         new TelaDeCompra().setVisible(true);
    }//GEN-LAST:event_btn_gerarPeidoMouseClicked

    private void btn_gerarPeidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gerarPeidoMouseEntered
        // TODO add your handling code here:
         btn_gerarPeido.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_gerarPeidoMouseEntered

    private void btn_gerarPeidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gerarPeidoMouseExited
        // TODO add your handling code here:
        btn_gerarPeido.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_gerarPeidoMouseExited
    
    private void btn_salvar_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_pedidoMouseClicked
        // TODO add your handling code here:
//          String codigo, nome,disponivel;
//        double preco;
//        int quantidade, quantidadeMin;
//
//        //Validação de campos obrigatório
//        if (!"".equals(txtCodigo.getText())
//            && !"".equals(txtNome.getText())
//            && !"".equals(txtPreco.getText())) {
//
//            codigo = txtCodigo.getText();
//            nome = txtNome.getText();
//            preco = Double.parseDouble(txtPreco.getText());
//
//            Produtos novoProduto = new Produtos();
//            novoProduto.setCodigo(codigo);
//            novoProduto.setNome(nome);
//            novoProduto.setPreco(preco);
//            listaProdutos.add(novoProduto);
//
//            dispose();
//            telaPrincipal.attTabela();
//            //abre novamente a tela principal
//        }else{
//            JOptionPane.showMessageDialog(null,
//                "para criar um produtos todos os campos devem conter conteudo",
//                "Erro validação",
//                JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_btn_salvar_pedidoMouseClicked

    private void btn_salvar_pedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_pedidoMouseEntered
        // TODO add your handling code here:
        btn_salvar_pedido.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_salvar_pedidoMouseEntered

    private void btn_salvar_pedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_pedidoMouseExited
        // TODO add your handling code here:
        btn_salvar_pedido.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_salvar_pedidoMouseExited

    private void btn_cancelar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_clienteMouseClicked
        // TODO add your handling code here:
        cardLayout.show(homeJpainel, "jpainelHome");
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
        if(new ControlerUsuarios().criarUsuario(txt_nome_user.getText(),txt_rg_user.getText(),
                txt_cpf_user.getText(),txt_email_user.getText(),txt_senha_user.getText())){
                JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso");
                attTabela();
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

    private void btn_frente_caixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_frente_caixaMouseClicked
        // TODO add your handling code here:
        cardLayout.show(homeJpainel, "telaFrenteDeCaixa");
    }//GEN-LAST:event_btn_frente_caixaMouseClicked

    private void btn_frente_caixaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_frente_caixaMouseEntered
        // TODO add your handling code here:
        btn_frente_caixa.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_frente_caixaMouseEntered

    private void btn_frente_caixaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_frente_caixaMouseExited
        // TODO add your handling code here:
        btn_frente_caixa.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_frente_caixaMouseExited

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel40MouseEntered

    private void lista_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_usuariosMouseClicked
        // TODO add your handling code here:
        
        int userClicado = model.getRowCount()-1;
        new editarUsuario(this, rootPaneCheckingEnabled,listaDeUsuarios.get(userClicado)).setVisible(true);
    }//GEN-LAST:event_lista_usuariosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Sistema().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_cancelar_cliente;
    private javax.swing.JPanel btn_cancelar_pedido;
    private javax.swing.JPanel btn_frente_caixa;
    private javax.swing.JPanel btn_gerarPeido;
    private javax.swing.JPanel btn_gerar_relatorio;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_novo_cliente;
    private javax.swing.JPanel btn_novo_produto;
    private javax.swing.JPanel btn_sair;
    private javax.swing.JPanel btn_salvar_cliente;
    private javax.swing.JPanel btn_salvar_pedido;
    private javax.swing.JPanel cadastrarProduto;
    private javax.swing.JPanel homeJpainel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPainelHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_confirm_senha_user;
    private javax.swing.JLabel lbl_cpf_user;
    private javax.swing.JLabel lbl_email_user;
    private javax.swing.JLabel lbl_nome_user;
    private javax.swing.JLabel lbl_rg_user;
    private javax.swing.JLabel lbl_senha_user;
    private javax.swing.JLabel linkTabelaProdutos;
    private javax.swing.JTable lista_usuarios;
    private javax.swing.JPanel pane_titulo_user;
    private javax.swing.JPanel sideBar;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JPanel telaCadastraCliente;
    private javax.swing.JPanel tela_frente_caixa;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JPasswordField txt_confirm_senha_user;
    private javax.swing.JFormattedTextField txt_cpf_user;
    private javax.swing.JTextField txt_email_user;
    private javax.swing.JTextField txt_nome_user;
    private javax.swing.JTextField txt_rg_user;
    private javax.swing.JPasswordField txt_senha_user;
    // End of variables declaration//GEN-END:variables
}
