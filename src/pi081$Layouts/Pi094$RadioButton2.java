package pi081$Layouts; // This is the same as 'Pi094$RadioButton' only with a few syntaxis changes

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Pi094$RadioButton2 {

	public static void main(String[] args) {
		
		MarcoRadio3 marco = new MarcoRadio3();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRadio3 extends JFrame {
	public MarcoRadio3() {
		setVisible(true);
		setBounds(550, 300, 500, 350);
		LaminaRadio3 lamina = new LaminaRadio3();
		add(lamina);
	}
}

class LaminaRadio3 extends JPanel {
	
	public LaminaRadio3() {
		
		setLayout(new BorderLayout()); // Setting 'BorderLayout' for this JPanel 'LaminaRadio3'
		
		texto = new JLabel("Esto es el texto"); // Creating JLabel 'texto'
		texto.setFont(new Font("Serif", Font.PLAIN, 12)); // Setting text properties
		add(texto, BorderLayout.CENTER); // Adding 'texto' to CENTER of JPanel 'LaminaRadio3'
		
		// Initializing both variables declared on the bottom of the class
		LaminaBotones = new JPanel();
		grupo = new ButtonGroup();
		
		ColocarBotones("Pequeño", false, 10);
		ColocarBotones("Mediano", true, 12);
		ColocarBotones("Grande", false, 18);
		ColocarBotones("Muy Grande", false, 24);
		
		add(LaminaBotones, BorderLayout.SOUTH); // Adding 'LaminaBotones' (that contains all buttons) to the SOUTH of JPanel 'LaminaRadio3'
		
	}
	
	// Method to create buttons
	public void ColocarBotones(String nombre, boolean seleccionado, final int tamagno) { // 'tamagno' is a constant because is used inside a method and it requires to be a 'constant'
		
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		
		grupo.add(boton); // Adding 'JRadioButton' to the Group
		
		LaminaBotones.add(boton); // Adding 'JRadioButton' to the Panel
		
		ActionListener evento = new ActionListener() { // Creating 'evento' to listen
			@Override
			public void actionPerformed(ActionEvent arg0) {
				texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
			}
		};
		
		boton.addActionListener(evento); // Putting 'evento' to listen
		
	}
	
	private JLabel texto; // TextArea
	private JRadioButton boton1, boton2, boton3, boton4; // RadioButtons
	private ButtonGroup grupo; // ButtonGroup to group all RadioButtons
	private JPanel LaminaBotones; // Creating a Panel for RadioButtons
	
}	