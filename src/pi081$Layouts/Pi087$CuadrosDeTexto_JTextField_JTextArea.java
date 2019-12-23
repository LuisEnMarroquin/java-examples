package pi081$Layouts; // "JTextField" y "JTextButton" extends from 'JTextComponent'

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pi087$CuadrosDeTexto_JTextField_JTextArea {

	public static void main(String[] args) {
		
		MarcoTexto3 marco = new MarcoTexto3();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoTexto3 extends JFrame {
	public MarcoTexto3() {
		setBounds(600,300,600,350);
		LaminaTexto3 lamina = new LaminaTexto3();
		add(lamina);
		setVisible(true);
	}
}

class LaminaTexto3 extends JPanel {
	
	public LaminaTexto3() {
		
		setLayout(new BorderLayout()); // Setting Layout for this 'Panel'
		
		JPanel lamina2 = new JPanel();
		lamina2.setLayout(new FlowLayout());
		
		resultado = new JLabel("", JLabel.CENTER); // 'resultado' is declared in bottom of class 'LaminaTexto3' // ("text", HorizontalAlign)
		
		JLabel texto = new JLabel("Email: "); // Creating TextLabel
		lamina2.add(texto); // Adding TextLabel to 'lamina2'
		
		campo = new JTextField(20); // Instancing TextField that's outside this constructor
		lamina2.add(campo); // Adding TextField to 'lamina2'
		
		add(resultado, BorderLayout.CENTER); // Adding resultado to 'lamina' on 'CENTER'
		
		JButton boton = new JButton("Comprobar"); // Creating button
		DameTexto evento = new DameTexto(); // Instancing internal class 'DameTexto'
		boton.addActionListener(evento); // Adding 'ActionListener' to 'boton'. Now 'boton' is listening to an action
		lamina2.add(boton); // Adding button to 'lamina2'
		
		add(lamina2, BorderLayout.NORTH); // Adding 'lamina2' to 'lamina' on 'NORTH'
		
		
	}
	
	private class DameTexto implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int cantidadDeArrobas = 0;
			String email = campo.getText().trim();

			for(int i = 0; i<email.length(); i++) {
				if(email.charAt(i) == '@') {
					cantidadDeArrobas++;
				}
			}
			
			if(cantidadDeArrobas != 1) {
				resultado.setText("Incorrecto");
				System.out.println("Email incorrecto");
			} else {
				resultado.setText("Correcto");
				System.out.println("Email correcto");
			}
			
		}
	}
	
	private JTextField campo;
	private JLabel resultado;
	
}
