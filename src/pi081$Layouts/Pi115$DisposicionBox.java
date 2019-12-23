package pi081$Layouts;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pi115$DisposicionBox {

	public static void main(String[] args) {
		
		MarcoCaja marco = new MarcoCaja();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}

}

class MarcoCaja extends JFrame{
	
	public MarcoCaja() {
		
		setTitle("Marco en la caja");
		
		setBounds(600, 350, 350, 350); // ( distanceX, distanceY, sizeX, sizeY )
		
		JLabel rotulo1 = new JLabel("Nombre"); // Just text
		
		JTextField texto1 = new JTextField(10); // Text field with a size of 10 px
		texto1.setMaximumSize(texto1.getPreferredSize()); // Avoid 'texto1' to resize
		
		Box cajaHor1 = Box.createHorizontalBox(); // Creating an horizontal box
		
		cajaHor1.add(rotulo1); // Adding 'rotulo1' to 'cajaHor1'
		
		cajaHor1.add(Box.createHorizontalStrut(10)); // Adding space of 10 px to 'cajaHor1' (it won't vary)
		
		cajaHor1.add(texto1); // Adding 'texto1' to 'cajaHor1'
		
		JLabel rotulo2 = new JLabel("Contraseña"); // Just text
		
		JTextField texto2  = new JTextField(10); // Text field with a size of 10 px
		texto2.setMaximumSize(texto2.getPreferredSize()); // Avoid 'texto12' to resize
		
		Box cajaHor2 = Box.createHorizontalBox(); // Creating an horizontal box
		
		cajaHor2.add(rotulo2);
		
		cajaHor2.add(Box.createHorizontalStrut(10)); // Adding space of 10 px to 'cajaHor2' (it won't vary)
		
		cajaHor2.add(texto2); // Adding 'texto2' to 'cajaHor2'
		
		JButton boton1 = new JButton("OK"); // Creating new button
		JButton boton2 = new JButton("Cancelar"); // Creating new button
		
		Box cajaHor3 = Box.createHorizontalBox(); // Creating an horizontal box
		
		cajaHor3.add(boton1); // Adding button to 'cajaHor3'
		
		cajaHor3.add(Box.createGlue()); // Creates a glue (I think that only keeps the 2 elements away)
		
		cajaHor3.add(boton2); // Adding button to 'cajaHor3'
		
		Box cajaVer = Box.createVerticalBox(); // Creating vertical box
		
		cajaVer.add(cajaHor1); // Adding horizontal boxes to vertical box
		cajaVer.add(cajaHor2);
		cajaVer.add(cajaHor3);
		
		add(cajaVer, BorderLayout.CENTER); // Adding 'cajaVer' to this JFrame 'MarcoCaja' on CENTER
		
	}
	
}
