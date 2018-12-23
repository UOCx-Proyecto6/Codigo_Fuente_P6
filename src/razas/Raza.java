package razas;

import java.util.HashMap;

import armas.Armas;

public class Raza {
	
	
	private int idBD;
	private Object armaBD;
	private String razaBD;

	Object[] razas  =  {new Humano(), new Orco(), new Demonio(), new Elfo()};
	Object razaElegida;
	String [] razasString = {"Humano","Orco","Demonio", "Elfo"};
	String razaAux;

	
	private String raza;


	/*public Razas(String raza) {
		this.raza = raza;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}*/

	
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
	
	
	public int getId() {	
		return idBD;	
	}
	
	public void setId(int idBD) {	
		this.idBD=idBD;
	}
	
	public Object getArma() {	
		return armaBD;	
	}
	
	public void setArma(Object armas) {	
		this.armaBD=armas;
	}
	
	public String getRaza() {	
		return razaBD;	
	}
	
	public void setRaza(String razaBD) {	
		this.razaBD=razaBD;
	}
	
	
}
