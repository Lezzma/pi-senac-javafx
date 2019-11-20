package br.com.senac.pi.model.Dao;

import java.sql.SQLException;
import java.util.List;

public interface DaoRepositorio<T> {
    List<T> getAll()throws SQLException;
    void inserir(T entidade)throws SQLException;
    void att(T entidade);
    void deletar(T entidade);
    
}
