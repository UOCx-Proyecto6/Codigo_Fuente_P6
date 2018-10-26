package armas;

import java.util.HashMap;
import java.util.Random;


public interface Arma {
	
	public HashMap<String, Integer> armasAtaque = new HashMap<String, Integer> ();
	public HashMap<String, Integer> armasDefensa = new HashMap<String, Integer> ();
		
	
	public static void asignarArmaAtaqueAleatoria() {

		armasAtaque.put("Espada", 1);
		armasAtaque.put("Hacha", 2);
		armasAtaque.put("Martillo", 3);
		armasAtaque.put("Arco", 4);
		
		Object [] ataque = armasAtaque.keySet().toArray();
		Object armaAtaqueAleatoria = ataque[new Random().nextInt(ataque.length)];
		System.out.println("************ Arma Ataque Aleatoria ************ \n" + armaAtaqueAleatoria + " :: " + armasAtaque.get(armaAtaqueAleatoria));
		

	}

}
