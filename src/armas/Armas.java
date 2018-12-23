package armas;

import java.util.HashMap;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="armas")

public class Armas {

	@Transient
	public HashMap<String, Integer> armasAtaque = new HashMap<String, Integer>();
	@Transient
	public HashMap<String, Integer> armasDefensa = new HashMap<String, Integer>();
	@Transient
	Object[] ataque;
	@Transient
	Object[] defensa;
	@Transient
	public Object armaAtaqueAleatoria;
	@Transient
	Object armaDefensaAleatoria;
	
	@Id
	@Column(name="arma")
	private String arma;


	public Armas(String arma) {
		this.arma = arma;
	}

	public String getArma() {
		return this.arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	
	
	public Armas() {

		armasAtaque.put("Espada", 1);
		armasAtaque.put("Hacha", 2);
		armasAtaque.put("Martillo", 3);
		armasAtaque.put("Arco", 4);

		ataque = armasAtaque.keySet().toArray();
		int indexAleatorio = new Random().nextInt(ataque.length);
		armaAtaqueAleatoria = ataque[indexAleatorio];
		
		armasDefensa.put("Arco", 0);
		armasDefensa.put("Martillo", 1);
		armasDefensa.put("Hacha", 2);
		armasDefensa.put("Espada", 3);
		
		defensa = armasDefensa.keySet().toArray();
		armaDefensaAleatoria = armaAtaqueAleatoria;
				
	}
		
	
	@Override
	public String toString() {
		
		return "************ Arma Aleatoria ************ \n" + this.armaAtaqueAleatoria + " :: " + "( "+ armasAtaque.get(armaAtaqueAleatoria) + " ataque )" + 
		"( " + armasDefensa.get(armaDefensaAleatoria) + " defensa )" ; 
				
		
	}

}
