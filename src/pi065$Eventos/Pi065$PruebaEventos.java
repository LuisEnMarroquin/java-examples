package pi065$Eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //Para interfaz 'ActionListener'

public class Pi065$PruebaEventos {

	public static void main(String[] args) {
		
		MarcoConBotones mimarco = new MarcoConBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConBotones extends JFrame {
	
	public MarcoConBotones() {
		
		setTitle("Botones y Eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaConBotones milamina = new LaminaConBotones();
		
		add(milamina);
		
	}
	
}

class LaminaConBotones extends JPanel implements ActionListener{ //La interfaz 'ActionListener' pertenece a 'java.awt.event.*;'
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaConBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		//El objeto al que se hace referencia debe implementar a fuerzas al interfaz 'ActionListener'
		botonAzul.addActionListener(this); 
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
		
	}
	
	@Override //El método 'actionPerformed' pertenece a la interfaz 'ActionListener'
	public void actionPerformed(ActionEvent e) { //Al hacer click en el botón Java contruye un evento que viene a almacenarse dentro.
		
		Object botonPulsado = e.getSource(); //OBTENIENDO QUIEN FUE EL DESENCADENANDTE DE LA ACCIÓN
		
		if(botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		}else if(botonPulsado == botonAmarillo) {
			setBackground(Color.YELLOW);
		}else if(botonPulsado == botonRojo) {
			setBackground(Color.RED);
		}
		
	}
	
}
