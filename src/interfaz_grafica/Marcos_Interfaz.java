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
		setBounds(250,10,1000,700);
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
	JLabel label2= new JLabel("-------------------------------------INTERACCIÓN CON BASE DE DATOS-------------------------------------");
	
	
	JButton botonListar=new JButton("Listar");
	JButton botonModificar=new JButton("Modificar");
	JButton botonEliminar=new JButton("Eliminar");
	
	JLabel textof=new JLabel();
	
	
	public Lamina_grafica(){
		
		add(label1);
		add(label2);
		add(botonHumano);
		add(botonOrco);
		add(botonDemonio);
		add(botonElfo);
		add(botonCerrar);
		add(botonListar);
		add(botonModificar);
		add(botonEliminar);
		add(textof);

		
		
		label1.setBounds(210,10,200,30);
		label2.setBounds(250, 250, 1000, 30);
		botonHumano.setBounds(310,10,100,30);
		botonOrco.setBounds(430,10,100,30);
		botonDemonio.setBounds(550,10,100,30);
		botonElfo.setBounds(670,10,100,30);
		botonCerrar.setBounds(460, 600, 100, 30);
		botonCerrar.setBackground((new Color(51, 153, 255)));
		botonListar.setBounds(350,290,100,30);
		botonModificar.setBounds(450,290,100,30);
		botonEliminar.setBounds(550,290,100,30);
		textof.setBounds(100, 350, 300, 100);
		
		
		
		//botón listar base de datos
		botonListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				//en proceso
				textof.setText("Mostrar datos de base de datos");
			}
		    {
		        
		    	
		    }
		});	
		
		
		
		
		//botón modificar en base de datos
		botonModificar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		        
		    	
		    }
		});	
		
		
		
		
		//botón eliminar en base de datos
		botonEliminar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		        
		    	
		    }
		});	
		

		
		
		
		//botón cerrar
		botonCerrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		        System.exit(0);
		    }
		});	
	}
	
	
	
}
