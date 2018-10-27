

import armas.Armas;

public class Personaje_prueba {
	
	Object arma;
	
	 
	
	public Personaje_prueba(Object arma) {
		this.arma = arma;
				
	}
	
	public String toString() {
		
		return "" + this.arma;
		
	}
	
	
	public static void main(String[] args) {
		
		Armas armaAtaque = new Armas();

		Personaje_prueba p1 = new Personaje_prueba(armaAtaque);
		System.out.println(p1.toString());
		
		
		
		

	}

}
