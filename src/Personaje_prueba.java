

import armas.Armas;

public class Personaje_prueba {
	
	String nick_personaje;
	Object arma;	
	Object raza;
	Object medioAmbiente;
	
	 
	
	public Personaje_prueba(Object armas) {
		this.arma = armas;
				
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
