package interfaz_grafica;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;




public class Marcos_Interfaz extends JFrame{
	
	public Marcos_Interfaz() {
		
		setTitle("Código fuente P6");
		setBounds(250,150,1000,700);
		Lamina_grafica mi_lamina=new Lamina_grafica();
		mi_lamina.setLayout(null);
		add(mi_lamina);
		
	}

}


class Lamina_grafica extends JPanel{
	

	JButton botonHumano=new JButton("Humano");
	JButton botonOrco=new JButton("Orco");
	JButton botonDemonio=new JButton("Demonio");
	JButton botonElfo=new JButton("Elfo");
	JButton botonCerrar = new JButton("Cerrar");		
	JLabel label1= new JLabel("Pulsa una raza:");
	
	public Lamina_grafica(){
		
		add(label1);
		add(botonHumano);
		add(botonOrco);
		add(botonDemonio);
		add(botonElfo);
		add(botonCerrar);

		
		
		label1.setBounds(10,10,200,30);
		botonHumano.setBounds(110,10,100,30);
		botonOrco.setBounds(230,10,100,30);
		botonDemonio.setBounds(350,10,100,30);
		botonElfo.setBounds(470,10,100,30);
		botonCerrar.setBounds(290, 80, 100, 30);
		botonCerrar.setBackground((new Color(51, 153, 255)));

	

		botonCerrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		        System.exit(0);
		    }
		});	
	}
	
}
