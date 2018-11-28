package DAO;

import com.mysql.jdbc.*;
import com.mysql.jdbc.PreparedStatement;

import java.sql.*;

import interfaces.DAODatos;
import razas.Raza;

public class DAODatosImpl extends Conexion implements DAODatos{

	@Override
	public void registrar(Raza raz) throws Exception {

		try {
			
			//utilizamos la conexión
			this.conectar();
			
			//se crea el objeto Statement
			PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("INSERT INTO datos(arma,raza) VALUES (?,?)");
			st.setObject(1, raz.getArma());
			st.setString(2, raz.getRaza());
			
			//se ejecuta la sentencia
			st.executeUpdate();
			System.out.println("\nDatos registrados en base de datos");
		
		}catch(Exception e) {
			throw e;
		}finally {
			this.cerrar();
		}
	}

	@Override
	public void modificar(Raza raz) throws Exception {
		try {
			this.conectar();
			PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("UPDATE datos SET arma WHERE id=?");
			st.setInt(1, raz.getId());
			st.executeUpdate();
		
		}catch(Exception e) {
			throw e;
		}finally {
			this.cerrar();
		}
	}

	@Override
	public void eliminar(Raza raz) throws Exception {
		try {
			this.conectar();
			PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("DELETE datos SET arma WHERE id=?");
			st.setInt(1, raz.getId());
			st.executeUpdate();
		
		}catch(Exception e) {
			throw e;
		}finally {
			this.cerrar();
		}
	}
	
	

}
