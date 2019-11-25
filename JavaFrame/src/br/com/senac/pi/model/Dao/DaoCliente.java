
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
            int id = rs.getInt("id_cli");
            String nome = rs.getString("nome_cli");
            String dataNascimento = rs.getString("data_nasc_cli");
            String tel = rs.getString("tel_cli");
            String cpf = rs.getString("cpf_cli");
            String cel = rs.getString("cel_cli");
            String sexo = rs.getString("sexo_cli");
            String estadoSivil = rs.getString("est_civil_cli");
            String email = rs.getString("email_cli");
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
       ps = conexao.prepareStatement("insert into cliente (cpf_cli, nome_cli,"
               + "data_nasc_cli, tel_cli, sexo_cli, est_civil_cli,"
               + " email_cli, cep, bairro, rua, complemento, numero)"
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
       ps.close();
       fecharConexao();
    }

    

    @Override
    public void deletar(int id) {
       
    }

    @Override
    public void att(Cliente entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
