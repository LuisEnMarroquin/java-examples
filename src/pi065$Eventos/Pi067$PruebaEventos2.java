package pi065$Eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //Para interfaz 'ActionListener'

public class Pi067$PruebaEventos2 {

	public static void main(String[] args) {
		
		MarcoBotones mimarco = new MarcoBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotones milamina = new LaminaBotones();
		
		add(milamina);
		
	}
	
}

class LaminaBotones extends JPanel{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		
		//El objeto al que se hace referencia debe implementar a fuerzas al interfaz 'ActionListener'
		botonAzul.addActionListener(Azul); 
		botonAmarillo.addActionListener(Rojo);
		botonRojo.addActionListener(Amarillo);
		
	}
	
	private class ColorFondo implements ActionListener{ //La interfaz 'ActionListener' pertenece a 'java.awt.event.*;'
		
		//Contructor
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
		
	}

}
