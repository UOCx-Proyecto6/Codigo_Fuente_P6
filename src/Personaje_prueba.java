

import armas.Arma;

public class Personaje_prueba {
	
	Object arma;
	
	 
	
	public Personaje_prueba(Object arma) {
		this.arma = arma;
				
	}
	
	

	public static void main(String[] args) {

		Personaje_prueba p1 = new Personaje_prueba(Arma.asignarArmaAtaqueAleatoria());
		
		
		Arma.asignarArmaAtaqueAleatoria();
		

	}

}
