

import armas.Armas;
import razas.Raza;

public class Personaje_prueba {
	
	String nick_personaje;
	Object arma;	
	Object raza;
	Object medioAmbiente;
	
	 
	
	public Personaje_prueba(Object armas, Object razas) {
		this.arma = armas;
		this.raza = razas;
				
	}
	
	public String toString() {
		
		return this.arma.toString() + "\n" + this.raza.toString();
		
	}
	
	
	public static void main(String[] args) {
		
		Armas armas = new Armas();
		Raza razas = new Raza();
		
		razas.elegirRaza(0);
		
		Personaje_prueba p1 = new Personaje_prueba(armas, razas);
		System.out.println(p1.toString());
			

	}

}
