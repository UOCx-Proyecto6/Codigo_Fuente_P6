
import javax.swing.JFrame;

import org.hibernate.Session;
import org.hibernate.Transaction;

import DAO.DAODatosImpl;
import armas.Armas;
import interfaces.DAODatos;
import interfaz_grafica.Marcos_Interfaz;
import razas.Raza;
import utils.HibernateUtils;



public class Personaje_prueba_2 {

	private static Session session;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Marcos_Interfaz mimarco=new Marcos_Interfaz();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		

	
	}

}
