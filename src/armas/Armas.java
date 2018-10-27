package armas;

import java.util.HashMap;
import java.util.Random;

public class Armas {

	public HashMap<String, Integer> armasAtaque = new HashMap<String, Integer>();
	public HashMap<String, Integer> armasDefensa = new HashMap<String, Integer>();
	Object[] ataque;
	Object armaAtaqueAleatoria;
	

	public Armas() {

		armasAtaque.put("Espada", 1);
		armasAtaque.put("Hacha", 2);
		armasAtaque.put("Martillo", 3);
		armasAtaque.put("Arco", 4);

		ataque = armasAtaque.keySet().toArray();
		armaAtaqueAleatoria = ataque[new Random().nextInt(ataque.length)];

	}
	
	
	
	@Override
	public String toString() {
		
		return "************ Arma Ataque Aleatoria ************ \n" + this.armaAtaqueAleatoria + " :: " + armasAtaque.get(armaAtaqueAleatoria);
		
	}

}
