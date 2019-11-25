package br.com.senac.pi.View;

import br.com.senac.pi.controllers.ControlerUsuarios;
import br.com.senac.pi.controllers.ControllerRelatorio;
import br.com.senac.pi.model.entidades.Cliente;
import br.com.senac.pi.model.entidades.Produtos;
import br.com.senac.pi.model.entidades.Setor;
import br.com.senac.pi.model.entidades.Usuario;
import br.com.senac.pi.model.Dao.DaoProduto;
import br.com.senac.pi.controllers.ControllerTabelaProduto;
import br.com.senac.pi.controllers.ControllerTabelaRelatorio;
import br.com.senac.pi.controllers.ControllerTabelasUsuario;
import br.com.senac.pi.controllers.CotrollerTabelaCliente;
import br.com.senac.pi.model.Dao.DaoVendas;
import br.com.senac.pi.model.entidades.Venda;
import br.com.senac.pi.utils.Validacao;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sistema extends javax.swing.JFrame {

    private final DefaultTableModel model;
    private final DefaultTableModel modelTabelaProduto;

    //static public Sistema telaPrincipal;
    CardLayout cardLayout;
    ControlerUsuarios controlerUsuarios = new ControlerUsuarios();
    List<Usuario> listaDeUsuarios = new ArrayList<>();
    private final ControllerTabelasUsuario controllerTabelaUsuario;
    private final ControllerTabelaProduto controllerTabelaProduto;
    private final CotrollerTabelaCliente ControllerTabelaCliente;
    private final ControllerTabelaRelatorio controllerTabelaRelatorio;
    private final Validacao valida = new Validacao();
    private final Usuario usuarioLogado;

    private static TelaEditaProdutos telaEditaProdutos;
    private static TelaEditaUsuario telaEditaUsuario;

    private final ControllerRelatorio relatorioControler;

    public Sistema(Usuario user) throws SQLException {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.usuarioLogado = user;
        //telaPrincipal = new Sistema(user);
        controllerTabelaUsuario = new ControllerTabelasUsuario(tabela_de_usuarios);
        controllerTabelaProduto = new ControllerTabelaProduto(tabela_de_produtos);
        controllerTabelaRelatorio = new ControllerTabelaRelatorio(tabela_relatorio_venda);

        cardLayout = (CardLayout) homeJpainel.getLayout();
        cardLayout.show(homeJpainel, "jpainelHome");

        listaDeUsuarios = controlerUsuarios.pegarUsuarios();
        model = (DefaultTableModel) tabela_de_usuarios.getModel();

        //realizar cria usuarios de teste
        controllerTabelaUsuario.inserirEntidadeTeste(listaDeUsuarios);
       
        //inicializa o model da tabela produto para manipulas dentro do sitema
        modelTabelaProduto = (DefaultTableModel) tabela_de_produtos.getModel();
        //inserindo produto teste
        controllerTabelaProduto.buscaEntidades();
        //coloca os setores para acesso do usuario
        colocaSetoresEmTipoUsuario();
        //difini quais tela e botoes o usuario tera acesso
        //definiPoliticaDeAcessoDoUsuario(user);
        this.ControllerTabelaCliente = new CotrollerTabelaCliente(tabela_de_clientes);
        this.ControllerTabelaCliente.buscaEntidades();
        
        this.relatorioControler = new ControllerRelatorio(controllerTabelaRelatorio);
        relatorioControler.inserirVendaTeste();

        //tela De relatório prop
        txt_relatorio_total_mes.setEnabled(false);
        setIcon();

        
    }
    public Usuario getUsuarioLogado(){
        return usuarioLogado;
    }
    //coloca o icone so sistema

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.png")));
    }

    static void setTelaEditaProdutos(TelaEditaProdutos telaEditaProdutos) {
        Sistema.telaEditaProdutos = telaEditaProdutos;
    }

    static void setTelaEditaUsuario(TelaEditaUsuario telaEditaUsuario) {
        Sistema.telaEditaUsuario = telaEditaUsuario;
    }

    //=====================================================================
    //Esse metodos ira sair pois para iniciar o sistema somente com usuario
    //=====================================================================
    private void colocaSetoresEmTipoUsuario() {
        comboBox_tipo_usuario.addItem(Setor.admin);
        comboBox_tipo_usuario.addItem(Setor.vendas);
        comboBox_tipo_usuario.remove(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBar = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_home = new javax.swing.JLabel();
        btn_novo_produto = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btn_novo_cliente = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btn_consulta_clientes = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btn_gerar_relatorio = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btn_sair = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btn_frente_caixa = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        homeJpainel = new javax.swing.JPanel();
        cadastrarProduto = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo_produto = new javax.swing.JTextField();
        txt_preco_produto = new javax.swing.JTextField();
        txt_descricao_produto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_nome_produto = new javax.swing.JTextField();
        txt_marca_produto = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txt_quantidade_produto_estoque = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_cancelar_produto = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btn_salvar_produto = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabela_de_produtos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        telaCadastraUsuarios = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_nome_user = new javax.swing.JLabel();
        txt_nome_user = new javax.swing.JTextField();
        lbl_rg_user = new javax.swing.JLabel();
        lbl_cpf_user = new javax.swing.JLabel();
        txt_cpf_user = new javax.swing.JFormattedTextField();
        lbl_email_user = new javax.swing.JLabel();
        txt_email_user = new javax.swing.JTextField();
        lbl_senha_user = new javax.swing.JLabel();
        txt_senha_user = new javax.swing.JPasswordField();
        lbl_confirm_senha_user = new javax.swing.JLabel();
        txt_confirm_senha_user = new javax.swing.JPasswordField();
        lbl_confirm_senha_user1 = new javax.swing.JLabel();
        comboBox_tipo_usuario = new javax.swing.JComboBox();
        txt_rg_user = new javax.swing.JFormattedTextField();
        pane_titulo_user = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btn_cancelar_cliente = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btn_salvar_cliente = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabela_de_usuarios = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        telaDeClientes = new javax.swing.JPanel();
        telaCadastraCliente1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbl_nome_user1 = new javax.swing.JLabel();
        txt_nome_cliente = new javax.swing.JTextField();
        lbl_cpf_user1 = new javax.swing.JLabel();
        txt_cpf_cliente = new javax.swing.JFormattedTextField();
        txt_rua_novo_cliente = new javax.swing.JTextField();
        txt_num_novo_cliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_bairro_novo_cliente = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_email_novo_cliente = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        lbl_cpf_user2 = new javax.swing.JLabel();
        jComboBox_sexo = new javax.swing.JComboBox();
        lbl_cpf_user3 = new javax.swing.JLabel();
        jComboBox_estadocivil = new javax.swing.JComboBox();
        jLabel56 = new javax.swing.JLabel();
        txt_data_nascimento_novo_cliente = new javax.swing.JFormattedTextField();
        txt_complemento_novo_cliente = new javax.swing.JTextField();
        txt_tell_novo_cliente = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        txt_tell_novo_cliente1 = new javax.swing.JFormattedTextField();
        txt_cep_novo_cliente = new javax.swing.JFormattedTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabela_de_clientes = new javax.swing.JTable();
        btn_pesquisa = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        btn_salvar_cliente3 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        search_cpf = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        search_nome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_pesquisa_nome = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pane_titulo_user1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btn_salvar_cliente1 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        telaDeRelatorio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_relatorio_venda = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_relatorio_total_mes = new javax.swing.JLabel();
        mesChooser_relatorio = new com.toedter.calendar.JMonthChooser();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jPainelHome = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 474));
        setModalExclusionType(null);
        setSize(new java.awt.Dimension(600, 400));

        sideBar.setBackground(new java.awt.Color(41, 128, 185));
        sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(119, 183, 225));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
        });
        btn_home.setLayout(null);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_home_white_18dp_1.png"))); // NOI18N
        btn_home.add(jLabel18);
        jLabel18.setBounds(20, 0, 40, 40);

        txt_home.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_home.setForeground(new java.awt.Color(255, 255, 255));
        txt_home.setText("Home");
        btn_home.add(txt_home);
        txt_home.setBounds(60, 0, 140, 40);

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
        jLabel29.setText("Novo Usuário");
        btn_novo_cliente.add(jLabel29);
        jLabel29.setBounds(60, 0, 140, 40);

        sideBar.add(btn_novo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, 45));

        btn_consulta_clientes.setBackground(new java.awt.Color(51, 152, 219));
        btn_consulta_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_consulta_clientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_consulta_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_consulta_clientesMouseExited(evt);
            }
        });
        btn_consulta_clientes.setLayout(null);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_supervised_user_circle_white_18dp.png"))); // NOI18N
        btn_consulta_clientes.add(jLabel36);
        jLabel36.setBounds(20, 0, 40, 40);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Clientes");
        btn_consulta_clientes.add(jLabel37);
        jLabel37.setBounds(60, 0, 140, 40);

        sideBar.add(btn_consulta_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 45));

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

        sideBar.add(btn_gerar_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 45));

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

        sideBar.add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 210, 45));
        sideBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 10));

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

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/pi/View/logo_branco.png"))); // NOI18N
        sideBar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 190, 170));

        homeJpainel.setBackground(new java.awt.Color(255, 255, 255));
        homeJpainel.setMaximumSize(new java.awt.Dimension(926, 715));
        homeJpainel.setPreferredSize(new java.awt.Dimension(926, 715));
        homeJpainel.setLayout(new java.awt.CardLayout());

        cadastrarProduto.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setName("Cadastro de Produto"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Descrição:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("*Código:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("*Quantidade em estoque");

        txt_preco_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_preco_produtoActionPerformed(evt);
            }
        });

        jLabel10.setText("Campos com *, são obrigatórios");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setText("Marca");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setText("*Nome");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel50.setText("*Preço:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_descricao_produto))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nome_produto)
                            .addComponent(txt_codigo_produto))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_quantidade_produto_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel50))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_marca_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_preco_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_preco_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_marca_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_quantidade_produto_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_descricao_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(44, 62, 80));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Novo Produto");

        btn_cancelar_produto.setBackground(new java.awt.Color(51, 152, 219));
        btn_cancelar_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelar_produtoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelar_produtoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelar_produtoMouseExited(evt);
            }
        });
        btn_cancelar_produto.setLayout(null);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_cancel_white_18dp.png"))); // NOI18N
        btn_cancelar_produto.add(jLabel32);
        jLabel32.setBounds(10, 0, 40, 40);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Cancelar");
        btn_cancelar_produto.add(jLabel33);
        jLabel33.setBounds(50, 0, 70, 40);

        btn_salvar_produto.setBackground(new java.awt.Color(51, 152, 219));
        btn_salvar_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salvar_produtoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salvar_produtoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salvar_produtoMouseExited(evt);
            }
        });
        btn_salvar_produto.setLayout(null);

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_done_outline_white_18dp.png"))); // NOI18N
        btn_salvar_produto.add(jLabel38);
        jLabel38.setBounds(10, 0, 40, 40);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Salvar");
        btn_salvar_produto.add(jLabel39);
        jLabel39.setBounds(50, 0, 70, 40);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salvar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_salvar_produto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cancelar_produto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela_de_produtos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabela_de_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Qtd"
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
        tabela_de_produtos.setToolTipText("");
        tabela_de_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_de_produtosMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tabela_de_produtos);

        jButton3.setText("Pesquisar");

        javax.swing.GroupLayout cadastrarProdutoLayout = new javax.swing.GroupLayout(cadastrarProduto);
        cadastrarProduto.setLayout(cadastrarProdutoLayout);
        cadastrarProdutoLayout.setHorizontalGroup(
            cadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cadastrarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrarProdutoLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cadastrarProdutoLayout.createSequentialGroup()
                        .addGroup(cadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        cadastrarProdutoLayout.setVerticalGroup(
            cadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarProdutoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        homeJpainel.add(cadastrarProduto, "telaCadastrarProdutos");

        telaCadastraUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        telaCadastraUsuarios.setPreferredSize(new java.awt.Dimension(1136, 715));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_nome_user.setText("*Nome:");

        txt_nome_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_userActionPerformed(evt);
            }
        });

        lbl_rg_user.setText("*RG:");

        lbl_cpf_user.setText("*CPF:");

        try {
            txt_cpf_user.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbl_email_user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_email_user.setText("*E-mail:");

        lbl_senha_user.setText("*Senha:");

        lbl_confirm_senha_user.setText("*Confirmar senha:");

        txt_confirm_senha_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_confirm_senha_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_confirm_senha_userFocusLost(evt);
            }
        });

        lbl_confirm_senha_user1.setText("*Tipo de usuario");

        comboBox_tipo_usuario.setToolTipText("Selecione\n");

        try {
            txt_rg_user.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_rg_user)
                            .addComponent(lbl_nome_user)
                            .addComponent(lbl_cpf_user)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_confirm_senha_user1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_nome_user)
                            .addComponent(txt_cpf_user)
                            .addComponent(txt_rg_user))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_email_user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_senha_user)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lbl_confirm_senha_user, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_email_user)
                                    .addComponent(txt_senha_user)
                                    .addComponent(txt_confirm_senha_user))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(comboBox_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nome_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome_user))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_rg_user)
                            .addComponent(txt_rg_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cpf_user)
                            .addComponent(txt_cpf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(lbl_email_user)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_senha_user)
                            .addGap(27, 27, 27)
                            .addComponent(lbl_confirm_senha_user))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(txt_email_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_senha_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_confirm_senha_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_confirm_senha_user1)
                    .addComponent(comboBox_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pane_titulo_user.setBackground(new java.awt.Color(44, 62, 80));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Novo Usuário");

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
        jLabel44.setBounds(10, 0, 40, 40);

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
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_salvar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela_de_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "RG", "CPF", "Setor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_de_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_de_usuariosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabela_de_usuarios);

        jButton2.setText("Pesquisar");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "CPF" }));

        javax.swing.GroupLayout telaCadastraUsuariosLayout = new javax.swing.GroupLayout(telaCadastraUsuarios);
        telaCadastraUsuarios.setLayout(telaCadastraUsuariosLayout);
        telaCadastraUsuariosLayout.setHorizontalGroup(
            telaCadastraUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastraUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaCadastraUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(telaCadastraUsuariosLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(375, 375, 375)))
                .addContainerGap())
            .addComponent(pane_titulo_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaCadastraUsuariosLayout.setVerticalGroup(
            telaCadastraUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastraUsuariosLayout.createSequentialGroup()
                .addComponent(pane_titulo_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaCadastraUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        homeJpainel.add(telaCadastraUsuarios, "telaCadastraUsuarios");

        telaDeClientes.setBackground(new java.awt.Color(255, 255, 255));

        telaCadastraCliente1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_nome_user1.setText("*Nome:");

        txt_nome_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_clienteActionPerformed(evt);
            }
        });

        lbl_cpf_user1.setText("*CPF:");

        try {
            txt_cpf_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txt_rua_novo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rua_novo_clienteActionPerformed(evt);
            }
        });

        jLabel13.setText("Rua");

        jLabel15.setText("*CEP");

        jLabel16.setText("*Numero");

        jLabel17.setText("Complemento");

        txt_bairro_novo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bairro_novo_clienteActionPerformed(evt);
            }
        });

        jLabel23.setText("Bairro");

        jLabel25.setText("Tell");

        txt_email_novo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_email_novo_clienteActionPerformed(evt);
            }
        });

        jLabel55.setText("*Email");

        lbl_cpf_user2.setText("*Sexo");

        jComboBox_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        jComboBox_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_sexoActionPerformed(evt);
            }
        });

        lbl_cpf_user3.setText("Estado civil");

        jComboBox_estadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casado", "Solteiro", "Viuvo" }));

        jLabel56.setText("Data de nascimento");

        try {
            txt_data_nascimento_novo_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_data_nascimento_novo_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_complemento_novo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_complemento_novo_clienteActionPerformed(evt);
            }
        });

        try {
            txt_tell_novo_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel49.setText("Celular");

        try {
            txt_tell_novo_cliente1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txt_cep_novo_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nome_user1)
                    .addComponent(lbl_cpf_user1)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tell_novo_cliente)
                            .addComponent(txt_cpf_cliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tell_novo_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_cpf_user2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_cpf_user3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_estadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_nome_cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13))
                    .addComponent(jLabel55)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_rua_novo_cliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_email_novo_cliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_cep_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_data_nascimento_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txt_num_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_complemento_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_bairro_novo_cliente))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_num_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txt_complemento_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_bairro_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_data_nascimento_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cep_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(181, 181, 181))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel55)
                                .addComponent(txt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_nome_user1)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_rua_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel49)))
                        .addGap(17, 17, 17))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_cpf_user1))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_cpf_user2)
                        .addComponent(jComboBox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(lbl_cpf_user3)
                    .addComponent(jComboBox_estadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tell_novo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tell_novo_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180))
        );

        tabela_de_clientes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tabela_de_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data De Nascimento", "Telefone", "Sexo", "Estado civil", "Email", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        jScrollPane8.setViewportView(tabela_de_clientes);

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

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_search_white_18dp.png"))); // NOI18N
        btn_pesquisa.add(jLabel51);
        jLabel51.setBounds(0, 0, 30, 20);

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pesquisar");
        btn_pesquisa.add(jLabel7);
        jLabel7.setBounds(30, 6, 70, 10);

        try {
            search_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CPF");

        search_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_nomeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("Nome");

        btn_pesquisa_nome.setBackground(new java.awt.Color(51, 152, 219));
        btn_pesquisa_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pesquisa_nomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pesquisa_nomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pesquisa_nomeMouseExited(evt);
            }
        });
        btn_pesquisa_nome.setLayout(null);

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones-ui/baseline_search_white_18dp.png"))); // NOI18N
        btn_pesquisa_nome.add(jLabel54);
        jLabel54.setBounds(0, 0, 30, 18);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pesquisar");
        btn_pesquisa_nome.add(jLabel11);
        jLabel11.setBounds(30, 0, 70, 20);

        javax.swing.GroupLayout telaCadastraCliente1Layout = new javax.swing.GroupLayout(telaCadastraCliente1);
        telaCadastraCliente1.setLayout(telaCadastraCliente1Layout);
        telaCadastraCliente1Layout.setHorizontalGroup(
            telaCadastraCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastraCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaCadastraCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaCadastraCliente1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pesquisa_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(telaCadastraCliente1Layout.createSequentialGroup()
                        .addGroup(telaCadastraCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        telaCadastraCliente1Layout.setVerticalGroup(
            telaCadastraCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCadastraCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaCadastraCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_pesquisa_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaCadastraCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaCadastraCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(telaCadastraCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
        );

        pane_titulo_user1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Novo Cliente");

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salvar");
        btn_salvar_cliente1.add(jLabel6);
        jLabel6.setBounds(50, 0, 60, 40);

        javax.swing.GroupLayout pane_titulo_user1Layout = new javax.swing.GroupLayout(pane_titulo_user1);
        pane_titulo_user1.setLayout(pane_titulo_user1Layout);
        pane_titulo_user1Layout.setHorizontalGroup(
            pane_titulo_user1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_titulo_user1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_salvar_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pane_titulo_user1Layout.setVerticalGroup(
            pane_titulo_user1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_titulo_user1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pane_titulo_user1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout telaDeClientesLayout = new javax.swing.GroupLayout(telaDeClientes);
        telaDeClientes.setLayout(telaDeClientesLayout);
        telaDeClientesLayout.setHorizontalGroup(
            telaDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane_titulo_user1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(telaCadastraCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        telaDeClientesLayout.setVerticalGroup(
            telaDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDeClientesLayout.createSequentialGroup()
                .addComponent(pane_titulo_user1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telaCadastraCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        homeJpainel.add(telaDeClientes, "telaDeCleintes");

        telaDeRelatorio.setBackground(new java.awt.Color(255, 255, 255));

        tabela_relatorio_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código da venda", "Cliente", "Vendedor", "Data da venda", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
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
        tabela_relatorio_venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_relatorio_vendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_relatorio_venda);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_relatorio_total_mes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_relatorio_total_mes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_relatorio_total_mes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Total do mês");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(mesChooser_relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_relatorio_total_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_relatorio_total_mes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mesChooser_relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout telaDeRelatorioLayout = new javax.swing.GroupLayout(telaDeRelatorio);
        telaDeRelatorio.setLayout(telaDeRelatorioLayout);
        telaDeRelatorioLayout.setHorizontalGroup(
            telaDeRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDeRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaDeRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        telaDeRelatorioLayout.setVerticalGroup(
            telaDeRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDeRelatorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        homeJpainel.add(telaDeRelatorio, "telaDeRelatorio");

        jPainelHome.setBackground(new java.awt.Color(255, 255, 255));
        jPainelHome.setMaximumSize(null);

        javax.swing.GroupLayout jPainelHomeLayout = new javax.swing.GroupLayout(jPainelHome);
        jPainelHome.setLayout(jPainelHomeLayout);
        jPainelHomeLayout.setHorizontalGroup(
            jPainelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 952, Short.MAX_VALUE)
        );
        jPainelHomeLayout.setVerticalGroup(
            jPainelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );

        homeJpainel.add(jPainelHome, "jpainelHome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(951, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(209, 209, 209)
                    .addComponent(homeJpainel, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeJpainel, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //repopula tabela

    private void txt_preco_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_preco_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_preco_produtoActionPerformed

    private void txt_nome_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_userActionPerformed

    private void txt_confirm_senha_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_confirm_senha_userFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirm_senha_userFocusGained

    private void txt_confirm_senha_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_confirm_senha_userFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirm_senha_userFocusLost

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

        cardLayout.show(homeJpainel, "telaDeRelatorio");
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

    private void btn_cancelar_produtoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_produtoMouseEntered
        // TODO add your handling code here:
        btn_cancelar_produto.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_cancelar_produtoMouseEntered

    private void btn_cancelar_produtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_produtoMouseExited
        // TODO add your handling code here:
        btn_cancelar_produto.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_cancelar_produtoMouseExited

    private void btn_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseEntered
        // TODO add your handling code here:
        btn_sair.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_sairMouseEntered

    private void btn_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseExited
        // TODO add your handling code here:
        btn_sair.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_sairMouseExited

    private void btn_cancelar_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_produtoMouseClicked
        // TODO add your handling code here:
        cardLayout.show(homeJpainel, "jpainelHome");
    }//GEN-LAST:event_btn_cancelar_produtoMouseClicked

    private void btn_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseClicked
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_sairMouseClicked

    private void btn_salvar_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_produtoMouseClicked
        // TODO add your handling code here:
     
             //array responsavel por armazena todos os erros
            List<String> erros = new ArrayList<>();

            //variavel responsavel por criar a estrings de erros
            StringBuilder string = new StringBuilder();
            Produtos produtoNovo = new Produtos();
            
                try{
                    produtoNovo = colocaValoresNoProduto();
                    erros = valida.validaProdutos(produtoNovo);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "- Preço é obrigatório ","Campo invalido",JOptionPane.INFORMATION_MESSAGE);
                }
                
            
            
        try {
            //metodos responsavel por verificar se existe erros
            //se existir, ele coloca ele concatena cada erros
            //a uma unica string
            //caso contrário, salva o novo produto
            verificaErrosEsalva(erros, string, produtoNovo);
        } catch (NumberFormatException ex) {
            System.out.println("Erro na formatação de numero");
        } catch (HeadlessException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Erro de banco de dados: "+ex.getMessage());
        }
    }//GEN-LAST:event_btn_salvar_produtoMouseClicked

    private void verificaErrosEsalva(List<String> erros, StringBuilder string, Produtos produtoNovo) throws NumberFormatException, HeadlessException, SQLException {
        if (!erros.isEmpty()) {
            erros.stream().forEach((s) -> {
                StringBuilder append = string.append(s).append("\n");
            });
            JOptionPane.showMessageDialog(null, string.toString(), "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            LimpaCampos();
            salvaNovoProduto(produtoNovo);
        }
    }

    private void LimpaCampos() {
        txt_codigo_produto.setText("");
        txt_marca_produto.setText("");
        txt_nome_produto.setText("");
        txt_descricao_produto.setText("");
        txt_preco_produto.setText("");
        txt_marca_produto.setText("");
        txt_quantidade_produto_estoque.setValue(0);
    }

    private Produtos colocaValoresNoProduto() throws NumberFormatException {
        Produtos produtoNovo;
        produtoNovo = new Produtos(
                txt_codigo_produto.getText(),
                txt_nome_produto.getText(),
                txt_marca_produto.getText(),
                txt_descricao_produto.getText(),
                (int) txt_quantidade_produto_estoque.getValue(),
                Double.parseDouble(txt_preco_produto.getText()));
        return produtoNovo;
    }

    private void salvaNovoProduto(Produtos produtoNovo) throws NumberFormatException, HeadlessException, SQLException {
        DaoProduto dao = new DaoProduto();
        dao.inserir(produtoNovo);
        controllerTabelaProduto.atualizaTabela(dao.getAll());
        JOptionPane.showMessageDialog(null, "Sucesso!", "Produto inserido", JOptionPane.INFORMATION_MESSAGE);
    }

    private void btn_salvar_produtoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_produtoMouseEntered
        // TODO add your handling code here:
        btn_salvar_produto.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_salvar_produtoMouseEntered

    private void btn_salvar_produtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_produtoMouseExited
        // TODO add your handling code here:
        btn_salvar_produto.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_salvar_produtoMouseExited

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
      List<String> erros = new ArrayList<>();
      StringBuilder todosErros = new StringBuilder();
        Usuario novoUsuario = new Usuario();
                 
            novoUsuario.setNome(txt_nome_user.getText());
            novoUsuario.setEmail(txt_email_user.getText());
            novoUsuario.setRg(txt_rg_user.getText());
            novoUsuario.setCpf(txt_cpf_user.getText());
            novoUsuario.setSenha(txt_senha_user.getText());
            novoUsuario.setSetor((Setor) comboBox_tipo_usuario.getSelectedItem());
           erros = valida.validaUsuarios(novoUsuario);
           if(!erros.isEmpty()){
               erros.forEach(erro -> {
                   todosErros.append(erro+"\n");
               });
               
               JOptionPane.showMessageDialog(null, todosErros.toString(), "Campos invalidos", JOptionPane.WARNING_MESSAGE);
           }else{
                if (ControlerUsuarios.criarUsuario(novoUsuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso");
                    controllerTabelaUsuario.atualizaTabela(listaDeUsuarios);
                }
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
        dispose();
        new TelaFrenteDeCaixa(usuarioLogado).setVisible(true);
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

    private void tabela_de_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_de_usuariosMouseClicked
        // TODO add your handling code here:

        int userClicado = tabela_de_usuarios.getSelectedRow();
        if (telaEditaUsuario == null) {
            if (evt.getClickCount() == 2) {
                int produtoClicado = tabela_de_produtos.getSelectedRow();
                Sistema.telaEditaUsuario = new TelaEditaUsuario(controlerUsuarios.pegarUsuarios().get(userClicado), tabela_de_usuarios);
                Sistema.telaEditaUsuario.setVisible(true);
            }
        }

    }//GEN-LAST:event_tabela_de_usuariosMouseClicked

    private void tabela_de_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_de_produtosMouseClicked
        // TODO add your handling code here:

        if (telaEditaProdutos == null) {
            if (evt.getClickCount() == 2) {
                int produtoClicado = tabela_de_produtos.getSelectedRow();
                try {
                    telaEditaProdutos = new TelaEditaProdutos(controllerTabelaProduto.buscaEntidadeClicada(produtoClicado), tabela_de_produtos);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                telaEditaProdutos.setVisible(true);
            }
        }

    }//GEN-LAST:event_tabela_de_produtosMouseClicked

    private void btn_consulta_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consulta_clientesMouseClicked
        // TODO add your handling code here:
        cardLayout.show(homeJpainel, "telaDeCleintes");
    }//GEN-LAST:event_btn_consulta_clientesMouseClicked

    private void btn_consulta_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consulta_clientesMouseEntered
        // TODO add your handling code here:
        btn_consulta_clientes.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_consulta_clientesMouseEntered

    private void btn_consulta_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consulta_clientesMouseExited
        // TODO add your handling code here:
        btn_consulta_clientes.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_consulta_clientesMouseExited

    private void btn_salvar_cliente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente1MouseExited
        // TODO add your handling code here:
        btn_salvar_cliente1.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_salvar_cliente1MouseExited

    private void btn_salvar_cliente1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente1MouseEntered
        // TODO add your handling code here:
        btn_salvar_cliente1.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_salvar_cliente1MouseEntered

    private void btn_salvar_cliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente1MouseClicked
        try {
            //cria novo cliente
            salvaNovoCliente();
        } catch (NumberFormatException ex) {
            throw new RuntimeException(ex);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }//GEN-LAST:event_btn_salvar_cliente1MouseClicked
    
    public void salvaNovoCliente() throws NumberFormatException, SQLException {
        // TODO add your handling code here:
        List<String> erros =  new ArrayList<>();
        StringBuilder menssagemErro =  new StringBuilder();
        try {
            Cliente novoCliente = new Cliente(
                txt_nome_cliente.getText(),
                txt_cpf_cliente.getText(),
                txt_data_nascimento_novo_cliente.getText(),
                txt_tell_novo_cliente.getText(),
                jComboBox_sexo.getSelectedItem().toString(),
                jComboBox_estadocivil.getSelectedItem().toString(),
                txt_email_novo_cliente.getText(),
                
                        txt_cep_novo_cliente.getText(),
                        txt_bairro_novo_cliente.getText(),
                        txt_rua_novo_cliente.getText(),
                        txt_complemento_novo_cliente.getText(),
                        Integer.valueOf(txt_num_novo_cliente.getText()));
            erros = valida.validaCliente(novoCliente);
            
            erros.forEach(erro ->{
                StringBuilder append = menssagemErro.append(erro).append("\n");
            });
            
            if(erros.isEmpty()){
                ControllerTabelaCliente.inserirEntidade(novoCliente);
                ControllerTabelaCliente.buscaEntidades();
                JOptionPane.showMessageDialog(null, "Cliente criado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, menssagemErro.toString(),"Campo invalido",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException | HeadlessException e) {
            menssagemErro.append("Numero da residencia é obrigatório!");
            JOptionPane.showMessageDialog(null, menssagemErro.toString(),"Campo invalido",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    private void btn_pesquisa_nomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisa_nomeMouseExited
        // TODO add your handling code here:
        btn_pesquisa_nome.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_pesquisa_nomeMouseExited

    private void btn_pesquisa_nomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisa_nomeMouseEntered
        // TODO add your handling code here:
        btn_pesquisa_nome.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_pesquisa_nomeMouseEntered

    private void btn_pesquisa_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisa_nomeMouseClicked
        // TODO add your handling code here:
       // clienteControler.pesquisaClienteNome(search_nome.getText());
    }//GEN-LAST:event_btn_pesquisa_nomeMouseClicked

    private void search_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_nomeActionPerformed

    private void btn_pesquisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisaMouseExited
        // TODO add your handling code here:
        btn_pesquisa.setBackground(new Color(51, 152, 219));//cor quando sai do botton
    }//GEN-LAST:event_btn_pesquisaMouseExited

    private void btn_pesquisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisaMouseEntered
        // TODO add your handling code here:
        btn_pesquisa.setBackground(new Color(119, 183, 225));//Cor quando entra no botton
    }//GEN-LAST:event_btn_pesquisaMouseEntered

    private void btn_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesquisaMouseClicked
        // TODO add your handling code here:

       // clienteControler.pesquisaClienteCpf(search_cpf.getText());
    }//GEN-LAST:event_btn_pesquisaMouseClicked

    private void btn_salvar_cliente3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_cliente3MouseExited

    private void btn_salvar_cliente3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_cliente3MouseEntered

    private void btn_salvar_cliente3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salvar_cliente3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar_cliente3MouseClicked

    private void tabela_de_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_de_clientesMouseClicked
        if (evt.getClickCount() == 2) {
            int itemClicado = tabela_de_clientes.getSelectedRow();
           // new TelaEditarClientes(this, true, clienteControler.pegarTodosClientes().get(itemClicado), tabela_de_clientes, null, null).setVisible(true);
        }

        //        clienteControler.atualizarCliente(itemClicado, null);
    }//GEN-LAST:event_tabela_de_clientesMouseClicked

    private void jComboBox_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_sexoActionPerformed

    private void txt_email_novo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_email_novo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_email_novo_clienteActionPerformed

    private void txt_bairro_novo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bairro_novo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bairro_novo_clienteActionPerformed

    private void txt_rua_novo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rua_novo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rua_novo_clienteActionPerformed

    private void txt_nome_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_clienteActionPerformed

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        // TODO add your handling code here:

        btn_home.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_btn_homeMouseEntered

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        // TODO add your handling code here:
        btn_home.setBackground(new Color(119, 183, 225));
    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        // TODO add your handling code here:
        cardLayout.show(homeJpainel, "jpainelHome");
    }//GEN-LAST:event_btn_homeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        Calendar dia = Calendar.getInstance();
        List<Venda> listaDeVenda = new ArrayList<>();
        int totalDoMes = 0;
        
        //percorre a lista procurando items com o mês correspondente
        //retorna o total do mês
        totalDoMes = retonaTodasVendasNoMes(dia, date, listaDeVenda, totalDoMes);
        
        //atualiza a tabela com os intens encontrados
        controllerTabelaRelatorio.atualizaTabela(listaDeVenda);
        txt_relatorio_total_mes.setText("R$ " + String.valueOf(totalDoMes));


    }//GEN-LAST:event_jButton1ActionPerformed

    private int retonaTodasVendasNoMes(Calendar dia, Date date, List<Venda> listaDeVenda, int totalDoMes) {
        int mes = mesChooser_relatorio.getMonth();
        DaoVendas vendas = new DaoVendas();
        
        for (Venda v : vendas.getAll()) {
            dia.setTime(date);
            //coloca na lista os produtos vendidos no mês
            if (dia.get(Calendar.MONTH) == mes) {
                listaDeVenda.add(v);
                totalDoMes += v.getTotal_pago();
            }
        }
        return totalDoMes;
    }

    private void tabela_relatorio_vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_relatorio_vendaMouseClicked
        // TODO add your handling code here:

        int idexItem = tabela_relatorio_venda.getSelectedRow();
        Venda vendaClicada = new DaoVendas().getAll().get(idexItem);
        new TelaRelatorioAnalitico(vendaClicada).setVisible(true);
    }//GEN-LAST:event_tabela_relatorio_vendaMouseClicked

    private void txt_complemento_novo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_complemento_novo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_complemento_novo_clienteActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Sistema(null).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_cancelar_cliente;
    private javax.swing.JPanel btn_cancelar_produto;
    private javax.swing.JPanel btn_consulta_clientes;
    private javax.swing.JPanel btn_frente_caixa;
    private javax.swing.JPanel btn_gerar_relatorio;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_novo_cliente;
    private javax.swing.JPanel btn_novo_produto;
    private javax.swing.JPanel btn_pesquisa;
    private javax.swing.JPanel btn_pesquisa_nome;
    private javax.swing.JPanel btn_sair;
    private javax.swing.JPanel btn_salvar_cliente;
    private javax.swing.JPanel btn_salvar_cliente1;
    private javax.swing.JPanel btn_salvar_cliente3;
    private javax.swing.JPanel btn_salvar_produto;
    private javax.swing.JPanel cadastrarProduto;
    private javax.swing.JComboBox comboBox_tipo_usuario;
    private javax.swing.JPanel homeJpainel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox_estadocivil;
    private javax.swing.JComboBox jComboBox_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPainelHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JLabel lbl_confirm_senha_user;
    private javax.swing.JLabel lbl_confirm_senha_user1;
    private javax.swing.JLabel lbl_cpf_user;
    private javax.swing.JLabel lbl_cpf_user1;
    private javax.swing.JLabel lbl_cpf_user2;
    private javax.swing.JLabel lbl_cpf_user3;
    private javax.swing.JLabel lbl_email_user;
    private javax.swing.JLabel lbl_nome_user;
    private javax.swing.JLabel lbl_nome_user1;
    private javax.swing.JLabel lbl_rg_user;
    private javax.swing.JLabel lbl_senha_user;
    private com.toedter.calendar.JMonthChooser mesChooser_relatorio;
    private javax.swing.JPanel pane_titulo_user;
    private javax.swing.JPanel pane_titulo_user1;
    private javax.swing.JFormattedTextField search_cpf;
    private javax.swing.JTextField search_nome;
    private javax.swing.JPanel sideBar;
    private javax.swing.JTable tabela_de_clientes;
    private javax.swing.JTable tabela_de_produtos;
    private javax.swing.JTable tabela_de_usuarios;
    private javax.swing.JTable tabela_relatorio_venda;
    private javax.swing.JPanel telaCadastraCliente1;
    private javax.swing.JPanel telaCadastraUsuarios;
    private javax.swing.JPanel telaDeClientes;
    private javax.swing.JPanel telaDeRelatorio;
    private javax.swing.JTextField txt_bairro_novo_cliente;
    private javax.swing.JFormattedTextField txt_cep_novo_cliente;
    private javax.swing.JTextField txt_codigo_produto;
    private javax.swing.JTextField txt_complemento_novo_cliente;
    private javax.swing.JPasswordField txt_confirm_senha_user;
    private javax.swing.JFormattedTextField txt_cpf_cliente;
    private javax.swing.JFormattedTextField txt_cpf_user;
    private javax.swing.JFormattedTextField txt_data_nascimento_novo_cliente;
    private javax.swing.JTextField txt_descricao_produto;
    private javax.swing.JTextField txt_email_novo_cliente;
    private javax.swing.JTextField txt_email_user;
    private javax.swing.JLabel txt_home;
    private javax.swing.JTextField txt_marca_produto;
    private javax.swing.JTextField txt_nome_cliente;
    private javax.swing.JTextField txt_nome_produto;
    private javax.swing.JTextField txt_nome_user;
    private javax.swing.JTextField txt_num_novo_cliente;
    private javax.swing.JTextField txt_preco_produto;
    private javax.swing.JSpinner txt_quantidade_produto_estoque;
    private javax.swing.JLabel txt_relatorio_total_mes;
    private javax.swing.JFormattedTextField txt_rg_user;
    private javax.swing.JTextField txt_rua_novo_cliente;
    private javax.swing.JPasswordField txt_senha_user;
    private javax.swing.JFormattedTextField txt_tell_novo_cliente;
    private javax.swing.JFormattedTextField txt_tell_novo_cliente1;
    // End of variables declaration//GEN-END:variables

}
