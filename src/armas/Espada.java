package armas;


public class Espada implements Arma {
	
	private int ataqueEspada;
	private int defensaEspada;
	
	
	public Espada (int ataque, int defensa) {
		this.ataqueEspada = ataque;
		this.defensaEspada = defensa;
	}
	




	/**
	 * @return the ataqueEspada
	 */
	public int getAtaqueEspada() {
		return ataqueEspada;
	}

	/**
	 * @param ataqueEspada the ataqueEspada to set
	 */
	public void setAtaqueEspada(int ataqueEspada) {
		this.ataqueEspada = ataqueEspada;
	}

	/**
	 * @return the defensaEspada
	 */
	public int getDefensaEspada() {
		return defensaEspada;
	}

	/**
	 * @param defensaEspada the defensaEspada to set
	 */
	public void setDefensaEspada(int defensaEspada) {
		this.defensaEspada = defensaEspada;
	}





	public static void asignarArmasAtaque() {
		armasAtaque.put("Espada", 1);
		System.out.println(armas[(int) (Math.random()*4)]);
		
		
	}
	
}
