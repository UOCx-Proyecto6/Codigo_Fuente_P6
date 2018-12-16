package interfaz_grafica;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.*;


public class Marcos_Interfaz extends JFrame{
	
	public Marcos_Interfaz() {
		
		setTitle("Código fuente P6");
		setBounds(250,150,1000,700);
		Lamina_grafica mi_lamina=new Lamina_grafica();
		add(mi_lamina);
		
	}

}


class Lamina_grafica extends JPanel{
	
	JButton botonHumano=new JButton("Humano");
	JButton botonOrco=new JButton("Orco");
	JButton botonDemonio=new JButton("Demonio");
	JButton botonElfo=new JButton("Elfo");
	
	JLabel label1= new JLabel("Pulsa una raza:");
	
	
	
	
	public Lamina_grafica(){
		
		add(label1);
		add(botonHumano);
		add(botonOrco);
		add(botonDemonio);
		add(botonElfo);
		
	}


}
