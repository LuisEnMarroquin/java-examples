package pi065$Eventos;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Pi074$EventosDeFoco {

	public static void main(String[] args) {
		
		MarcoFoco mimarco = new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setVisible(true);
		
		setBounds(300,300,600,450);
		
		add(new LaminaFoco());
		
	}
	
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null); //Por defecto Java determina una posición por defecto centrada a los nuevos elementos, con esta función se elimina ese 'Layout'

		//Instanciando los cuadros de texto que están bajo este método
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		
		//Asignandole tamaño a los cuadros de texto.
		cuadro1.setBounds(120,10,150,20);
		cuadro2.setBounds(120,50,150,20);
		
		//Agregando los cuadros de texto a la lámina
		add(cuadro1);
		add(cuadro2);
		
		//Instanciando la clase oyente 'TieneElFoco' para 'cuadro1'
		TieneElFoco Foco = new TieneElFoco();
		cuadro1.addFocusListener(Foco);
		
	}
	
	//Agregando cuadros de texto con 'JTextField'
	JTextField cuadro1;
	JTextField cuadro2;
	
	//Poniendo esta clase como clase interna para que pueda acceder a los cuadros de texto. Y poniendola como private porque es bueno encapsularla.
	private class TieneElFoco implements FocusListener{ //Se implementan los 2 métodos pertenecientes a la interfaz.

		@Override
		public void focusGained(FocusEvent arg0) {
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			System.out.println("Has perdido el foco");
		}
		
	}
	
}
