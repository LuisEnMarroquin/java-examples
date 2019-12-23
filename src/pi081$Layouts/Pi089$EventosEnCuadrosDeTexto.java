package pi081$Layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Pi089$EventosEnCuadrosDeTexto {

	public static void main(String[] args) {
		
		MarcoPassword marco = new MarcoPassword();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPassword extends JFrame {
	
	public MarcoPassword() {
		
		setBounds(400, 300, 550, 400);
		
		LaminaPassword lamina = new LaminaPassword();
		
		add(lamina);
		
		setVisible(true);
		
	}
	
}

class LaminaPassword extends JPanel {
	
	public LaminaPassword() {
		
		setLayout(new BorderLayout()); // Setting Border Layout: NORTH, SOUTH, EAST, WEST AND CENTER
		
		JPanel parteNorth = new JPanel(); // Instance of JPanel
		parteNorth.setLayout(new GridLayout(2,2)); // Setting GridLayout on North part of BorderLayout
		add(parteNorth, BorderLayout.NORTH); // Adding Layout
		
		JLabel etiqueta1 = new JLabel("User"); // Normal Text
		JLabel etiqueta2 = new JLabel("Password"); // Normal text
		
		JTextField c_user = new JTextField(15); // Input text
		/*JPasswordField*/ c_pass = new JPasswordField(15); // Input text for Password, the only difference is that it shows * instead of characters
		
		CompruebaPassword evento = new CompruebaPassword(); // Instance of 'CompruebaPassword' for 'evento'
		c_pass.getDocument().addDocumentListener(evento); // 'CompruebaPassword' is now listening for changes on 'c_pass'
		
		parteNorth.add(etiqueta1);
		parteNorth.add(c_user);
		parteNorth.add(etiqueta2);
		parteNorth.add(c_pass);
		
		JButton enviar = new JButton("Enviar"); // Creating button
		add(enviar, BorderLayout.SOUTH); // Adding button on SOUTH of BorderLayout
		
	}
	
	private class CompruebaPassword implements DocumentListener { // This class is used to verify password to be between 8 and 12 characters

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			
			
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) { // This method is executed every time user writes something
			
			char[] contra; // Creando un Array de 'char' llamado 'contra'
			contra = c_pass.getPassword(); // Almacenando los caracteres de la contraseña en el Array // This is because it returns an Array with 'char'
			
			if(contra.length<8 || contra.length>12) {
				c_pass.setBackground(Color.RED);
			} else {
				c_pass.setBackground(Color.WHITE);
			}
			
		}

		@Override // This code is the same as the code inside 'insertUpdate'
		public void removeUpdate(DocumentEvent arg0) { // This method is executed every time user deletes something
			
			char[] contra; // Creando un Array de 'char' llamado 'contra'
			contra = c_pass.getPassword(); // Almacenando los caracteres de la contraseña en el Array // This is because it returns an Array with 'char'
			
			if(contra.length<8 || contra.length>12) {
				c_pass.setBackground(Color.RED);
			} else {
				c_pass.setBackground(Color.WHITE);
			}
			
			
		}
		
	}
	
	JPasswordField c_pass; // For password
	
}
