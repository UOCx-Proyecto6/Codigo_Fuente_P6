package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Conexion {
	
	protected Connection conexion;

	private final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	private final String DB_URL="jdbc:mysql://localhost:3306/pruebas_java";
	private final String DB_USER="root";
	private final String DB_PASS="";
	
	public void conectar() throws Exception{
		try {
			
			//Se crea la conexión
			conexion=DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			
			Class.forName(JDBC_DRIVER);
						
			
		}catch(Exception e) {
			throw e;
		}
	}
	
	public void cerrar() throws SQLException {
		
		if(conexion !=null) {
			if(!conexion.isClosed()) {
				conexion.close();
			}
		}
	}
}
