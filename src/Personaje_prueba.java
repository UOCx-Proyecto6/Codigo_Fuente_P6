

import java.util.Scanner;

import armas.Armas;
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
			System.out.println("Elige la raza de tu personaje (0 humano) (1 demonio) (2 elfo) (3 orco): ");
			scannerAux = scanner.nextInt();
		
			razas.elegirRaza(scannerAux);
		
			Personaje_prueba p1 = new Personaje_prueba(armas, razas);
			System.out.println(p1.toString());
			
		} catch(Exception e) {
			
			System.out.println("Error en el sistema. Vuelva a intentarlo");
			
		}	

	}

}
