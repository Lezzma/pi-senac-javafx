package br.com.senac.pi.model.Dao;

import java.util.List;

public interface DaoRepositorio<T> {
    List<T> getAll();
    void inserir(T entidade);
    void att(T entidade);
    void deletar(T entidade);
    
}
