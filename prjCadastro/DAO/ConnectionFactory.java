package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bdInterface", "root", "");
		} catch(SQLException e) {
		    throw new RuntimeException("Erro ao conectar ao banco de dados", e);
		}
	}
}