

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
		
		return this.arma.toString();
		
	}
	
	
	public static void main(String[] args) {
		
		Armas armas = new Armas();
		

		Personaje_prueba p1 = new Personaje_prueba(armas);
		System.out.println(p1.toString());
			

	}

}
