package armas;

import java.util.HashMap;

public interface Arma {
	
	public HashMap<String, Integer> armasAtaque = new HashMap<String, Integer> ();
	public HashMap<String, Integer> armasDefensa = new HashMap<String, Integer> ();
	
	
	public static void armasAtaque() {
		armasAtaque.put("Espada", 1);
		armasAtaque.put("Hacha", 2);
		armasAtaque.put("Martillo", 3);
		armasAtaque.put("Arco", 4);
	}
	
	

}
