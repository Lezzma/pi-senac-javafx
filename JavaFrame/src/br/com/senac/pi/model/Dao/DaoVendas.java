
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.JDBC.ConnectioFactory;
import br.com.senac.pi.model.entidades.Produtos;
import br.com.senac.pi.model.entidades.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DaoVendas implements DaoRepositorio<Venda>{
    private List<Venda> listaDeVendas = new ArrayList<>();
    private Connection conexao;
    private PreparedStatement ps;
    private ResultSet rs;
   

    @Override
    public List<Venda> getAll() throws SQLException {
       conexao =  new ConnectioFactory().getConnection();
        String sql = "SELECT * FROM venda"; 
        ps = conexao.prepareStatement(sql);
        rs =  ps.executeQuery();
        
        while(rs.next()){
            int id = Integer.parseInt(rs.getString("id_venda"));
            int idCliente = Integer.parseInt(rs.getString("id_cli"));
            int idVendedor =  Integer.parseInt(rs.getString("id_vendedor"));
            int idCarrinho =  Integer.parseInt(rs.getString("id_carrinho"));
            double valorTotal = Double.parseDouble(rs.getString("valor_total"));
            int quantidadeProdutos = Integer.parseInt(rs.getString("qtd_prod"));
            String dataVenda = rs.getString("data_venda");
            
            Venda venda = new Venda();
            venda.setTotal_pago(valorTotal);
          
            listaDeVendas.add(venda);
        }
        rs.close();
        fecharConexao();
        return listaDeVendas;
    }

    @Override
    public void inserir(Venda entidade) throws SQLException {
       List<Produtos> carrinho = entidade.getCarrinho().getAll();
       conexao =  new ConnectioFactory().getConnection();
       
       ps = conexao.prepareStatement("insert into carrinho (id_prod) values (?)");
       int id_carrinho = ps.RETURN_GENERATED_KEYS;
       for(int i = 0; i<carrinho.size();i++){
           ps.setInt(1, carrinho.get(i).getId());
           ps.execute();
       }
       
   
       
       ps = conexao.prepareStatement("insert into venda (id_cli,id_vendedor,"
               + "id_carrinho,valor_total,qtd_produtos,data_venda)"
               + "values (?,?,?,?,?,?)");
      
       ps.setInt(1, entidade.getCliente().getId());
       ps.setInt(2, entidade.getVendedor().getId());
       ps.setInt(3, id_carrinho);
       ps.setDouble(4, entidade.getTotal_pago());
       ps.setInt(5, entidade.getCarrinho().getQuantidadeDeItems());
       
       Date date = new Date();
       SimpleDateFormat formataData = new SimpleDateFormat("“dd/MM/yyyy”");
       ps.setString(6,formataData.format(date) );
       ps.execute();
       ps.close();
       fecharConexao();
    }

    @Override
    public void deletar(int id) {
        listaDeVendas.remove(id);
    }

    @Override
    public void att(Venda entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void fecharConexao() throws SQLException{
        ps.close();
        conexao.close();
    }
    
}
