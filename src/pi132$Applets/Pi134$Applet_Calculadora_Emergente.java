package pi132$Applets; // NO TERMINADO VIDEO 134, 135 Y 136 // APPLETS DISCONTINUED

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pi134$Applet_Calculadora_Emergente extends JApplet{ // Original file al Pi085$GridLayout_Calculadora

	public void init() {
		
		JFrame marco = new JFrame();
		marco.setSize(500, 300);
		LaminaCalculadora lamina = new LaminaCalculadora(); // Instancing class 'LaminaCalculadora'
		marco.add(lamina);
		
		JButton botonCalculadora = new JButton("Calculadora");
		add(botonCalculadora);

	}

}

class LaminaCalculadora extends JPanel {
	public LaminaCalculadora() {
		principio = true; // This is for class 'InsertaNumero'
		
		setLayout(new BorderLayout()); // Using BorderLayouy
		/*JButton*/ pantalla = new JButton("0"); // Creating button // Created outside constructor to use it on method 'InsertaNumero'
		pantalla.setEnabled(false); // Disabling button to show it as display
		add(pantalla, BorderLayout.NORTH); // Choosing NORTH zone in BorderLayout
		
		// Creating a second layout
		// JPanel lamina2 = new JPanel(); // Declaration moved outside constructor to use it in the method used to add the buttons
		lamina2 = new JPanel(); // Replaces upper line 
		lamina2.setLayout(new GridLayout(4,4)); // Choosing GridLayout inside 'lamina2'
		
		ActionListener insertar = new InsertaNumero(); // Instance of class 'InsertaNumero()' for numbers
		ActionListener simbolos = new SimbolosDeOperaciones(); // Instance of class 'SimbolosDeOperaciones()' for symbols
		// Adding buttons by calling the method outside constructor
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", simbolos);
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", simbolos);
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", simbolos);
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", simbolos);
		ponerBoton("+", simbolos);
		add(lamina2, BorderLayout.CENTER); // Putting 'lamina2' as BorderLayout.CENTER inside window
		
		ultimoSimbolo = "="; // Used on class 'SimbolosDeOperaciones' on method 'actionPerformed' to define first symbol as "=" and equals don't be 'null'
	}
	
	private JPanel lamina2;
	
	// Creating a method to add buttons to Calculator
	private void ponerBoton(String rotulo, ActionListener oyente) { // 'rotulo' text inside button and 'oyente' to put buttons to listen
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente); // Button listening
		lamina2.add(boton);
	}
	
	private JButton pantalla;
	
	private class InsertaNumero implements ActionListener { // Method that's listening for user to press buttons
		@Override
		public void actionPerformed(ActionEvent e) {
			String entrada = e.getActionCommand(); // Returns String associated to button
			
			// Put '0' away when you press a key because it's on first place on screen // REQUIRES 'principio' boolean
			if(principio) {
				pantalla.setText("");
				principio = false; // 'principio' was turn into true on first line
			}
			
			pantalla.setText(pantalla.getText() + entrada); // Prints text to 'pantalla'
		} 
	} 
	
	private boolean principio; // A boolean variable is 'false' by default // Used on clases "InsertaNumero" and "SimbolosDeOperaciones"
	
	private class SimbolosDeOperaciones implements ActionListener { // Method used for calculator symbols ( + - * / = )
		@Override
		public void actionPerformed(ActionEvent e) {
			String operacion = e.getActionCommand(); // Saves a String in var 'operation' that equals the button text // System.out.println(operacion);
			calcular(Double.parseDouble(pantalla.getText())); // Calling method 'calcular()' and giving it as a parameter the text inside display turned into a 'double'
			ultimoSimbolo = operacion; // Saving 'operation' into 'ultimoSimbolo'			/* This line can't go upper to 'calcular()' the calc wont work */
			principio = true; // This will cause display to reset (clean)
		}
		public void calcular(double x) { // Method for operations
			if(ultimoSimbolo.equals("+")) {
				resultado += x; 
			} else if(ultimoSimbolo.equals("-")) {
				resultado -= x; 
			} else if(ultimoSimbolo.equals("*")) {
				resultado *= x; 
			} else if(ultimoSimbolo.equals("/")) {
				resultado /= x; 
			} else if(ultimoSimbolo.equals("=")) {
				resultado = x; 
			}
			pantalla.setText("" + resultado); // ("" +) is used to turn the double 'resultado' to String
		}
	}
	
	private double resultado; // Used to save numbers before a symbol is pressed
	private String ultimoSimbolo; // Used to save the last symbol that was pressed
	
}

