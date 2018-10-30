package razas;

public class Raza {

	Object[] razas  =  {new Humano(), new Orco(), new Demonio(), new Elfo()};
	Object razaElegida;
		
	/**
	 * 
	 * @param  raza (int que marca la posición del objeto raza elegido);
	 * @return razaElegida
	 */
	public Object elegirRaza(int raza) {
		razaElegida = this.razas[raza];
		
		return razaElegida;
	}
	
	
	
	@Override
	public String toString() {
		
		return "\n************ Raza Elegida ************** \n" + razaElegida;
				
		
	}
	
	
	
}
