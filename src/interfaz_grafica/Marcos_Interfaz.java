package interfaz_grafica;
import javax.swing.*;

<<<<<<< HEAD
import org.hibernate.Transaction;

=======
>>>>>>> master
import DAO.DAODatosImpl;
import armas.Armas;
import interfaces.DAODatos;
import razas.Raza;
<<<<<<< HEAD
import utils.HibernateUtils;
=======
>>>>>>> master

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.Color;

import org.hibernate.Session;


import interfaz_grafica.Marcos_Interfaz;
import java.util.Random;







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
	
	private static Session session;
	
	JButton botonHumano=new JButton("Humano");
	JButton botonOrco=new JButton("Orco");
	JButton botonDemonio=new JButton("Demonio");
	JButton botonElfo=new JButton("Elfo");
<<<<<<< HEAD
	JButton botonCerrar = new JButton("Cerrar");
	JButton botonnuevoArma = new JButton("Crear nuevo Arma");	
=======
	JButton botonCerrar = new JButton("Cerrar");		
>>>>>>> master
	
	JLabel label1= new JLabel("Pulsa una raza:");
	JLabel label2= new JLabel("-------------------------------------INTERACCIÓN CON BASE DE DATOS-------------------------------------");
	JLabel labelMostrar=new JLabel("ID----ARMA----RAZA");
	JLabel labelcatch=new JLabel();
	
	JButton botonListar=new JButton("Listar");
	JButton botonModificar=new JButton("Modificar");
	JButton botonEliminar=new JButton("Eliminar");
	
	JTextArea textof=new JTextArea();
	JLabel labelEliminar1=new JLabel();
	JLabel labelModificar1=new JLabel();
	
	JLabel razaElegida=new JLabel();


	
	
	public Lamina_grafica(){
		
		add(label1);
		add(label2);
		
		add(botonHumano);
		add(botonOrco);
		add(botonDemonio);
		add(botonElfo);
<<<<<<< HEAD
		add(botonnuevoArma);
=======
>>>>>>> master
		
		add(botonCerrar);
		
		add(botonListar);
		add(botonModificar);
		add(botonEliminar);
		
		add(textof);
		
		add(labelcatch);
		add(labelMostrar);
		add(labelEliminar1);
		add(labelModificar1);
		
		add(razaElegida);

		
		
		label1.setBounds(210,10,200,30);
		label2.setBounds(250, 250, 1000, 30);
		
		botonHumano.setBounds(310,10,100,30);
		botonOrco.setBounds(430,10,100,30);
		botonDemonio.setBounds(550,10,100,30);
		botonElfo.setBounds(670,10,100,30);
<<<<<<< HEAD
		botonnuevoArma.setBounds(790,10,180,30);
=======
>>>>>>> master
		
		botonCerrar.setBounds(460, 600, 100, 30);
		botonCerrar.setBackground((new Color(51, 153, 255)));
		
		botonListar.setBounds(350,290,100,30);
		botonModificar.setBounds(450,290,100,30);
		botonEliminar.setBounds(550,290,100,30);
		
		textof.setBounds(50, 340, 150, 250);
		
		labelcatch.setBounds(350, 315, 150, 30);
		labelMostrar.setBounds(75, 315, 150, 30);
		labelEliminar1.setBounds(700, 315, 150, 30);
		labelModificar1.setBounds(440, 335, 150, 30);
		
		razaElegida.setBounds(250, 100, 800, 30);
		
		
		//**************************************PRIMERA PARTE DE LA APP********************************//
		
		//botón humano
		botonHumano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				//vaciar label
				razaElegida.setText(null);
		    	labelEliminar1.setText(null);
		    	labelModificar1.setText(null);
				
				try {
					
					Armas armas = new Armas();
					Raza razas = new Raza();
					
					//elegimos la raza
					razas.elegirRaza(0);
					
					Raza raz=new Raza();
					
					raz.setArma(armas.armaAtaqueAleatoria);
					raz.setRaza(razas.elegirRaza(0));
					
					try {
						DAODatos dao=new DAODatosImpl();
						dao.registrar(raz);
						
						
						razaElegida.setText("Has ingresado un nuevo usuario con raza "+razas.elegirRaza(0)+" y "+armas.armaAtaqueAleatoria+" como arma aleatoria");

						
					}catch (Exception w) {
						System.out.println(w.getMessage());
					}
							
					
					
				}catch(Exception o) {
					
					labelcatch.setText(o.getMessage());
				}
			}
		    
		});
		
		
		
		
		//botón orco
				botonOrco.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
				
						//vaciar label
						razaElegida.setText(null);
				    	labelEliminar1.setText(null);
				    	labelModificar1.setText(null);
						
						try {
							
							Armas armas = new Armas();
							Raza razas = new Raza();
							
							//elegimos la raza
							razas.elegirRaza(1);
							
							Raza raz=new Raza();
							
							raz.setArma(armas.armaAtaqueAleatoria);
							raz.setRaza(razas.elegirRaza(1));
							
							try {
								DAODatos dao=new DAODatosImpl();
								dao.registrar(raz);
								
								
								razaElegida.setText("Has ingresado un nuevo usuario con raza "+razas.elegirRaza(1)+" y "+armas.armaAtaqueAleatoria+" como arma aleatoria");

								
							}catch (Exception w) {
								System.out.println(w.getMessage());
							}
							
							
						}catch(Exception o) {
							
							labelcatch.setText(o.getMessage());
						}
					}
				    
				});
		
		
			//botón demonio
				botonDemonio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
				
						//vaciar label
						razaElegida.setText(null);
				    	labelEliminar1.setText(null);
				    	labelModificar1.setText(null);
						
						try {
							
							Armas armas = new Armas();
							Raza razas = new Raza();
							
							//elegimos la raza
							razas.elegirRaza(2);
							
							Raza raz=new Raza();
							
							raz.setArma(armas.armaAtaqueAleatoria);
							raz.setRaza(razas.elegirRaza(2));
							
							try {
								DAODatos dao=new DAODatosImpl();
								dao.registrar(raz);
								
								
								razaElegida.setText("Has ingresado un nuevo usuario con raza "+razas.elegirRaza(2)+" y "+armas.armaAtaqueAleatoria+" como arma aleatoria");
<<<<<<< HEAD

								
							}catch (Exception w) {
								System.out.println(w.getMessage());
							}	
							
							
						}catch(Exception o) {
							
							labelcatch.setText(o.getMessage());
						}
					}
				    
				});
		
			//botón elfo
				botonElfo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
				
						//vaciar label
						razaElegida.setText(null);
				    	labelEliminar1.setText(null);
				    	labelModificar1.setText(null);
						
						try {
							
							Armas armas = new Armas();
							Raza razas = new Raza();
							
							//elegimos la raza
							razas.elegirRaza(3);
							
							Raza raz=new Raza();
							
							raz.setArma(armas.armaAtaqueAleatoria);
							raz.setRaza(razas.elegirRaza(3));
							
							try {
								DAODatos dao=new DAODatosImpl();
								dao.registrar(raz);
								
								
								razaElegida.setText("Has ingresado un nuevo usuario con raza "+razas.elegirRaza(3)+" y "+armas.armaAtaqueAleatoria+" como arma aleatoria");

								
							}catch (Exception w) {
								System.out.println(w.getMessage());
							}	
							
							
						}catch(Exception o) {
							
							labelcatch.setText(o.getMessage());
						}
					}
				    
				});
				
				
				//botón nuevoArma
				botonnuevoArma.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
				
						//vaciar label
						razaElegida.setText(null);
				    	labelEliminar1.setText(null);
				    	labelModificar1.setText(null);
						
						try {
							
							session = HibernateUtils.getSessionFactory().openSession();
							Transaction tx = session.beginTransaction();
							
							Random rand = new Random();
							int n = rand.nextInt(5000) + 1;
							
							Armas a = new Armas("ArmaSecreta"+Integer.toString(n));
							session.save(a);
							tx.commit();
							session.close();
							
							
							
							
						}catch(Exception o) {
							
							labelcatch.setText(o.getMessage());
						}
					}
				    
				});
		
		
		
		
		
		//**************************************SEGUNDA PARTE DE LA APP********************************//
		
		//botón listar base de datos
		botonListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		
				
				//vaciar label
		    	razaElegida.setText(null);
		    	labelEliminar1.setText(null);
		    	labelModificar1.setText(null);
				
				try {
					
					DAODatos dao=new DAODatosImpl();
					
					for(Raza r:dao.listar()) {
						
						textof.setText(r.getId()+"      "+r.getArma()+"      "+r.getRaza());
					}
					
				}catch(Exception o) {
					
					labelcatch.setText(o.getMessage());
				}
			}
		    
		});	
		
		
		
		
		//botón modificar en base de datos
		botonModificar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    	//vaciar label
		    	razaElegida.setText(null);
		    	labelEliminar1.setText(null);
		    	labelModificar1.setText(null);
		    	
		    	int idi=Integer.parseInt(JOptionPane.showInputDialog("Introduce el id a modificar"));
		    	
		    	//se comprueba imprimiendo el id en la pantalla del sistema para probarlo
		    	System.out.println(idi);
		    	
		    	Raza raze=new Raza();
				raze.setId(idi);
								
				String ent2=JOptionPane.showInputDialog("Introduce la nueva arma");
				raze.setArma(ent2);
								
				String ent3=JOptionPane.showInputDialog("Introduce la nueva raza");
				raze.setRaza(ent3);

				try{
					
					DAODatos dao=new DAODatosImpl();
					dao.modificar(raze);
					
					labelModificar1.setText("El id ha sido eliminado");


				}catch(Exception i) {
					
					labelcatch.setText(i.getMessage());
				}
		    	
		    	
		    	
		    	
		    	
		    }
		});	
		
		
		
		
		//botón eliminar en base de datos
		botonEliminar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
				
		    	//vaciar label
		    	razaElegida.setText(null);
		    	labelEliminar1.setText(null);
		    	labelModificar1.setText(null);
		    	int id=Integer.parseInt(JOptionPane.showInputDialog("Introduce el id a eliminar"));
		    	
		    	//se comprueba imprimiendo el id en la pantalla del sistema para probarlo
		    	System.out.println(id);

		    	Raza raz=new Raza();
				raz.setId(id);
				
				try{
					

					DAODatos dao=new DAODatosImpl();
					dao.eliminar(raz);
					
					//se imprime el mensaje en la pantalla del sistema
					System.out.println("Eliminado el id "+ id + " ");
					
					labelEliminar1.setText("El id ha sido eliminado");

=======

								
							}catch (Exception w) {
								System.out.println(w.getMessage());
							}	
							
							
						}catch(Exception o) {
							
							labelcatch.setText(o.getMessage());
						}
					}
				    
				});
		
			//botón elfo
				botonElfo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
				
						//vaciar label
						razaElegida.setText(null);
				    	labelEliminar1.setText(null);
				    	labelModificar1.setText(null);
						
						try {
							
							Armas armas = new Armas();
							Raza razas = new Raza();
							
							//elegimos la raza
							razas.elegirRaza(3);
							
							Raza raz=new Raza();
							
							raz.setArma(armas.armaAtaqueAleatoria);
							raz.setRaza(razas.elegirRaza(3));
							
							try {
								DAODatos dao=new DAODatosImpl();
								dao.registrar(raz);
								
								
								razaElegida.setText("Has ingresado un nuevo usuario con raza "+razas.elegirRaza(3)+" y "+armas.armaAtaqueAleatoria+" como arma aleatoria");

								
							}catch (Exception w) {
								System.out.println(w.getMessage());
							}	
							
							
						}catch(Exception o) {
							
							labelcatch.setText(o.getMessage());
						}
					}
				    
				});
		
		
		
		
		
		//**************************************SEGUNDA PARTE DE LA APP********************************//
		
		//botón listar base de datos
		botonListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		
				
				//vaciar label
		    	razaElegida.setText(null);
		    	labelEliminar1.setText(null);
		    	labelModificar1.setText(null);
				
				try {
					
					DAODatos dao=new DAODatosImpl();
					
					for(Raza r:dao.listar()) {
						
						textof.setText(r.getId()+"      "+r.getArma()+"      "+r.getRaza());
					}
					
				}catch(Exception o) {
					
					labelcatch.setText(o.getMessage());
				}
			}
		    
		});	
		
		
		
		
		//botón modificar en base de datos
		botonModificar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    	//vaciar label
		    	razaElegida.setText(null);
		    	labelEliminar1.setText(null);
		    	labelModificar1.setText(null);
		    	
		    	int idi=Integer.parseInt(JOptionPane.showInputDialog("Introduce el id a modificar"));
		    	
		    	//se comprueba imprimiendo el id en la pantalla del sistema para probarlo
		    	System.out.println(idi);
		    	
		    	Raza raze=new Raza();
				raze.setId(idi);
								
				String ent2=JOptionPane.showInputDialog("Introduce la nueva arma");
				raze.setArma(ent2);
								
				String ent3=JOptionPane.showInputDialog("Introduce la nueva raza");
				raze.setRaza(ent3);

				try{
					
					DAODatos dao=new DAODatosImpl();
					dao.modificar(raze);
					
					labelModificar1.setText("El id ha sido eliminado");


				}catch(Exception i) {
					
					labelcatch.setText(i.getMessage());
				}
		    	
		    	
		    	
		    	
		    	
		    }
		});	
		
		
		
		
		//botón eliminar en base de datos
		botonEliminar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
				
		    	//vaciar label
		    	razaElegida.setText(null);
		    	labelEliminar1.setText(null);
		    	labelModificar1.setText(null);
		    	int id=Integer.parseInt(JOptionPane.showInputDialog("Introduce el id a eliminar"));
		    	
		    	//se comprueba imprimiendo el id en la pantalla del sistema para probarlo
		    	System.out.println(id);

		    	Raza raz=new Raza();
				raz.setId(id);
				
				try{
					

					DAODatos dao=new DAODatosImpl();
					dao.eliminar(raz);
					
					//se imprime el mensaje en la pantalla del sistema
					System.out.println("Eliminado el id "+ id + " ");
					
					labelEliminar1.setText("El id ha sido eliminado");

>>>>>>> master
				}catch(Exception u) {
					
					labelcatch.setText(u.getMessage());
				}
		    	
		    	
		    	
		    	
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
