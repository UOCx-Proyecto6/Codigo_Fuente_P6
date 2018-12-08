package DAO;

import com.mysql.jdbc.*;
import com.mysql.jdbc.PreparedStatement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import interfaces.DAODatos;
import razas.Raza;

public class DAODatosImpl extends Conexion implements DAODatos{

	@Override
	public void registrar(Raza raz) throws Exception {

		try {
			
			//utilizamos la conexi�n
			this.conectar();
			
			//se crea el objeto Statement
			PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("INSERT INTO datos(arma,raza) VALUES (?,?)");
			st.setObject(1, raz.getArma());
			st.setString(2, raz.getRaza());		
				
			// Las operaciones no se validan automaticamente
			conexion.setAutoCommit(false); 
			
			// Si se hace la actualizaci�n se hace la transacci�n, en caso contrario se deshace			
			if (st.executeUpdate() != 0){
				conexion.commit();
				st.executeUpdate();
				System.out.println("\nDatos registrados en base de datos");
			}
			
			else {
				  conexion.rollback();
				  System.out.println("\nLa transacci�n no se ha realizado");
			}
			
			} catch (SQLException e) {	         
	            try {
	                // Deshace los cambios hechos dentro de la transaccion 
	            	conexion.rollback();
	            	System.out.println("Error: La transeferencia no se ha completado.");
	            } catch (SQLException ex) {
	            	throw ex;
	        }
			}finally {
				this.cerrar();
			}
		
	}

	@Override
	public void modificar(Raza raz) throws Exception {
		try {
			this.conectar();
			PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("UPDATE datos SET arma=?, raza=? WHERE id=?");
			
			st.setString(1, (String) raz.getArma());
			st.setString(2, raz.getRaza());
			st.setInt(3, raz.getId());
			
			// Las operaciones no se validan automaticamente
			conexion.setAutoCommit(false); 
			
			if (st.executeUpdate() != 0){
				conexion.commit();
				st.executeUpdate();
				System.out.println("\nDatos registrados en base de datos");
			}
			else {
				  conexion.rollback();
				  System.out.println("\nLa transacci�n no se ha realizado");
			}
			
			} catch (SQLException e) {	         
	            try {
	                // Deshace los cambios hechos dentro de la transaccion 
	            	conexion.rollback();
	            	System.out.println("Error: La transeferencia no se ha completado.");
	            } catch (SQLException ex) {
	            	throw ex;
	        }
			}finally {
				this.cerrar();
			}
	}

	@Override
	public void eliminar(Raza raz) throws Exception {
		try {
			this.conectar();
			PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("DELETE FROM datos WHERE id = ? ");
			st.setInt(1, raz.getId());
			
			// Las operaciones no se validan automaticamente
			conexion.setAutoCommit(false); 
			st.executeUpdate();
			
			if (st.executeUpdate() != 0){
				conexion.commit();
				st.executeUpdate();
				System.out.println("\nDatos registrados en base de datos");
			}
			else {
				  conexion.rollback();
				  System.out.println("\nLa transacci�n no se ha realizado");
			}
			
			} catch (SQLException e) {	         
	            try {
	                // Deshace los cambios hechos dentro de la transaccion 
	            	conexion.rollback();
	            	System.out.println("Error: La transeferencia no se ha completado.");
	            } catch (SQLException ex) {
	            	throw ex;
	        }
			}finally {
				this.cerrar();
			}
			
			

	}

	@Override
	public List<Raza> listar() throws Exception {
		
		List<Raza> lista=null;
		
		try {
			this.conectar();
			PreparedStatement st = (PreparedStatement) this.conexion.prepareStatement("SELECT * FROM datos");
			
			lista=new ArrayList();
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				Raza raz=new Raza();
				raz.setId(rs.getInt("id"));
				raz.setArma(rs.getString("arma"));
				raz.setRaza(rs.getString("raza"));
				lista.add(raz);
			}
			
			
			rs.close();
			st.close();
		
		}catch(Exception e) {
			throw e;
		}finally {
			this.cerrar();
		}
		return lista;
	}
	
	

}
