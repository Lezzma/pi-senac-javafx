package br.com.senac.pi.model.JDBC;

import br.com.senac.pi.model.entidades.Produtos;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class TesteConexao {
    static List<Produtos> lista = new ArrayList<>();
    static Connection conexao;
    static PreparedStatement ps;
    static ResultSet rs;
    public static void main(String[] args) throws SQLException{
        conexao =  new ConnectioFactory().getConnection();
        String sql = "SELECT * FROM produto"; 
        ps = conexao.prepareStatement(sql);
        rs =  ps.executeQuery();
        
        while(rs.next()){
            int id = Integer.parseInt(rs.getString("id_prod"));
            String codigo = rs.getString("Codigo");
            String nomeProduto = rs.getString("nome_prod");
            String descricaoProduto = rs.getString("descr_prod");
            String marcaProduto = rs.getString("marca_prod");
            int quantidadeEstoque = Integer.parseInt(rs.getString("qtde_estoq_prod"));
            double preco = Double.parseDouble(rs.getString("preco_prod"));
            
            Produtos produto = new Produtos(codigo, nomeProduto, marcaProduto, descricaoProduto, quantidadeEstoque, preco);
            lista.add(produto);
        }
        
        for(Produtos produto: lista){
            System.out.println(produto.toString());
        }
        fecharConexao();
    }

    private static void fecharConexao() throws SQLException {
        rs.close();
        ps.close();
        conexao.close();
    }
}
