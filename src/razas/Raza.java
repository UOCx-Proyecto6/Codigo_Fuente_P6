package razas;

public class Raza {

	Object[] razas  =  {new Humano(), new Orco(), new Demonio(), new Elfo()};
	Object razaElegida;
	String [] razasString = {"Humano","Orco","Demonio", "Elfo"};
	String razaAux;
		
	/**
	 * 
	 * @param  raza (int que marca la posición del objeto raza elegido);
	 * @return razaElegida
	 */
	public String elegirRaza(int raza) {
				
		razaElegida = this.razas[raza];
		razaAux = razasString[raza];
		
		return razaAux;
	}
	
	
	
	@Override
	public String toString() {
		
		return "\n************ Raza Elegida ************** \n" + razaAux;				
		
	}
	
	
	
}
