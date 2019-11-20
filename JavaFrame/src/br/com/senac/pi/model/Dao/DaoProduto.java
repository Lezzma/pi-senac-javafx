
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.JDBC.ConnectioFactory;
import br.com.senac.pi.model.entidades.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoProduto implements DaoRepositorio<Produtos> {

    private Connection conexao =  new ConnectioFactory().getConnection();
    private PreparedStatement ps;
    private ResultSet rs;
    private List<Produtos> listaDeProdutos = new ArrayList<>();

    @Override
    public List<Produtos> getAll() throws SQLException{
        
        String sql = "SELECT * FROM produto"; 
        ps = conexao.prepareStatement(sql);
        rs =  ps.executeQuery();
        
        while(rs.next()){
            int id = Integer.parseInt(rs.getString("id_prod"));
            String nomeProduto = rs.getString("nome_prod");
            String descricaoProduto = rs.getString("descr_prod");
            String marcaProduto = rs.getString("marca_prod");
            int quantidadeEstoque = Integer.parseInt(rs.getString("qtde_estoq_prod"));
            double preco = Double.parseDouble(rs.getString("preco_prod"));
            
            Produtos produto = new Produtos(id, nomeProduto, marcaProduto, descricaoProduto, quantidadeEstoque, preco);
            listaDeProdutos.add(produto);
        }
       
        return listaDeProdutos;
    }
    public void fecharConexao() throws SQLException{
        ps.close();
        rs.close();
        conexao.close();
    }
    @Override
    public void inserir(Produtos entidade)throws SQLException {
       
       ps = conexao.prepareStatement("insert into produto (nome_prod,descr_prod,"
               + "preco_prod,marca_prod,qtde_estoq_prod,codigo)"
               + "values (?,?,?,?,?,?)");
       
       ps.setString(1, entidade.getNome());
       ps.setString(2, entidade.getDescricao());
       ps.setDouble(3, entidade.getPreco());
       ps.setString(4, entidade.getMarca());
       ps.setInt(5, entidade.getQuantidadeEstoque());
       ps.setString(6, entidade.getCodigo());
       ps.execute();
       ps.close();
         
        
    }

    @Override
    public void att(Produtos entidade) {
  
    }

    @Override
    public void deletar(Produtos entidade) {
       
    }

}
