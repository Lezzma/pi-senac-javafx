package br.com.senac.pi.model.JDBC;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectioFactory {
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost/lojamoveis";
        try {
            return (Connection) DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
}
