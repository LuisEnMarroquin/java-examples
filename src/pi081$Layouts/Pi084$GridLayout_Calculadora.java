package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pi084$GridLayout_Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora2 marco = new MarcoCalculadora2();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoCalculadora2 extends JFrame {
	public MarcoCalculadora2() {
		
		setTitle("Calculadora");
		setBounds(500,300,450,300); // Could be replaced by 'pack()' is not the same
		
		LaminaCalculadora2 lamina = new LaminaCalculadora2();
		add(lamina);
		//pack(); // Window size adapts to the size of the elements inside of it
		
	}
}

class LaminaCalculadora2 extends JPanel {
	public LaminaCalculadora2() {
		principio = true; // This is for class 'InsertaNumero'
		
		setLayout(new BorderLayout()); // Using BorderLayouy
		/*JButton*/ pantalla = new JButton("0"); // Creating button // Created outside constructor to use it on method 'InsertaNumero'
		pantalla.setEnabled(false); // Disabling button to show it as display
		add(pantalla, BorderLayout.NORTH); // Choosing NORTH zone in BorderLayout
		
		// Creating a second layout
		// JPanel lamina2 = new JPanel(); // Declaration moved outside constructor to use it in the method used to add the buttons
		lamina2 = new JPanel(); // Replaces upper line 
		lamina2.setLayout(new GridLayout(4,4)); // Choosing GridLayout inside 'lamina2'
		
		ActionListener insertar = new InsertaNumero(); // Instance of class 'InsertaNumero()'
		// Adding buttons by calling the method outside constructor
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		//ponerBoton("/");
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		//ponerBoton("*");
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		//ponerBoton("-");
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		//ponerBoton("=");
		//ponerBoton("+");
		add(lamina2, BorderLayout.CENTER); // Putting 'lamina2' as BorderLayout.CENTER inside window
		
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
	} private boolean principio; // A boolean variable is 'false' by default
}

