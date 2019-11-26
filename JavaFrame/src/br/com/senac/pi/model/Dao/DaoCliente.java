
package br.com.senac.pi.model.Dao;

import br.com.senac.pi.model.JDBC.ConnectioFactory;
import br.com.senac.pi.model.entidades.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoCliente implements DaoRepositorio<Cliente>{
    private List<Cliente> listaClientes= new ArrayList<>();
    private Connection conexao;
    private PreparedStatement ps;
    private ResultSet rs;
    
    @Override
    public List<Cliente> getAll() throws SQLException {
        conexao =  new ConnectioFactory().getConnection();
        
        String sql = "SELECT * FROM cliente"; 
        
        ps = conexao.prepareStatement(sql);
        rs =  ps.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String dataNascimento = rs.getString("data_nasc");
            String tel = rs.getString("tel");
            String cpf = rs.getString("cpf");
            String cel = rs.getString("cel");
            String sexo = rs.getString("sexo");
            String estadoSivil = rs.getString("est_civil");
            String email = rs.getString("email");
            String nomeRua = rs.getString("rua");
            String bairro = rs.getString("bairro");
            int numCasa = rs.getInt("numero");
            String complemento = rs.getString("complemento");
            String cep = rs.getString("cep");
            
            
            Cliente novoCliente = new Cliente(id,nome, cpf, dataNascimento, tel, sexo, estadoSivil, email,
                    cep, bairro, nomeRua, complemento, numCasa);
            listaClientes.add(novoCliente);
        }
        rs.close();
        fecharConexao();
        return listaClientes;
    }
    
    public void fecharConexao() throws SQLException{
        ps.close();    
        conexao.close();
    }
     
    @Override
    public void inserir(Cliente entidade) throws SQLException {
       conexao =  new ConnectioFactory().getConnection();
       ps = conexao.prepareStatement("insert into cliente (cpf, nome,"
               + "data_nasc, tel, sexo, est_civil,"
               + " email, cep, bairro, rua, complemento, numero)"
               + "values (?,?,?,?,?,?,?,?,?,?,?,?)");
       
       ps.setString(1, entidade.getCpf());
       ps.setString(2, entidade.getNome());
       ps.setString(3, entidade.getDataDeNascimento());
       ps.setString(4, entidade.getTell());
       ps.setString(5, entidade.getSexo());
       ps.setString(6, entidade.getEstadoCivil());
       ps.setString(7, entidade.getEmail());
       ps.setString(8,entidade.getCep());
       ps.setString(9,entidade.getBairro());
       ps.setString(10,entidade.getRua());
       ps.setString(11,String.valueOf(entidade.getComplemento()));
       ps.setInt(12,entidade.getNumero());
       ps.execute();
       fecharConexao();
    }

    

    @Override
    public void deletar(int id) throws SQLException {
            conexao =  new ConnectioFactory().getConnection();
            ps = conexao.prepareStatement("DELETE FROM cliente WHERE id = ?");
            ps.setInt(1, id);
            ps.execute();
            fecharConexao();
    }

    @Override
    public void att(Cliente entidade) throws SQLException {
          conexao =  new ConnectioFactory().getConnection();
       ps = conexao.prepareStatement("UPDATE cliente SET cpf=?, nome=?, data_nasc=?, tel=?, sexo=?, est_civil=?,"
               + "email=?, cep=?, bairro=?, rua=?, complemento=?, numero=? WHERE id=?");
       
       ps.setString(1, entidade.getCpf());
       ps.setString(2, entidade.getNome());
       ps.setString(3, entidade.getDataDeNascimento());
       ps.setString(4, entidade.getTell());
       ps.setString(5, entidade.getSexo());
       ps.setString(6, entidade.getEstadoCivil());
       ps.setString(7, entidade.getEmail());
       ps.setString(8,entidade.getCep());
       ps.setString(9,entidade.getBairro());
       ps.setString(10,entidade.getRua());
       ps.setString(11,String.valueOf(entidade.getComplemento()));
       ps.setInt(12,entidade.getNumero());
       ps.setInt(13, entidade.getId());
       ps.execute();
       fecharConexao();
    }
    
}
