package armas;

import java.util.HashMap;
import java.util.Random;

public class Armas {

	public HashMap<String, Integer> armasAtaque = new HashMap<String, Integer>();
	public HashMap<String, Integer> armasDefensa = new HashMap<String, Integer>();
	Object[] ataque;
	Object[] defensa;
	Object armaAtaqueAleatoria;
	Object armaDefensaAleatoria;
	
	
	public Armas() {

		armasAtaque.put("Espada", 1);
		armasAtaque.put("Hacha", 2);
		armasAtaque.put("Martillo", 3);
		armasAtaque.put("Arco", 4);

		ataque = armasAtaque.keySet().toArray();
		armaAtaqueAleatoria = ataque[new Random().nextInt(ataque.length)];
		
		armasDefensa.put("Arco", 0);
		armasDefensa.put("Martillo", 1);
		armasDefensa.put("Hacha", 2);
		armasDefensa.put("Espada", 3);
		
		defensa = armasDefensa.keySet().toArray();
		armaDefensaAleatoria = defensa[new Random().nextInt(defensa.length)];
		

	}
	
	
	
	@Override
	public String toString() {
		
		return "************ Arma Ataque Aleatoria ************ \n" + this.armaAtaqueAleatoria + " :: " + armasAtaque.get(armaAtaqueAleatoria);
		
	}

}
