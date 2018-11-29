

import java.util.Scanner;

import javax.swing.JOptionPane;

import DAO.DAODatosImpl;
import armas.Armas;
import interfaces.DAODatos;
import razas.Raza;

public class Personaje_prueba {
	
	String nick_personaje;
	Object arma;	
	Object raza;
	Object medioAmbiente;
	static Scanner scanner = new Scanner(System.in);
	static int scannerAux;
		
	
	public Personaje_prueba(Object armas, Object razas) {
		this.arma = armas;
		this.raza = razas;
				
	}
	
	public String toString() {
		
		return this.arma.toString() + "\n" + this.raza.toString();
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			
			Armas armas = new Armas();
			Raza razas = new Raza();
			
			System.out.println("***************** BIENVENIDO **************\n");
			System.out.println("Elige la raza de tu personaje (0 humano) (1 orco) (2 demonio) (3 elfo): ");
			scannerAux = scanner.nextInt();
		
			razas.elegirRaza(scannerAux);
		
			Personaje_prueba p1 = new Personaje_prueba(armas, razas);
			System.out.println(p1.toString());
			
			
			
			Raza raz=new Raza();
			
			raz.setArma(armas.armaAtaqueAleatoria);
			raz.setRaza(razas.elegirRaza(scannerAux));
			
			try {
				DAODatos dao=new DAODatosImpl();
				dao.registrar(raz);

				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			
			
		} catch(Exception e) {
			
			System.out.println("Error en el sistema. Vuelva a intentarlo");
			
		}	
		
		
		
		
		
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("\nQuieres realizar otra operación: \n1: Listar \n2: Eliminar \n3: Salir");
		
		int opcion=entrada.nextInt();
		
		switch(opcion) {
		
		case 1:
			
			
			Raza raz1=new Raza();
			raz1.setArma("hola");
			try {
				DAODatos dao=new DAODatosImpl();
				for(Raza r:dao.listar()) {
					System.out.println(r.getId()+" "+r.getArma()+" "+r.getRaza());
				}
				
			}catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
			
			
			System.exit(0);
			
		case 2:
			
			Scanner opcion2=new Scanner(System.in);
			System.out.println("Introduzca el id a eliminar");
			int opc=entrada.nextInt();
			
			
			Raza raz=new Raza();
			raz.setId(opc);
			
			try{
				
				DAODatos dao=new DAODatosImpl();
				dao.eliminar(raz);
				System.out.println("Eliminado el id "+ opc + " ");

			}catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
			
		case 3:
			
			System.out.println("Hasta pronto");
		}
		

		System.exit(0);

	}

}
